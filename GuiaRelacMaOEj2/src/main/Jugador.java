package main;

public class Jugador {

	private String nombre;
	private String apellido;
	private int numero;
	private String posicion;
	
	public Jugador() {
	}
	public Jugador(String nombre, String apellido, int numero, String posicion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.numero = numero;
		this.posicion = posicion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", apellido=" + apellido + ", numero=" + numero + ", posicion=" + posicion
				+ "]";
	}
}
