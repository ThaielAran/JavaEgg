package main;

import java.util.Scanner;

import entidades.Rutina;
import service.ServiceCliente;
import service.ServiceRutina;

/*Realizar una aplicación de Gimnasio, que permita tener agregar clientes, y rutinas. Para ello, vamos a utilizar diferentes
clases y metodos;
Crea al menos cinco clientes con datos ficticios.
Crea al menos cinco rutinas con datos ficticios.
Registra los clientes creados en el sistema utilizando el método correspondiente del servicio de clientes.
Agrega las rutinas creadas al sistema utilizando el método correspondiente del servicio de rutinas.
Obtén la lista de todos los clientes registrados y muéstralos por pantalla.
Obtén la lista de todas las rutinas registradas y muéstralas por pantalla.
Realiza una actualización en uno de los clientes existentes y muestra la lista de clientes actualizada.
Realiza una actualización en una de las rutinas existentes y muestra la lista de rutinas actualizada.
Elimina uno de los clientes existentes y muestra la lista de clientes final.
Elimina una de las rutinas existentes y muestra la lista de rutinas final.*/

public class ActGrupal {

	public static void main(String[]args) {
		ServiceCliente servC=new ServiceCliente();
		ServiceRutina servR=new ServiceRutina();
		Scanner s=new Scanner(System.in);
		int opc, newEdad, newAltura, id, idRutina, newDuracion;
		double newPeso;
		String newNombre, newObjetivo, newDificultad, newDescripcion;
		
		do {
			System.out.println("    MENU\nIngrese una opcion:\n1. Agregar cliente\n2. Listar clientes\n3. Actualizar cliente\n4. Borrar cliente\n5. Agregar rutina\n6. Listar rutinas\n7. Actualizar rutina\n8. Borrar rutina\n9. Salir");
			opc=s.nextInt();
			switch(opc) {
			case 1:
				servC.registrarCliente();
				break;
			case 2:
				servC.obtenerClientes();
				break;
			case 3:
				do {
					System.out.println("Ingrese el id de cliente a modificar");
					id = s.nextInt();
				} while (id<0);
				System.out.println("Ingrese el nombre");
				s.nextLine();
				newNombre=s.nextLine();
				System.out.println("Ingrese la edad");
				newEdad=s.nextInt();
				System.out.println("Ingrese la altura en cm");
				newAltura=s.nextInt();
				System.out.println("Ingrese el peso");
				newPeso=s.nextDouble();
				System.out.println("Ingrese el objetivo");
				s.nextLine();
				newObjetivo=s.nextLine();
				servC.actualizarCliente(id, newNombre, newEdad, newAltura, newPeso, newObjetivo);
				break;
			case 4:
				System.out.println("Ingrese el id del cliente a eliminar (-1 para volver al menu)");
				id=s.nextInt();
				if(id>-1)
					servC.eliminarCliente(id);
				else
					break;
				break;
			case 5:
				Rutina rutina=new Rutina();
				servR.crearRutina(rutina);
				break;
			case 6:
				servR.obtenerRutinas();
				break;
			case 7:
				do {
					System.out.println("Ingrese el id de la rutina a modificar");
					idRutina = s.nextInt();
				} while (idRutina<0);
				System.out.println("Ingrese el nombre");
				s.nextLine();
				newNombre=s.nextLine();
				System.out.println("Ingrese duracion");
				newDuracion=s.nextInt();
				System.out.println("Ingrese la dificultad");
				s.nextLine();
				newDificultad=s.nextLine();
				System.out.println("Ingrese  la descripcion");
				newDescripcion=s.nextLine();
				servR.actualizarRutina(idRutina, newNombre, newDuracion, newDificultad, newDescripcion);
				break;
			case 8:
				System.out.println("Ingrese el id de la rutina a eliminar (-1 para volver al menu)");
				idRutina=s.nextInt();
				servR.eliminarRutina(idRutina);
				break;
			case 9:
				System.out.println("Salio.");
				break;
			default:
				System.out.println("Ingrese una opcion valida");
				break;
			}
		}while(opc!=9);
	}
}
