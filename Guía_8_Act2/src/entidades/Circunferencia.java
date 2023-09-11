package entidades;

import java.util.Scanner;

public class Circunferencia {

	private double radio;

	public Circunferencia(double radio) {
		super();
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public Circunferencia crearCircunferencia() {
		Circunferencia c1=new Circunferencia(radio);
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese el radio de la circunferencia");
		c1.setRadio(s.nextDouble());
		s.close();
		return c1;
	}
	public double area(Circunferencia c1) {
		return Math.pow(c1.getRadio(), 2)*Math.PI;
	}
	
	public double perimetro(Circunferencia c1) {
		return 2*Math.PI*c1.getRadio();
	}
}
