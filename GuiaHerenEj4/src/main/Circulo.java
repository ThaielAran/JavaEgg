package main;

import entities.InterfazFiguras;

public class Circulo implements InterfazFiguras{

	private double radio;
	
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}
	@Override
	public double calcularArea() {	
		return Math.pow(PI * radio, 2);
	}
	@Override
	public double calcularPerimetro() {
		return PI * (radio*2);
	}
}
