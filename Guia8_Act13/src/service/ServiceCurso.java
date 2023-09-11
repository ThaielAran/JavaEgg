package service;

import java.util.Scanner;

/*método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
private String nombreCurso;
	private int cantidadHorasPorDia;
	private int cantidadDiasPorSemana;
	private boolean turno;
	private double precioPorHora;
	private String[] alumnos=new String [5];*/

import entidades.Curso;

public class ServiceCurso {

	Scanner s=new Scanner (System.in);
	public Curso crearCurso() {
		char turno;
		Curso c1=new Curso();
		System.out.println("Ingrese el nombre del curso");
		c1.setNombreCurso(s.nextLine());
		do {
			System.out.println("Ingrese la cantidad de horas al dia");
			c1.setCantidadHorasPorDia(s.nextInt());
		} while (c1.getCantidadHorasPorDia()<1||c1.getCantidadHorasPorDia()>12);
		do {
			System.out.println("Ingrese la cantidad de dias por semana");
			c1.setCantidadDiasPorSemana(s.nextInt());
		} while (c1.getCantidadDiasPorSemana()<1||c1.getCantidadDiasPorSemana()>6);
		do {
			System.out.println("Ingrese el turno (M o T)");
			turno = s.next().charAt(0);
		} while (turno!='m'&&turno!='M'&&turno!='t'&&turno!='T');
		if(turno=='m'||turno=='M')
			c1.setTurno(true);
		else
			c1.setTurno(false);
		System.out.println("Ingrese el precio por hora");
		c1.setPrecioPorHora(s.nextDouble());
		c1.setAlumnos(cargarAlumnos(c1));
		return c1;
	}
	public String [] cargarAlumnos (Curso c) {
		String []al=new String[5];
		for (int i=0; i<5;i++) {
			System.out.println("Ingrese nombre y apellido del alumno");
			al[i]=s.nextLine();
		}
		return al;
	}
	/*multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.*/
	public double calcularGananciaSemanal(Curso c) {
		return (c.getCantidadDiasPorSemana()*c.getCantidadDiasPorSemana()*c.getPrecioPorHora()*5);
	}
}
