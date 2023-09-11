package main;

import java.util.ArrayList;
import java.util.Scanner;

import entities.CantanteFamoso;
import service.ServiceCantantes;

/*Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos
de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada cantante
y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario
elija o de salir del programa. Al final se deberá mostrar la lista con todos los cambios*/

public class EjExtra2 {

	public static ArrayList<CantanteFamoso> listaCantantes=new ArrayList<CantanteFamoso>();
	public static Scanner s=new Scanner(System.in);
	public static Scanner in=new Scanner(System.in);
	//System.out.println();
	
	public static void main(String[]args) {
		for(int i=0;i<5;i++) {
			CantanteFamoso cant=new CantanteFamoso();
			System.out.println("Ingrese el nombre del cantante");
			cant.setNombre(s.nextLine());
			System.out.println("Ingrese su disco mas vendido");
			cant.setDiscoConMasVentas(s.nextLine());
			listaCantantes.add(cant);
		}
		for(CantanteFamoso i: listaCantantes) {
			System.out.println(i.toString());
		}
		ServiceCantantes serv=new ServiceCantantes();
		int opc,pos;
		String name;
		do {
			System.out.println(
					"    MENU\nIngrese una opcion:\n1. Agregar cantante\n2. Listar cantantes\n3. Modificar cantante\n4. Eliminar cantante\n5. Salir");
			opc = s.nextInt();
			switch (opc) {
			case 1:
				listaCantantes.add(serv.agregarCantante());
				break;
			case 2:
				for(CantanteFamoso i: listaCantantes) {
					serv.mostrarCantantes(i);
				}
				break;
			case 3:
				System.out.println("Ingrese el cantante a modificar");
				name=in.nextLine();
				pos=serv.buscarCantante(listaCantantes, name);
				if(pos>-1) {
					serv.modificarCantante(listaCantantes.get(pos));
				}else {
					System.out.println("El cantante no se encuentra en la lista");
				}
				break;
			case 4:
				System.out.println("Ingrese el cantante a eliminar");
				name=in.nextLine();
				pos=serv.buscarCantante(listaCantantes, name);
				if(pos>-1) {
					listaCantantes.remove(pos);
				}else {
					System.out.println("El cantante no se encuentra en la lista");
				}
				break;
			case 5:
				System.out.println("Salio.");
				for(CantanteFamoso i: listaCantantes) {
					System.out.println(i.toString());
				}
				break;
			}
		} while (opc!=5);
	}
}
