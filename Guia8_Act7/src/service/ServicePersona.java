package service;

import java.util.Scanner;

import entidades.Persona;

public class ServicePersona {
	
	public Persona crearPersona() {
		String name;
		char sex;
		int age;
		float weight, height;
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese el nombre");
		name=s.nextLine();
		System.out.println("Ingrese la edad");
		age=s.nextInt();
		System.out.println("Ingrese el sexo (Hombre, Mujer u Otro)");
		sex=s.next().toUpperCase().charAt(0);
		while(sex!='H' && sex!='M' && sex!='O') {
			System.out.println("Debe ingresar un sexo válido('H','M'u'O')");
			sex=s.next().toUpperCase().charAt(0);
		}
		System.out.println("Ingrese el peso");
		weight=s.nextFloat();
		System.out.println("Ingrese la altura");
		height=s.nextFloat();
		Persona p1=new Persona(name,age,sex,weight,height);
		return p1;
	}
	
	public byte calcularIMC(Persona p) {
		double imc=(p.getPeso()/Math.pow(p.getAltura(), 2));
		if (imc<20)
			return -1;
		else if (imc<25)
			return 0;
		else
			return 1;
	}
	
	public boolean esMayorDeEdad(Persona p) {
		return(p.getEdad()>18);
	}
}
