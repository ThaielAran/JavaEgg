package main;

import java.util.HashSet;
import java.util.Scanner;

import entities.Libro;
import service.ServiceLibro;

/*Implemente un programa para una Librería haciendo uso de un HashSet para evitar datos
repetidos. Para ello, se debe crear una clase llamada Libro que guarde la información de
cada uno de los libros de una Biblioteca. La clase Libro debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados.
También se creará en el main un HashSet de tipo Libro que guardará todos los libros
creados.
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos sus
datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y se le
pregunta al usuario si quiere crear otro Libro o no.
La clase Librería contendrá además los siguientes métodos:
● Constructor por defecto.
● Constructor con parámetros.
● Métodos Setters/getters
● Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo busca
en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al método. El
método se incrementa de a uno, como un carrito de compras, el atributo ejemplares
prestados, del libro que ingresó el usuario. Esto sucederá cada vez que se realice un
préstamo del libro. No se podrán prestar libros de los que no queden ejemplares
disponibles para prestar. Devuelve true si se ha podido realizar la operación y false en
caso contrario.
● Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método. El
método decrementa de a uno, como un carrito de compras, el atributo ejemplares
prestados, del libro seleccionado por el usuario. Esto sucederá cada vez que se
produzca la devolución de un libro. No se podrán devolver libros donde que no tengan
ejemplares prestados. Devuelve true si se ha podido realizar la operación y false en
caso contrario.
● Método toString para mostrar los datos de los libros.*/

public class EjExtra3 {

	public static HashSet<Libro> setLibros=new HashSet<Libro>();
	static Scanner s=new Scanner(System.in);
	static ServiceLibro serv=new ServiceLibro();
	
	public static void main (String[]args) {
		String op;
		do {
			
			System.out.println("Desea ingresar otro libro? S/N");
			op = s.nextLine();
		} while (!op.equalsIgnoreCase("n")&&!op.equalsIgnoreCase("s"));
		if(op.equalsIgnoreCase("s")) {
			serv.crearLibro();
		}
		int opc;
		String name;
		do {
			System.out.println(
					"    MENU\nIngrese una opcion:\n1. Agregar libro\n2. Listar libros\n3. Actualizar libro\n4. Borrar libro\n5. Prestamo\n6. Devolucion\n7. Salir");
			opc = s.nextInt();
			switch (opc) {
			case 1:
				serv.crearLibro();
				break;
			case 2:
				System.out.println(setLibros.toString());
				break;
			case 3:
				System.out.println("Ingrese el libro a modificar");
				name=s.nextLine();
				serv.modificarLibro(setLibros, name);
				break;
			case 4:
				System.out.println("Ingrese el libro a eliminar");
				name=s.nextLine();
				serv.eliminarLibro(setLibros, name);
				break;
			case 5:
				System.out.println("Ingrese el libro a prestar");
				name=s.nextLine();
				serv.eliminarLibro(setLibros, name);
			case 6:
				System.out.println("Ingrese el libro a devolver");
				name=s.nextLine();
				serv.eliminarLibro(setLibros, name);
			case 7:
				System.out.println("Salio.");
				break;
			}
		} while (opc!=7);
	}
}
