package service;

import java.util.Scanner;

import entidades.Cafetera;

public class Service {

	public Cafetera crearCafetera() {
		Cafetera c1=new Cafetera();
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese la capacidad de la cafetera");
		c1.setCapacidadMaxima(s.nextInt());
		c1.setCantidadActual(c1.getCapacidadMaxima());
		return c1;
	}
	public void llenarCafetera(Cafetera c) {
		c.setCantidadActual(c.getCapacidadMaxima());
	}
	public void servirTaza(Cafetera c,int taza) {
		if(c.getCantidadActual()>taza) {
			c.setCantidadActual(c.getCantidadActual()-taza);
			System.out.println("Se llenó la taza");
		}else {
			System.out.println("No se lleno la taza. Se sirvieron "+c.getCantidadActual()+" ml.");
			c.setCantidadActual(0);
		}
	}
	public void vaciarCafetera(Cafetera c) {
	c.setCantidadActual(0);
	}
	public void agregarCafe(Cafetera c, int cafe) {
		if (cafe+c.getCantidadActual()<c.getCapacidadMaxima()) 
			c.setCantidadActual(c.getCantidadActual()+cafe);
		else
			c.setCantidadActual(c.getCapacidadMaxima());
	}
}
