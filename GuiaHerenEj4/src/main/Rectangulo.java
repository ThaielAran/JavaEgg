package main;

import entities.InterfazFiguras;

public class Rectangulo implements InterfazFiguras{

	private double l1;
	private double l2;
	
	public Rectangulo(double l1, double l2) {
		super();
		this.l1 = l1;
		this.l2 = l2;
	}
	@Override
	public double calcularArea() {
		return l1*l2;
	}
	@Override
	public double calcularPerimetro() {
		return (l1+l2)*2;
	}
}
