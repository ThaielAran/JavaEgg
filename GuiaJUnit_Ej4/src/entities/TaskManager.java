package entities;

import java.util.ArrayList;

//como agregar una tarea, eliminar una tarea existente y listar las tareas disponibles

public class TaskManager {

	ArrayList <Tarea> listaTareas=new ArrayList<Tarea>();
	
	public Tarea crearTarea(String nombre, int duracion, boolean asignada) {
		return new Tarea(nombre,duracion,asignada);
	}
	public void añadirTarea(Tarea t1) {
		listaTareas.add(t1);
	}
	public void eliminarTarea(String nombre) {
		for (int i=0;i<listaTareas.size();i++) {
			if(listaTareas.get(i).getNombre()==nombre) {
				listaTareas.remove(i);
				break;
			}
			if(i==listaTareas.size()-1)
				System.out.println("No se encontro la tarea.");
		}
	}
	public void listarTareas() {
		System.out.println(listaTareas);
	}
}
