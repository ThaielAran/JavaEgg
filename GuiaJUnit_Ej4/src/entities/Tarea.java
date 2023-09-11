package entities;

public class Tarea {

	private String nombre;
	private int duracion;
	private boolean asignada;
	
	public Tarea(String nombre, int duracion, boolean asignada) {
		this.nombre = nombre;
		this.duracion = duracion;
		this.asignada = asignada;
	}
	public Tarea() {
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public boolean isAsignada() {
		return asignada;
	}
	public void setAsignada(boolean asignada) {
		this.asignada = asignada;
	}
	
	public String toString() {
		return "Tarea [nombre=" + nombre + ", duracion=" + duracion + ", asignada=" + asignada + "]";
	}
	
}
