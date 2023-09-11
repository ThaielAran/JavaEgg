package entities;

public class Rectangulo {

	//Atributos
	private double ancho;
	private double altura;
	private String color;
	private boolean active;
	
	//Constructores
	public Rectangulo() {
	}
	
	public Rectangulo(double ancho, double altura, String color, boolean active) {
		super();
		this.ancho = ancho;
		this.altura = altura;
		this.color = "verde";
		this.active = true;
	}
	//Getters & Setters

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
}
