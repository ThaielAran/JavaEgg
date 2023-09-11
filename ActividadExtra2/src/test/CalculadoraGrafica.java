package test;

import java.util.Scanner;

import figuras.Cuadrado;
import figuras.Círculo;
import services.ServiceCirculo;
import services.ServiceCuadrado;

public class CalculadoraGrafica {

	public static void main(String[]args) {
		int opc;
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese una figura a calcular: \n1.Cuadrado \n2.Circulo \n3.Triangulo");
		opc=s.nextInt();
		switch (opc) {
		case 1:
			ServiceCuadrado servCuadrado=new ServiceCuadrado();
			Cuadrado c1=servCuadrado.crearCuadrado(); 
			System.out.println("Area = "+servCuadrado.calcularArea(c1));
			System.out.println("Perimetro = "+servCuadrado.calcularPerimetro(c1));
			System.out.println(c1.toString());
			break;
		case 2:
			ServiceCirculo servCirculo=new ServiceCirculo();
			Círculo cir1=servCirculo.crearCirculo();
			System.out.println("Area = "+cir1.calcularArea());
			System.out.println("Perimetro = "+cir1.calcularPerimetro());
			System.out.println(cir1.toString());
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		default:
			System.out.println("ERROR");
		}
		
		s.close();
	}
}
