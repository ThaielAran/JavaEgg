package service;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Persona;

public class ServicePersona {

	public ArrayList<Persona> listaPersonas=new ArrayList<Persona>();
	static Scanner s=new Scanner(System.in).useDelimiter("\r\n");
	
	//Nombre, Edad, DNI, País
	public void crearPersona() {
		Persona p1=new Persona();
		System.out.println("Ingrese el nombre de la persona");
		p1.setNombre(s.next());
		System.out.println("Ingrese la edad");
		p1.setEdad(s.nextInt());
		System.out.println("Ingrese el DNI");
		p1.setDni(s.nextInt());
		System.out.println("Ingrese el pais");
		p1.setPais(s.next());
		listaPersonas.add(p1);
	}
	public void mostrarPersonas() {
		for(int i=0;i<listaPersonas.size();i++) {
			System.out.println(i+"."+listaPersonas.get(i).toString());
		}
	}
	public void modificarPersona() {
		String name;
		System.out.println("Ingrese el nombre de la persona a modificar");
		name=s.nextLine();
		for(Persona i:listaPersonas) {
			if(i.getNombre().equals(name)) {
				System.out.println("Ingrese el nombre de la persona");
				i.setNombre(s.next());
				System.out.println("Ingrese la edad");
				i.setEdad(s.nextInt());
				System.out.println("Ingrese el DNI");
				i.setDni(s.nextInt());
				System.out.println("Ingrese el pais");
				i.setPais(s.next());
			}
		}
	}
	public void eliminarPersona() {
		String name;
		System.out.println("Ingrese el nombre de la persona a eliminar");
		name=s.nextLine();
		for(int i=0;i<listaPersonas.size();i++) 
			if(listaPersonas.get(i).getNombre().equals(name))
				listaPersonas.remove(i);
	}
}
