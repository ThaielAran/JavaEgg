package service;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Habitacion;

public class ServiceHabitacion {

	public ArrayList<Habitacion> listaHabitaciones=new ArrayList<Habitacion>();
	static Scanner s=new Scanner(System.in).useDelimiter("\r\n");
	
	public int cont=0;
	public void crearHabitaciones(){
		while(cont<=10) {
			cont++;
			Habitacion h1=new Habitacion(cont);
			if(cont<6) {
				h1.setNroPersonas(2);
			}else if (cont<9) {
				h1.setNroPersonas(3);
			}else if(cont<=10) {
				h1.setNroPersonas(1);
			}
			listaHabitaciones.add(h1);
			crearHabitaciones();
		}
	}
	
	public int buscarHabitacion(int numPersonas) {
		for(Habitacion i: listaHabitaciones) {
			if(i.getNroPersonas()==numPersonas) {
				if(!i.isReservada()) {
					i.setReservada(true);
					return i.getNroHabitacion();
				}
			}	
		}
		return 0; 
	}
}
