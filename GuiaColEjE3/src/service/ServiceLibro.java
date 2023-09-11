package service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import entities.Libro;

/*String titulo;
  String autor;
  int numEjemplares;
  int numAlquilados;*/

public class ServiceLibro {

	static Scanner s =new Scanner(System.in);
	static Scanner n =new Scanner(System.in);
	
	public Libro crearLibro() {
		Libro l1=new Libro();
		System.out.println("Ingrese el titulo del libro");
		l1.setTitulo(s.nextLine());
		System.out.println("Ingrese su autor");
		l1.setAutor(s.nextLine());
		System.out.println("Ingrese el numero de ejemplares");
		l1.setNumEjemplares(n.nextInt());
		System.out.println("Ingrese el numero de ejemplares alquilados");
		l1.setNumAlquilados(n.nextInt());
		return l1;
	}
	
	public void modificarLibro(HashSet<Libro> lista, String name) {
		for(Libro i: lista) {
			if(i.getTitulo().equalsIgnoreCase(name)) {
				System.out.println("Ingrese el titulo del libro");
				i.setTitulo(s.nextLine());
				System.out.println("Ingrese su autor");
				i.setAutor(s.nextLine());
				System.out.println("Ingrese el numero de ejemplares");
				i.setNumEjemplares(n.nextInt());
				System.out.println("Ingrese el numero de ejemplares alquilados");
				i.setNumAlquilados(n.nextInt());
			}
		}
	}
	
	public void eliminarLibro(HashSet<Libro> lista, String name) {
		Iterator<Libro>it=lista.iterator();
		while(it.hasNext()) {
			if(it.next().getTitulo().equalsIgnoreCase(name)) {
				it.remove();
			}
		}
	}
	/*Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo busca
en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al método. El
método se incrementa de a uno, como un carrito de compras, el atributo ejemplares
prestados, del libro que ingresó el usuario. Esto sucederá cada vez que se realice un
préstamo del libro. No se podrán prestar libros de los que no queden ejemplares
disponibles para prestar. Devuelve true si se ha podido realizar la operación y false en
caso contrario.*/
	public boolean prestamo(HashSet<Libro> lista, String name) {
		Iterator<Libro>it=lista.iterator();
		while(it.hasNext()) {
			if(it.next().getTitulo().equalsIgnoreCase(name)) {
				if(it.next().getNumEjemplares()>0) {
					
				}
			}
		}
		return false;
	}
	
	/*Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método. El
método decrementa de a uno, como un carrito de compras, el atributo ejemplares
prestados, del libro seleccionado por el usuario. Esto sucederá cada vez que se
produzca la devolución de un libro. No se podrán devolver libros donde que no tengan
ejemplares prestados. Devuelve true si se ha podido realizar la operación y false en
caso contrario.*/
}












