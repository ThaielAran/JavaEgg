package main;

import java.util.Scanner;

import service.ServiceTienda;

/*Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.*/

public class Col_Ej6 {

	public static void main(String[]args) {
		ServiceTienda serv=new ServiceTienda();
		Scanner s=new Scanner(System.in);
		int opc;
		
		serv.agregarProducto();
		
		do {
			System.out.println(
					"    MENU\nIngrese una opcion:\n1. Agregar producto\n2. Listar productos\n3. Actualizar producto\n4. Borrar producto\n5. Salir");
			opc = s.nextInt();
			switch (opc) {
			case 1:
				serv.agregarProducto();
				break;
			case 2:
				serv.mostrarProductos();
				break;
			case 3:
				serv.modificarPrecio();
				break;
			case 4:
				serv.eliminar();
				break;
			case 5:
				System.out.println("Salio.");
				break;
			}
		} while (opc!=5);
		
	}
}
