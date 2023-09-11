package service;

import java.util.ArrayList;
import java.util.Scanner;
import entities.Producto;

/*Método venta(): El usuario ingresa el nombre del producto que quiere comprar y se lo busca en el
ArrayList. Si está en el ArrayList, se llama con ese objeto Producto al método. El método se
decrementa de a uno, como un carrito de compras, el atributo cantidad en inventario, del producto que
ingresó el usuario. Esto sucederá cada vez que se realice una venta del producto. No se podrán vender
productos de los que no queden inventario disponible para vender. Devuelve true si se ha podido
realizar la operación y false en caso contrario.
Método reposición(): El usuario ingresa el nombre del producto que quiere reponer y se lo busca en el
ArrayList. Si está en el ArrayList, se llama con ese objeto al método. El método incrementa de a uno,
como un carrito de compras, el atributo cantidad en inventario, del producto seleccionado por el
usuario. Esto sucederá cada vez que se produzca una reposición de un producto.
Método toString para mostrar los datos de los productos.*/

public class ServiceProducto {

	Scanner s=new Scanner(System.in);//.useDelimiter("\n");
	Scanner n=new Scanner(System.in);
	
/*Los siguientes métodos funcionan como CRUD*/	
	//Crea Producto y lo retorna para añadirlo al ArrayList
	public Producto crearProducto() {
		Producto p1=new Producto();
		System.out.println("Ingrese nombre del producto");
		p1.setNombre(s.nextLine());
		System.out.println("Ingrese categoria");
		p1.setCategoria(s.nextLine());
		System.out.println("Ingrese precio");
		p1.setPrecio(n.nextDouble());
		System.out.println("Ingrese stock");
		p1.setStock(n.nextInt());
		return p1;
	}
	//modifica un producto indicado por el indice
	public void modificar(ArrayList<Producto> listaProd, int indice) {
		System.out.println("Ingrese nombre");
		listaProd.get(indice).setNombre(s.nextLine());
		System.out.println("Ingrese categoria");
		listaProd.get(indice).setCategoria(s.nextLine());
		System.out.println("Ingrese precio");
		listaProd.get(indice).setPrecio(s.nextDouble());
		System.out.println("Ingrese stock");
		listaProd.get(indice).setStock(s.nextInt());
	}
	//elimina un producto indicado por el indice
	public void eliminar(ArrayList<Producto> listaProd, int indice) {
		listaProd.remove(indice);
	}
	
	//El metodo imprime todos los productos y sus datos del ArrayList
	public void toString(ArrayList<Producto> lista) {
		for(Producto i:lista) {
			System.out.println(i.toString());
		}
	}

	//El metodo pide un nombre de producto y lo busca en el indice. Si lo encuentra retorna la posicion,
	//y si no retorna -1
	public int buscarProducto(ArrayList<Producto> listaProd) {
		String nombre;
		int indice=-1;
		System.out.println("Ingrese nombre del producto");
		nombre=s.nextLine();
		for(Producto i:listaProd) {
			indice++;
			if(i.getNombre().equalsIgnoreCase(nombre))
				return indice;
		}
			return -1;
	}
	
/*El método se
decrementa de a uno, como un carrito de compras, el atributo cantidad en inventario, del producto que
ingresó el usuario. Esto sucederá cada vez que se realice una venta del producto. No se podrán vender
productos de los que no queden inventario disponible para vender. Devuelve true si se ha podido
realizar la operación y false en caso contrario.*/
	public boolean venta(Producto prod) {
		if(prod.getStock()>0) {
			prod.setStock(prod.getStock()-1);
			return true;
		}else
			return false;
	}
	
/* El método incrementa de a uno,
como un carrito de compras, el atributo cantidad en inventario, del producto seleccionado por el
usuario. Esto sucederá cada vez que se produzca una reposición de un producto.*/
	public void reposicion(Producto prod) {
		prod.setStock(prod.getStock()+1);
	}
}






















