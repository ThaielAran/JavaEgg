package service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import entities.Reserva;

public class ServiceReserva {

	public HashMap<Integer, Reserva> colecReservas=new HashMap<Integer, Reserva>();
	static Scanner s=new Scanner(System.in).useDelimiter("\r\n");
	ServiceHabitacion servH=new ServiceHabitacion();
	ServiceAlojamiento serv=new ServiceAlojamiento();
	ServiceHabitacion servHab=new ServiceHabitacion();
	//ID, Numero de habitación, cantidad de personas, fechas
	public void reservar(int cantPersonas, int nroHab) {
		
		Reserva r1=new Reserva();
		//System.out.println(servH.listaHabitaciones.size());
		r1.setId((int)(Math.random()*100)+1);
		r1.setCantPersonas(cantPersonas);
		r1.setNumHabitacion(nroHab);
		System.out.println("Ingrese la fecha para la reserva (M/d/yyyy)");
		String fecha=s.nextLine();
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
	    LocalDate date = LocalDate.parse(fecha, dateFormat);
	    r1.setFechaReserva(date);
	    LocalDate ahora=LocalDate.now();
		if(ahora.isAfter(date)){
			serv.crearAlojamiento(r1.getId());
			System.out.println(serv.colecAlojamientos.size());
		};
		colecReservas.put(r1.getId(), r1);
		mostarReservas();
	}
	public void mostarReservas() {
		System.out.println(colecReservas.toString());
	}
	public void modificarReserva() {
		int busca,personas, hab;
		mostarReservas();
		System.out.println("Ingrese el ID de reserva a modificar");
		busca=s.nextInt();
		for(Map.Entry<Integer, Reserva> entry: colecReservas.entrySet()) {
			if(entry.getKey()==busca) {
				Reserva modif=new Reserva();
				modif.setId(busca);
				System.out.println("Ingrese la cantidad de personas");
				personas=s.nextInt();
				hab=servHab.buscarHabitacion(personas);
				if(hab>0) {
					modif.setNumHabitacion(hab);
				}else {
					System.out.println("No se encontraron habitaciones disponibles para la cantidad de personas");
					break;
				}
				System.out.println("Ingrese la fecha para la reserva (M/d/yyyy)");
				String fecha=s.nextLine();
				DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
			    LocalDate date = LocalDate.parse(fecha, dateFormat);
			    modif.setFechaReserva(date);
				entry.setValue(modif);
			}
		}
	}
	public void elimiarReserva() {
		int busca;
		System.out.println("Ingrese el ID de reserva a modificar");
		busca=s.nextInt();
		for(Map.Entry<Integer, Reserva> entry: colecReservas.entrySet()) {
			if(entry.getKey()==busca) {
				colecReservas.remove(entry.getKey());
			}
		}
	}
}
