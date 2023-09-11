package entities;
//nombre, raza, edad y tamaño
public class Perro {

	private String nombre;
	private String raza;
	private int edad;
	private String tamaño;
	
	public Perro(String nombre, String raza, int edad, String tamaño) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.tamaño = tamaño;
	}
	public Perro() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	@Override
	public String toString() {
		return "Perro " + nombre + ", " + raza + ", " + edad + " anios, " + tamaño;
	}
	
}
