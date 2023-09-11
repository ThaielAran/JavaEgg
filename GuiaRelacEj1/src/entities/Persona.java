package entities;

//nombre, apellido, edad, documento y Perro.

public class Persona {

	private String nombre;
	private String apellido;
	private int edad;
	private int documento;
	private Perro perro;
	
	public Persona(String nombre, String apellido, int edad, int documento, Perro perro) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.documento = documento;
		this.perro = perro;
	}
	public Persona() {
		super();
	}
	public Persona(String nombre, String apellido, int edad, int documento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.documento = documento;
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getDocumento() {
		return documento;
	}
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	public Perro getPerro() {
		return perro;
	}
	public void setPerro(Perro perro) {
		this.perro = perro;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento
				+ ", perro=" + perro + "]";
	}
	
}
