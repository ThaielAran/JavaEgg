package entidades;

import java.util.Date;

//película alquilada, la fecha de inicio, la fecha de fin y el precio.

public class Alquiler {

	private String pelicula;
	private Date inicio;
	private Date fin;
	private double precio;
	
	public Alquiler() {
	}

	public Alquiler(String pelicula, Date inicio, Date fin, double precio) {
		this.pelicula = pelicula;
		this.inicio = inicio;
		this.fin = fin;
		this.precio = precio;
	}

	public String getPelicula() {
		return pelicula;
	}

	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFin() {
		return fin;
	}

	public void setFin(Date fin) {
		this.fin = fin;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Alquiler [" + pelicula + ", desde " + inicio + ", hasta " + fin + ", precio= $" + precio + "]";
	}
	
}
