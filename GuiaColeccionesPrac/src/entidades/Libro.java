package entidades;

import java.util.Scanner;

public class Libro {

	private String titulo;

	public Libro() {
	}
	public Libro(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + "]";
	}
	
	Scanner s=new Scanner(System.in);
	
	public Libro createLibro() {
		System.out.println("Ingrese el título del libro");
		Libro l=new Libro();
		l.setTitulo(s.nextLine());
		return l;
	}
}
