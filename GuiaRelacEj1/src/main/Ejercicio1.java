package main;

import entities.Perro;
import entities.Persona;

/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.*/

public class Ejercicio1 {

	public static void main(String[]args) {
		
		Perro guau1=new Perro("Puqi","Beagle",4,"mediano");
		Persona p1=new Persona("Juan", "Gomez", 21, 452345678, guau1);
		Perro guau2=new Perro("Pepe","PP",3,"grande");
		Persona p2=new Persona("Gustavo", "Camaño", 21, 452345678, guau2);
		Persona p3=new Persona("Pedro", "America", 21, 452345678);
		Persona p4=new Persona("Sabrina", "Sanchez", 21, 452345678);
		
		p3.setPerro(guau1);
		p4.setPerro(guau2);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
	}
}
