package service;

import java.util.HashMap;
import java.util.Scanner;

/*introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio*/

public class ServiceTienda {

	HashMap<String,Double> mapaProductos=new HashMap<String,Double>();
	Scanner s=new Scanner(System.in);
	//System.out.println("");
	
	public void agregarProducto(){
		String prod, opc;
		Double valor;
		System.out.println("Ingrese el nombre del producto");
		prod=s.nextLine();
		System.out.println("Ingrese el valor del producto");
		valor=s.nextDouble();
		if(mapaProductos.containsKey(prod)) {
			System.out.println("Ese producto ya ha sido ingresado");
		}else {
			mapaProductos.put(prod, valor);
		}
		do {
			System.out.println("Desea ingresar otro producto? S/N");
			opc = s.nextLine();
		} while (!opc.equalsIgnoreCase("n")&&!opc.equalsIgnoreCase("s"));
		if(opc.equalsIgnoreCase("s")) {
			agregarProducto();
		}
	}
	public void modificarPrecio() {
		String prod;
		System.out.println("Ingrese el producto a modificar");
		prod=s.next();
		if(mapaProductos.containsKey(prod)) {
			System.out.println("Ingrese el nuevo valor");
			mapaProductos.replace(prod, s.nextDouble());
		}else {
			System.out.println("No se encontro el producto");
		}
	}
	public void eliminar() {
		String prod;
		System.out.println("Ingrese el producto a eliminar");
		prod=s.next();
		if(mapaProductos.containsKey(prod)) {
			mapaProductos.remove(prod);
		}else {
			System.out.println("No se encontro el producto");
		}
	}
	public void mostrarProductos() {
		System.out.println(mapaProductos.toString());
	}
}
