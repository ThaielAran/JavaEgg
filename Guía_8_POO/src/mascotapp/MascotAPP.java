package mascotapp;

import java.util.Scanner;

import mascotapp.entidades.Mascota;

public class MascotAPP {

	public static void main(String[]args) {

		Scanner leer=new Scanner(System.in);
		
		Mascota m1 = new Mascota("Fernando Chiquito", "Perro", leer.nextInt());
	
		leer.close();
		System.out.println(m1.apodo +" "+ m1.edad +" "+ m1.tipo);
	}
}
