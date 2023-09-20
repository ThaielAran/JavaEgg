package entities;

import java.time.LocalDate;

public abstract class Persona {

	/*Numero de orden (Cada integrante tiene un numero de orden)
Apellido
Nombre
Fecha de nacimiento
DNI
Sexo
Vinculo (Si es Madre, Padre, Hijo/a, Abuelo/a).*/
	
	protected int numeroOrden;
	protected String apellido;
	protected String nombre;
	protected LocalDate nacimiento;
	protected int dni;
	protected String sexo;
	protected String vinculo;
	protected ProblemaSalud problema;
	protected AbordajeNutric abordaje;
	protected Familia famili;
	
	public Persona() {
	}
	public Persona(int numeroOrden, String apellido, String nombre, LocalDate nacimiento, int dni, String sexo,
			String vinculo, ProblemaSalud problema, AbordajeNutric abordaje, Familia famili) {
		this.numeroOrden = numeroOrden;
		this.apellido = apellido;
		this.nombre = nombre;
		this.nacimiento = nacimiento;
		this.dni = dni;
		this.sexo = sexo;
		this.vinculo = vinculo;
		this.problema = problema;
		this.abordaje = abordaje;
		this.famili = famili;
	}
	
	public int getNumeroOrden() {
		return numeroOrden;
	}
	public void setNumeroOrden(int numeroOrden) {
		this.numeroOrden = numeroOrden;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(LocalDate nacimiento) {
		this.nacimiento = nacimiento;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getVinculo() {
		return vinculo;
	}
	public void setVinculo(String vinculo) {
		this.vinculo = vinculo;
	}
	public ProblemaSalud getProblema() {
		return problema;
	}
	public void setProblema(ProblemaSalud problema) {
		this.problema = problema;
	}
	public AbordajeNutric getAbordaje() {
		return abordaje;
	}
	public void setAbordaje(AbordajeNutric abordaje) {
		this.abordaje = abordaje;
	}
	public Familia getFamili() {
		return famili;
	}
	public void setFamili(Familia famili) {
		this.famili = famili;
	}
	
	
}
