package service;

import java.util.HashMap;
import java.util.Map;

import entities.Alojamiento;

public class ServiceAlojamiento {

	HashMap<Integer, Alojamiento> colecAlojamientos=new HashMap<Integer, Alojamiento>();
	
	public void crearAlojamiento(int idReserva) {
		Alojamiento a1=new Alojamiento(idReserva);
		colecAlojamientos.put(idReserva, a1);
	}
	public void mostrarAlojamiento() {
		//ServiceHabitacion servHab=new ServiceHabitacion();
		//ServiceReserva servReserva=new ServiceReserva();
		for(Map.Entry<Integer, Alojamiento> entry: colecAlojamientos.entrySet()) {
			System.out.println("IDReserva="+entry.getKey());
			//System.out.println("Habitacion="+servReserva.colecReservas.get(entry.getKey()).getNumHabitacion());
			//System.out.println("Ocupada="+servHab.listaHabitaciones.get(servReserva.colecReservas.get(entry.getKey()).getNumHabitacion()).isOcupada());
		}
	}
}
