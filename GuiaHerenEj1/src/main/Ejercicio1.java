package main;

import entities.Animal;
import entities.Caballo;
import entities.Gato;
import entities.Perro;

/*Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:*/

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Animal perro1=new Perro("Cachilo", "Ozobuco", 8, "Pastor alemán");
		perro1.queCome();
		
		Animal perro2=new Perro("Nala", "Alim balanceado", 6, "PP");
		perro2.queCome();
		
		Animal gato= new Gato("Kaban", "Higado", 3, "Siberiano");
		gato.queCome();
		
		Animal caballo=new Caballo("Penumbra", "Heno", 5, "Percheron");
		caballo.queCome();
	}

}
