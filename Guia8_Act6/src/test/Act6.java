package test;

import java.util.Scanner;

import entidades.Cafetera;
import service.Service;

/*Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual
 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.*/

public class Act6 {
	public static void main(String[]args) {
		Service serv=new Service();
		Cafetera c1=new Cafetera();
		c1=serv.crearCafetera();
		Scanner s=new Scanner(System.in);
		int opc=0, taza;
		do {
			System.out.println("     MENU\nIngrese una opcion");
			System.out.println("1.Llenar cafetera\n2.Servir taza\n3.Vaciar cafetera\n4.Agregar cafe");
			s.nextLine();
			opc=s.nextInt();
			switch (opc) {
			case 1:
				System.out.println("Cafetera llena");
				serv.llenarCafetera(c1);
				System.out.println(c1.getCantidadActual());
				break;
			case 2:
				System.out.println("Ingrese el tamaño de la taza");
				taza=s.nextInt();
				serv.servirTaza(c1, taza);
				break;
			case 3:
				serv.vaciarCafetera(c1);
				System.out.println("Cafetera vacia");
				break;
			case 4:
				System.out.println("Ingrese la cantidad de cafe a agregar");
				taza=s.nextInt();
				serv.agregarCafe(c1, taza);
				System.out.println(c1.getCantidadActual());
				break;
			default:
				System.out.println("No ingreso una opcion valida");
				break;
			}
		}while (opc!=6);
		System.out.println("Salio");
	}
}
