package test;

import java.util.Date;
import java.util.Scanner;

import service.ServiceAlquiler;
import service.ServicePelicula;

/*Escribir un programa en Java que simule un servicio de alquiler de películas. El programa debe tener una clase Pelicula
que represente los datos de una película, como el título, el género, el año y la duración. El programa también debe tener
una clase Alquiler que represente los datos de un alquiler, como la película alquilada, la fecha de inicio, la fecha de fin y
el precio.
El programa puede usar la clase Date para manejar las fechas, la clase Arrays para almacenar y ordenar las películas y
los alquileres, la clase Math para calcular el precio según la duración y el género de la película, y la clase String para
manipular los textos.
El programa debe permitir al usuario ingresar los datos de las películas disponibles y los datos de los alquileres
realizados, y mostrar por pantalla un menú con las opciones de cargar una pelicula, hacer una lista de todas las peliculas
disponibles, crear un alquiler, realizar una lista de todos los alquileres, buscar peliculas por titulo o por genero y buscar
alquileres por fecha.*/

public class ActExtra2 {

	public static void main(String[]args) {
		ServicePelicula servPeli=new ServicePelicula();
		ServiceAlquiler servAlq=new ServiceAlquiler();
		Scanner s=new Scanner(System.in);
		int opc=0, contPeli=0, contAlq=0;
		String busqueda;
		do {
			System.out.println("    MENU\nIngrese una opcion:\n1. Ingresar pelicula\n2. Ingresar alquiler\n3. Listar peliculas\n4. Listar alquileres\n5. Buscar pelicula por titulo\n6. Buscar pelicula por genero\n7. Buscar alquiler\n8. Salir");
			opc=s.nextInt();
			busqueda="";
			switch(opc) {
			case 1:
				if (contPeli<5) {
					servPeli.cargarPelicula(contPeli);
					contPeli++;
				}else
					System.out.println("Se alcanzó el límite de almacenamiento de peliculas");
				break;
			case 2:
				if(contAlq<3) {
					servAlq.cargarAlquiler(contAlq);
					contAlq++;
				}else
					System.out.println("Se alcanzó el límite de almacenamiento de alquileres");	
				break;
			case 3:
				if(contPeli>0)
					servPeli.listarPeliculas(contPeli);
				else
					System.out.println("Ingrese alguna pelicula antes.");
				break;
			case 4:
				if(contAlq>0)
					servAlq.listarAlquileres(contAlq);
				else
					System.out.println("Ingrese algun alquiler antes.");
				break;
			case 5:
				do {
					System.out.println("Ingrese el titulo de la pelicula");
					busqueda=s.nextLine();
				}while (busqueda.length()==0);
				servPeli.buscarPorTitulo(busqueda,contPeli);
				break;
			case 6:
				do {
					System.out.println("Ingrese el genero de la pelicula");
					busqueda=s.nextLine();
				}while (busqueda.length()==0);
				servPeli.buscarPorGenero(busqueda);
				break;
			case 7:
				int anio, mes, dia;
				do {
					System.out.println("Ingrese el anio del alquiler");
					anio = s.nextInt() - 1900;
				} while (anio<0||anio>123);
				do {
					System.out.println("Ingrese el mes del alquiler(en numeros)");
					mes = s.nextInt() - 1;
				} while (mes<0||mes>11);
				do {
					System.out.println("Ingrese el dia del alquiler");
					dia = s.nextInt();
				} while (dia<1||dia>31);
				Date fecha=new Date(anio, mes, dia);
				servAlq.buscarAlquiler(fecha, contAlq);
				break;
			}
		}while(opc!=8);
		System.out.println("Salio.");
	}
}
