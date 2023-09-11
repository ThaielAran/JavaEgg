package services;

import java.util.Scanner;

import figuras.Cuadrado;

public class ServiceCuadrado {

	public Cuadrado crearCuadrado() {
		Scanner s=new Scanner(System.in);
		Cuadrado c=new Cuadrado();
		System.out.println("Ingrese el lado");
		c.setLado(s.nextDouble());
		s.close();
		return c;
	}
	
	public double calcularArea(Cuadrado c){
		double area=c.getLado()*c.getLado();
		return area;
	}
	
	public double calcularPerimetro(Cuadrado c){
		double perimetro=c.getLado()*4;
		return perimetro;
	}
}
