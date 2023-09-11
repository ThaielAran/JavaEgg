package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Persona;
import service.ServiceAlojamiento;
import service.ServiceHabitacion;
import service.ServicePersona;
import service.ServiceReserva;


/*Un hotel está alquilando habitaciones, y en esta temporada decidió realizar las reservas desde internet. el
hotel cuenta con 10 Habitaciones, de las cuales:
Habitacion 1 - 5: Entran 2 personas
Habitacion 6 - 8: Entran hasta 3 personas
Habitacion 9 - 10: Entra 1 sola persona
Realizar un programa en donde se muestren la siguiente información:

Persona (Nombre, Edad, DNI, País)
Habitacion (Numero de habitacion, fecha de ocupacion si tuviera)
Reserva (ID, Numero de habitación, cantidad de personas, fechas)
Alojamiento (una vez que la reserva es ocupada por las personas, pasa a ser un alojamiento, en donde
será necesario guardar el id de la reserva)*/

public class ActExtraCol2 {


	public static void main(String[]args) {
		Scanner s=new Scanner(System.in).useDelimiter("\r\n");
		ServicePersona servPersona=new ServicePersona();
		ServiceHabitacion servHab=new ServiceHabitacion();
		ServiceReserva servReserva=new ServiceReserva();
		ServiceAlojamiento servAloj=new ServiceAlojamiento();
		
		int var, var2, cantPersonas, hab;

		servHab.crearHabitaciones();
		
		servPersona.listaPersonas.add(new Persona ("TahielAran",28,38675931,"Argentina"));
		
		do {

			System.out.println("\n********************************");
			System.out.println("\tMENU PRINCIPAL");
			System.out.println("*******************************\n");
			System.out.println("1. Menu Cliente");//crear, leer,modificar, eliminar
			System.out.println("2. Menu Reservas");//crear, leer,modificar, eliminar
			System.out.println("3. Visualizar Alojamiento");//ver aloj, habit
			System.out.println("4. Salir\n");
			System.out.println("Ingrese una opción --> ");

			var=0;
			var2=0;
			try {
				var = s.nextInt();
				switch (var) {
				case 1:

					do  {

						System.out.println("\n*******");
						System.out.println("Gestor Clientes");
						System.out.println("1. Crear Persona");
						System.out.println("2. Mostrar Persona");
						System.out.println("3. Modificar Persona");
						System.out.println("4. Borrar Persona");
						System.out.println("5. Salir\n");

						try {
							var2 = s.nextInt();
							switch (var2) {
							case 1:
								servPersona.crearPersona();
								System.out.println("Cliente Creado");								
								break;
							case 2:
								servPersona.mostrarPersonas();
								break;
							case 3:
								servPersona.modificarPersona();
								break;
							case 4:
								servPersona.eliminarPersona();
								break;
							case 5:
								break;
							}
						} catch (InputMismatchException e) {
							System.out.println("Se requiere ingresar una opcion valida.");
						}
					}while (var2!=5);

					break;

				case 2:
					// Crear Reserva
					if(servPersona.listaPersonas.isEmpty()) {
						System.out.println("Se requiere crear un cliente primero.");
						//!Consultar cliente
						break;
						
					}
					System.out.println("Ingrese la cantidad de personas");
					cantPersonas=s.nextInt();
					hab=servHab.buscarHabitacion(cantPersonas);

					if(hab>0) {
						servReserva.reservar(cantPersonas, hab);
						servHab.listaHabitaciones.get(hab-1).setOcupada(true);
						System.out.println("Reserva Creada");
					}else {
						System.out.println("No se encontraron habitaciones disponibles para la cantidad de personas");
						break;
					}
				case 3:
					if(servReserva.colecReservas.isEmpty()) {
							System.out.println("Se requiere crear una reserva primero.");
							break;
						}else {
							servAloj.mostrarAlojamiento();
						}
						
						//System.out.println("Lleno total. No hay habitaciones disponibles. A dormir a otro lado");
						//Pegar aqui el método para crear reserva
						break;
					case 4:
						System.out.println("Hasta Luego");
						break;
					default:
						System.out.println("Error. La opción ingresada no es válida.");
						System.out.println("Ingrese nuevamente una opción.");
				}
			}catch (InputMismatchException e) {
					System.out.println(e);
			}
		}while (var!=5);
	}
}