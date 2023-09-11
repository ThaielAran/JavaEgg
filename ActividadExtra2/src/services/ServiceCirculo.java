package services;

import java.util.Scanner;

import figuras.Círculo;

public class ServiceCirculo {

	public Círculo crearCirculo() {
		Scanner s=new Scanner(System.in);
		Círculo c=new Círculo();
		System.out.println("Ingrese el radio");
		c.setRadio(s.nextDouble());
		s.close();
		return c;
	}
	
}
