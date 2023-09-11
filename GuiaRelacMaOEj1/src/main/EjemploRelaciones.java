package main;

/*
 * @startuml
 *
 * @enduml
 * */
import entidades.Dni;
import entidades.Persona;

public class EjemploRelaciones {

	public static void main (String[]args) {
		
		Persona p1=new Persona();
		
		p1.setNombre("Thaiel");
		p1.setApellido("Gallardo");
		p1.setDni(new Dni('D',38675931));
		System.out.println(p1.toString());
	}
}
