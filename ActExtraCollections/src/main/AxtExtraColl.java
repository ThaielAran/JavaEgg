package main;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Producto;
import service.ServiceProducto;

/*se creará un ArrayList de tipo Producto que guardará todos los productos creados. A
continuación, tendrás que crear un bucle que solicite al usuario los datos de cada producto y los setee en
el objeto Producto correspondiente, que se agregará al ArrayList.*/

public class AxtExtraColl {

	public static void main(String[]args) {
		
		Scanner s= new Scanner(System.in);//.useDelimiter("\n");
		Scanner n=new Scanner(System.in);
		ArrayList<Producto> listaProductos=new ArrayList<Producto>();
		ServiceProducto serv=new ServiceProducto();
		int opc=0, indice=-1;
		String quitAdd="n";
		do {
			listaProductos.add(serv.crearProducto());
			System.out.println("Desea seguir ingresando productos? (S/N)");
			quitAdd=s.nextLine();
		}while(quitAdd.equalsIgnoreCase("s"));
		
		do {
			System.out.println("    MENU\nIngrese una opcion:\n1. Agregar producto\n2. Listar productos\n3. Actualizar producto\n4. Borrar producto\n5. Venta\n6. Reposicion\n7. Salir");
			opc=n.nextInt();
			switch(opc) {
			case 1:
				listaProductos.add(serv.crearProducto());
				break;
			case 2:
				serv.toString(listaProductos);
				break;
			case 3:
				indice=serv.buscarProducto(listaProductos);
				if(indice>=0)
					serv.modificar(listaProductos, indice);
				else
					System.out.println("No se encontró el producto.");
				break;
			case 4:
				indice=serv.buscarProducto(listaProductos);
				if(indice>=0)
					serv.eliminar(listaProductos, indice);
				else
					System.out.println("No se encontró el producto.");
				break;
			case 5:
				indice=serv.buscarProducto(listaProductos);
				if(indice>=0)
					serv.venta(listaProductos.get(indice));
				else
					System.out.println("No se encontró el producto.");
				break;
			case 6:	
				indice=serv.buscarProducto(listaProductos);
				if(indice>=0)
					serv.reposicion(listaProductos.get(indice));
				else
					System.out.println("No se encontró el producto.");
				break;
			case 7:
				System.out.println("Salio.");
			}
		}while(opc!=7);
	}
}
