package service;

import java.util.ArrayList;
import java.util.Scanner;

import entities.CantanteFamoso;

public class ServiceCantantes {

	public static Scanner s=new Scanner(System.in);
	
	public CantanteFamoso agregarCantante() {
		CantanteFamoso cant=new CantanteFamoso();
		System.out.println("Ingrese el nombre del cantante");
		cant.setNombre(s.nextLine());
		System.out.println("Ingrese su disco mas vendido");
		cant.setDiscoConMasVentas(s.nextLine());
		return cant;
	}
	public void mostrarCantantes(CantanteFamoso cant) {
		System.out.println(cant.toString());
	}
	public void modificarCantante(CantanteFamoso cant) {
		System.out.println("Ingrese el nombre del cantante");
		cant.setNombre(s.nextLine());
		System.out.println("Ingrese su disco mas vendido");
		cant.setDiscoConMasVentas(s.nextLine());
	}
	public int buscarCantante(ArrayList<CantanteFamoso> lista, String name) {
		int pos=-1;
		for(CantanteFamoso i: lista) {
			pos++;
			if(i.getNombre().equalsIgnoreCase(name)) {
				return pos;
			}
		}
		return -1;
	}
}
