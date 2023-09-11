package entidades;

import java.util.Scanner;

public class Operacion {

	private double numero1;
	private double numero2;
	
	public Operacion() {
	}
	
	public Operacion(double numero1, double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}
	
	public Operacion crearOperacion() {
		Operacion o=new Operacion();
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese un numero");
		o.setNumero1(s.nextDouble());
		System.out.println("Ingrese otro numero");
		o.setNumero2(s.nextDouble());
		s.close();
		return o;
	}
	
	public double sumar(Operacion o) {
		return o.numero1+o.numero2;
	}
	public double restar(Operacion o) {
		return o.numero1-o.numero2;
	}
	public double multiplicar(Operacion o) {
		if (o.numero1==0 || o.numero2==0) {
			System.out.println("Uno de los valores es invalido para esta operacion");
			return 0;
		}else {
			return o.numero1*o.numero2;
		}
	}
	public double dividir(Operacion o) {
		if (o.numero1==0 || o.numero2==0) {
			System.out.println("Uno de los valores es invalido para esta operacion");
			return 0;
		}else {
			return o.numero1/o.numero2;
		}
	}
}
