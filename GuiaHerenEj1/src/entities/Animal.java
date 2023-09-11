package entities;

public class Animal {
//nombre, alimento, edad y raza 
	protected String nombre;
	protected String alimento;
	protected int edad;
	protected String raza;
	
	public Animal() {
		super();
	}
	public Animal(String nombre, String alimento, int edad, String raza) {
		super();
		this.nombre = nombre;
		this.alimento = alimento;
		this.edad = edad;
		this.raza = raza;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAlimento() {
		return alimento;
	}
	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public void queCome() {
		System.out.println("Comida:"+ this.alimento);
	}
}
