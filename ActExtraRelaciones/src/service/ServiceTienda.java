package service;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import entities.Producto;
import entities.Tienda;

public class ServiceTienda {

	private ArrayList<Tienda> listaTiendas= new ArrayList<Tienda>();

	static Scanner s =new Scanner(System.in).useDelimiter("\r\n");
	private static int cont = 0;
	
	public void crearTienda() {
		Tienda p=new Tienda();                           
		cont++;
		boolean repetido=false;
		p.setId(cont);
		
		do {
			System.out.println("Ingrese la direccion de la tienda");
			String direccionInput = s.next();
			if(listaTiendas.isEmpty()) {
				p.setDireccion(direccionInput);
			}else {
				for(Tienda tiendaActual: listaTiendas) {
					if(tiendaActual.getDireccion().equalsIgnoreCase(direccionInput)) {
						repetido = true;
					} else {
						p.setDireccion(direccionInput);
						repetido = false;
					}
				}
			}
		}while(repetido);

		System.out.println("Ingrese el encargado de la tienda");
		p.setEncargado(s.next());
		System.out.println(p.toString());
		listaTiendas.add(p);
	}
	public int buscarTienda() {
		int num;
		do{
			System.out.println("Ingrese el Id de la tienda a buscar");
			num=s.nextInt();
		}while ((num<0)||(num<cont));
		
		for(Tienda p: listaTiendas) {
			if (p.getId()==num)
				return num;
		}
		return -1;
	}
	public void eliminarTienda() {
		int num;
		imprimirTiendas();
		num = buscarTienda();
		if (num < 0)
			System.out.println("La tienda no se encontró");
		else
			listaTiendas.remove(num);
	}
	
	public void modificarTienda() {
		int num;
		imprimirTiendas();
		num = buscarTienda();
		if (num < 0)
			System.out.println("La tienda no se encontró");
		else {
			for (Tienda p : listaTiendas) {
				if(p.getId()==num) {
					System.out.println("Ingrese la nueva direccion de la tienda");
					p.setDireccion(s.next());
					System.out.println("Ingrese el nuevo encargado de la tienda");
					p.setEncargado(s.next());
				}
				
			}
		}
	}
	public void imprimirTiendas() {
		for (Tienda p : listaTiendas)
			System.out.println(p.toString());
	}
	
	public void agregarProducto(int t, Producto p, int n) {
			for(Tienda ti:listaTiendas){
				if(ti.getId()==t)
					ti.getStockTienda().put(p, n);
			}
	}
	public boolean venderProducto(int t, Producto p, int n) {
		for (Tienda ti : listaTiendas) {
			if(ti.getId()==t) {
				for(Map.Entry<Producto,Integer> prod: ti.getStockTienda().entrySet()) {
					if(prod.getKey().getId()==(p.getId())) {
						if(prod.getValue()>=n) {
							prod.setValue(prod.getValue()-n);
							return true;
						}else {
							System.out.println("No hay suficiente stock del producto para vender");
							return false;
						}
						
					}
				}
				System.out.println("No se encontró el producto en la tienda");
				return false;		
			}
		}return false;
	}
	public void eliminarProducto(int t, Producto p, int n) {
		for (Tienda ti : listaTiendas) {
			if(ti.getId()==t) {
				for(Map.Entry<Producto,Integer> prod: ti.getStockTienda().entrySet()) {
					if(prod.getKey().equals(p)) {
						ti.getStockTienda().remove(p);
						break;
					}
				}
				break;		
			}
		}
	}
	public void stockProductos(int t) {
		for (Tienda ti : listaTiendas) {
			if(ti.getId()==t) {
				for(Map.Entry<Producto,Integer> prod: ti.getStockTienda().entrySet()) {
					System.out.println(prod.getKey().toString()+ " Stock="+ prod.getValue());
				}
				
			}
		}
	}
}