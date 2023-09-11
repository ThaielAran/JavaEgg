package service;

import java.util.ArrayList;
import java.util.Scanner;

import entidades.Rutina;

/*crearRutina(Rutina rutina): recibe un objeto de tipo Rutina y lo agrega al sistema.
obtenerRutinas(): devuelve una lista con todas las rutinas registradas en el sistema.
actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion): recibe el identificador
de una rutina existente y los nuevos datos de la rutina, y actualiza la información correspondiente en el sistema.
eliminarRutina(int id): recibe el identificador de una rutina existente y la elimina del sistema.*/

public class ServiceRutina {

	ArrayList <Rutina> listaRutinas=new ArrayList<Rutina>();
	Scanner s=new Scanner(System.in);
	int id=0;
	
	public void crearRutina(Rutina rutina) {
		rutina.setId(id);
		id++;
		System.out.println("Ingrese el nombre");
		rutina.setNombre(s.nextLine());
		System.out.println("Ingrese la duracion");
		rutina.setDuracion(s.nextInt());
		s.nextLine();
		System.out.println("Ingrese el nivel de dificultad");
		rutina.setNivelDificultad(s.nextLine());
		System.out.println("Ingrese la descripcion");
		rutina.setDescripcion(s.nextLine());
		
		listaRutinas.add(rutina);
	}
	public void obtenerRutinas() {
		System.out.println(listaRutinas);
	}
	public void actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion) {
		listaRutinas.get(id).setNombre(nombre);
		listaRutinas.get(id).setDuracion(duracion);
		listaRutinas.get(id).setNivelDificultad(nivelDificultad);
		listaRutinas.get(id).setDescripcion(descripcion);
	}
	public void eliminarRutina(int id) {
		listaRutinas.remove(id);
		for (int i=id;i<listaRutinas.size();i++) {
			listaRutinas.get(i).setId(i);
		}
	}
}
