package service;

import java.util.Date;
import java.util.Scanner;

import entidades.Alquiler;

//Crear Alquiler, Listar todas los alquileres, Buscar un alquiler por fecha (Decir si se existe o no,
//y si existe, mostrar los datos del alquiler),Calcular el ingreso total del servicio (El alquiler 
//cuesta $10, por 3 días. Por cada día extra, se aumenta un 10% de interés.)

/*private String pelicula;
	private Date inicio;
	private Date fin;
	private double precio;*/
public class ServiceAlquiler {

	public Alquiler[] alquileres=new Alquiler[3];
	
	public Alquiler crearAlquiler(int cont) {
		int anio, mes, dia;
		Scanner s=new Scanner(System.in);
		Alquiler alq=new Alquiler();
		System.out.println("Ingrese el titulo de la pelicula en alquiler");
		alq.setPelicula(s.next());
		
		do {
			System.out.println("Ingrese el anio de inicio del alquiler");
			anio = s.nextInt() - 1900;
		} while (anio<0||anio>123);
		do {
			System.out.println("Ingrese el mes de inicio del alquiler(en numeros)");
			mes = s.nextInt() - 1;
		} while (mes<0||mes>11);
		do {
			System.out.println("Ingrese el dia de inicio del alquiler");
			dia = s.nextInt();
		} while (dia<1||dia>31);
		Date ini=new Date(anio, mes, dia);
		alq.setInicio(ini);
		
		do {
			System.out.println("Ingrese el anio de fin del alquiler");
			anio = s.nextInt() - 1900;
		} while (anio<0||anio>123);
		do {
			System.out.println("Ingrese el mes de fin del alquiler(en numeros)");
			mes = s.nextInt() - 1;
		} while (mes<0||mes>11);
		do {
			System.out.println("Ingrese el dia de fin del alquiler");
			dia = s.nextInt();
		} while (dia<1||dia>31);
		Date fin=new Date(anio, mes, dia);
		alq.setFin(fin);
		
		alq.setPrecio(10);
		return alq;
	}
	public void cargarAlquiler(int cont) {
		alquileres[cont]=crearAlquiler(cont);
		alquileres[cont].setPrecio(calcularIngreso(cont));
	}
	public void listarAlquileres(int cont) {
		for(int i=0;i<cont;i++) {
			System.out.println(alquileres[i].toString());
		}
	}
	public void buscarAlquiler(Date fecha, int cont) {
		int i=0;
		while (i<cont) {
			if(alquileres[i].getInicio().equals(fecha)) {
				System.out.println("Se encontró el alquiler");
				alquileres[i].toString();
				break;
			}
			i++;
		}
		if (i==3)
			System.out.println("No se encontro el alquiler");
	}
	public double calcularIngreso(int alq) {
		
		if (alquileres[alq].getFin().getTime()-alquileres[alq].getInicio().getTime()<=86400000*3)
			return 10;
		else
			return 10+(((alquileres[alq].getFin().getTime()-alquileres[alq].getInicio().getTime())/86400000)-3);
	}
}
