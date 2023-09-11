package entities;

import java.util.Objects;

//(Nombre, Edad, DNI, País)
public class Persona {

	private String nombre;
	private int edad;
	private int dni;
	private String pais;
	
	public Persona() {
	}
	public Persona(String nombre, int edad, int dni, String pais) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.pais = pais;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", pais=" + pais + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(dni, edad, nombre, pais);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return dni == other.dni && edad == other.edad && Objects.equals(nombre, other.nombre)
				&& Objects.equals(pais, other.pais);
	}
	
}
