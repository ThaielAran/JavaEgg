package manosALaObra;

import java.util.ArrayList;
import java.util.Iterator;

import entidades.Libro;

public class MainLibros {
	public static void main(String[]args) {
		ArrayList<Libro> libros=new ArrayList<Libro>();
		Libro l1=new Libro();
		Libro l2=new Libro();
		l1=l1.createLibro();
		l2=l2.createLibro();
		libros.add(l1);
		libros.add(l2);
		
		Iterator<Libro> it=libros.iterator();
		while(it.hasNext()) {
			if(it.next().getTitulo()=="Crepusculo")
				it.remove();
			System.out.println(it.next()+" ");
		}
	}
}
