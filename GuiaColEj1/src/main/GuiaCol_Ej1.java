package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.*/
/*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.*/

public class GuiaCol_Ej1 {

	public static ArrayList<String> listaDePerros=new ArrayList<String>();
	public static void main(String[]args) {
		
		Scanner s=new Scanner(System.in).useDelimiter("\n");
		
		String opc="s", raza;
		boolean esta=false;
		
		do {
			System.out.println("Ingrese una raza de perro:");
			listaDePerros.add(s.nextLine());
			System.out.println("Desea seguir ingresando? (S/N)");
			opc=s.nextLine();
		}while(!opc.equalsIgnoreCase("n"));
		
		mostrarLista();
		
		System.out.println("Ingrese una raza a eliminar");
		raza=s.nextLine();
		Iterator<String> it=listaDePerros.iterator();
		while(it.hasNext()) {
			if (it.next().equals(raza)) {
				it.remove();
				esta=true;
			}
		}
		if(!esta) {
			System.out.println("El perro ingresado no se encuentra en la lista");
		}
		mostrarLista();
	}
	public static void mostrarLista() {
		for(String i:listaDePerros) {
			System.out.print(i+" - ");
		}
	}
}
