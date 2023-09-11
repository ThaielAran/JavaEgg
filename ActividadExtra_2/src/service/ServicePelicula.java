package service;

import java.util.Scanner;

import entidades.Pelicula;

//Crear Película, Listar todas las películas disponibles,Buscar una película por título (Decir si se existe o no)
//Buscar una película por género (Decir si se existe o no)

/*private String titulo;
private String genero;
private int anio;
private int duracion;*/

public class ServicePelicula {

	public Pelicula [] pelis=new Pelicula [5];
	
	public Pelicula crearPelicula() {
		Pelicula peli=new Pelicula();
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese el titulo de la pelicula");
		peli.setTitulo(s.nextLine());
		System.out.println("Ingrese el genero de la pelicula");
		peli.setGenero(s.next());
		do {
			System.out.println("Ingrese el anio de la pelicula");
			peli.setAnio(s.nextInt());
		} while (peli.getAnio()<1895);
		System.out.println("Ingrese la duracion de la pelicula");
		peli.setDuracion(s.nextInt());
		return peli;
	}
	public void cargarPelicula(int cont) {
		pelis[cont]=crearPelicula();
	}
	public void listarPeliculas(int cont) {
		for(int i=0;i<cont;i++)
			System.out.println(pelis[i].toString());
	}
	public void buscarPorTitulo(String titulo, int cont) {
		int i=0;
		while(i<cont) {
			if(pelis[i].getTitulo().toLowerCase().equals(titulo.toLowerCase())) {
				System.out.println("La pelicula se encuentra disponible");
				break;
			}
			i++;
		}
		if (i==cont)
			System.out.println("La pelicula no se encuentra disponible");
	}
	public void buscarPorGenero(String genero) {
		int i=0;
		while(i<5) {
			if(pelis[i].getGenero().toLowerCase().equals(genero.toLowerCase())) {
				System.out.println("La pelicula se encuentra disponible");
				break;
			}
			i++;
		}
		if (i==5)
			System.out.println("La pelicula no se encuentra disponible");
	}
}
