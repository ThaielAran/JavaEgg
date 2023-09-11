package utilidades;

import java.util.Comparator;

import entities.Pelicula;

public class Comparadores {

	public static Comparator<Pelicula> compararDuracionDecr=new Comparator<Pelicula>() {
		@Override
		public int compare(Pelicula p1,Pelicula p2) {
			return p2.getDuracion().compareTo(p1.getDuracion());
		}
	};
	public static Comparator<Pelicula> compararDuracionCrec=new Comparator<Pelicula>() {
		@Override
		public int compare(Pelicula p1,Pelicula p2) {
			return p1.getDuracion().compareTo(p2 .getDuracion());
		}
	};
	public static Comparator<Pelicula> compararTitulo=new Comparator<Pelicula>() {
		@Override
		public int compare(Pelicula p1,Pelicula p2) {
			return p1.getTitulo().compareTo(p2.getTitulo());
		}
	};
	public static Comparator<Pelicula> compararDirector=new Comparator<Pelicula>() {
		@Override
		public int compare(Pelicula p1,Pelicula p2) {
			return p1.getDirector().compareTo(p2.getDirector());
		}
	};
}
