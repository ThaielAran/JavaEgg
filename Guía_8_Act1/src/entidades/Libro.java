package entidades;

import java.util.Scanner;

public class Libro {

	//ISBN, Título, Autor, Número de páginas
	private int ISBN;
	private String titulo;
	private String autor;
	private int numeroDePaginas;
	
	public Libro() {
		super();
	}

	public Libro(int iSBN, String titulo, String autor, int numeroDePaginas) {
		super();
		ISBN = iSBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroDePaginas = numeroDePaginas;
	}
	
	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getTítulo() {
		return titulo;
	}

	public void setTitulo(String título) {
		this.titulo = título;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}

	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}

	@Override
	public String toString() {
		return "Libro [ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numeroDePaginas="
				+ numeroDePaginas + "]";
	}

	public Libro crearLibro() {
		Libro l1=new Libro();
		Scanner s= new Scanner(System.in);
		System.out.println("Ingrese el ISBN");
		l1.setISBN(s.nextInt());
		System.out.println("Ingrese el titulo (sin espacios)");
		l1.setTitulo(s.next());
		System.out.println("Ingrese el autor (sin espacios)");
		l1.setAutor(s.next());
		System.out.println("Ingrese el numero de pagina");
		l1.setNumeroDePaginas(s.nextInt());
		s.close();
		return l1;
	}
}
