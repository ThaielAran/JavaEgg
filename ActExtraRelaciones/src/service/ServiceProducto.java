package service;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Producto;

public class ServiceProducto {

	private ArrayList<Producto> listaProductos = new ArrayList<Producto>();
	static Scanner s = new Scanner(System.in).useDelimiter("\r\n");
	private static int cont = 0;
	public static final String nombresProductos[] = { "pan", "bizcochos", "chipá", "churros", "croissant", "pepas",
			"palmeritas", "queso", "empanadas", "agua", "cafe", "chocolate", "galletitas", "sándwich", "sacramento" };

	public void generarProductos() {
		cont++;
		boolean repetido=false;
		String nombre;
		do {
			nombre = nombresProductos[numAleatorio(0,14)];
			if(!listaProductos.isEmpty()) {
				for(Producto productoActual: listaProductos) {
					if(productoActual.getNombre().equalsIgnoreCase(nombre)) {
						repetido = true;
						break;
					} else {
						repetido = false;
					}

				}
			}
		}while(repetido);
		listaProductos.add(new Producto(cont, nombre, numAleatorio(100,1000)));
		if(cont<15) {
			generarProductos();
		}
	}

	public int numAleatorio(int minimo, int maximo) {
		int num = (int) (Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
		return num;
	}

	public void crearProducto() {
		Producto p=new Producto();                           
		cont++;
		boolean repetido=true;

		p.setId(cont);
		
		do {
		System.out.println("Ingrese el nombre del producto");
		String nombreInput = s.next();
			for(Producto productoActual: listaProductos) {
				if(productoActual.getNombre().equalsIgnoreCase(nombreInput)) {
					repetido = true;
				} else {
					p.setNombre(nombreInput);
					repetido = false;
				}

			}
		}while(repetido);
			
		System.out.println("Ingrese el precio del producto");
		p.setPrecio(s.nextDouble());
		listaProductos.add(p);
		}

	public void eliminarProducto() {
		int num;
		imprimirProductos();
		num = buscarProducto();
		if (num < 0)
			System.out.println("El producto no se encontró");
		else
			listaProductos.remove(num);
	}

	public void modificarProducto() {
		int num;
		imprimirProductos();
		num = buscarProducto();
		if (num < 0)
			System.out.println("El producto no se encontró");
		else {
			System.out.println("Ingrese el nuevo nombre del producto");
			listaProductos.get(num).setNombre(s.next());
			System.out.println("Ingrese el nuevo precio del producto");
			listaProductos.get(num).setPrecio(s.nextDouble());
		}
	}

	public Producto returProducto(int in) {
		return listaProductos.get(in-1);
	}
	public int buscarProducto() {
		int num;
			do {
				System.out.println("Ingrese el id del producto a buscar");
				num = s.nextInt();
			}while(num<0||num>cont);
			for(Producto p: listaProductos) {
				if (p.getId()==num)
					return num;
			}
			return -1;
		}

	public void imprimirProductos() {
		for (Producto p : listaProductos)
			System.out.println(p.toString());
	}
}
