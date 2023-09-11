package service;

import java.util.ArrayList;
import java.util.Scanner;

import entidades.Alumno;

/*bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.*/

public class ServiceAlumno {

	Scanner s=new Scanner(System.in);
	ArrayList <Alumno> listaAlumnos=new ArrayList<Alumno>();
	
	public void ingresoDeAlumnos() {
		String opc="s";
		Alumno a1=new Alumno();
		do {
			System.out.println("Ingrese el nombre del alumno");
			a1.setNombre(s.nextLine());
			for(int i=0;i<3;i++) {
				System.out.println("Ingrese la "+(i+1)+"º nota");
				a1.getNotas().add(s.nextInt());
			}
			listaAlumnos.add(a1);
			System.out.println("Desea ingresar otro alumno?(S/N)");
			opc=s.nextLine();
		}while(opc.equalsIgnoreCase("n"));
		
	}
	public void buscarAlumno() {
		String name;
		boolean encontrado=false;
		System.out.println("Ingrese el nombre del alumno");
		name=s.nextLine();
		for(Alumno i:listaAlumnos) {
			if (i.getNombre().equals(name)) {
				System.out.println("Nota final del alumno: "+notaFinal(i));
				encontrado=true;
				break;
			}
		}
		if(!encontrado)
			System.out.println("El alumno ingresado no se encontro");
	}
	public double notaFinal(Alumno al) {
		double suma=0;
		for(Integer i:al.getNotas())
		 suma+=i;
		return suma/3;
	}
}
