package entities;

/*título del libro, autor, número de ejemplares y número de ejemplares prestados.*/

public class Libro {

	private String titulo;
	private String autor;
	private int numEjemplares;
	private int numAlquilados;
	
	
	public Libro() {
	}
	public Libro(String titulo, String autor, int numEjemplares, int numAlquilados) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemplares = numEjemplares;
		this.numAlquilados = numAlquilados;
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumEjemplares() {
		return numEjemplares;
	}
	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}
	public int getNumAlquilados() {
		return numAlquilados;
	}
	public void setNumAlquilados(int numAlquilados) {
		this.numAlquilados = numAlquilados;
	}
	
	
	@Override
	public String toString() {
		return "Libro [" +titulo + "," + autor + ", Ejemplares:" + numEjemplares + ", Alquilados:"+ numAlquilados + "]";
	}
	
	
}
