package main;

import java.util.Scanner;

import entities.Baraja;
import service.ServiceBaraja;

/*Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.*/

public class Ejercicio3 {

	public static void main (String[]args) {
		ServiceBaraja srvB =new ServiceBaraja();
		Baraja b=srvB.crearBaraja();
		
		Scanner s=new Scanner(System.in).useDelimiter("\r\n");
		int opc, cant;
		
		do {
			System.out.println("---BARAJA MENU---");
			System.out.println(
					"1. Barajar\n2. Siguiente Carta\n3. Carats Disponibles\n4. Dar Cartas\n5. Cartas Dadas\n6. Mostrar Mazo\n7. Salir");
			opc = s.nextInt();
			switch (opc) {
			case 1:
				srvB.barajar(b);
				break;
			case 2:
				srvB.siguienteCarta(b);
				break;
			case 3:
				srvB.cartasDisponibles(b);
				break;
			case 4:
				do {
					System.out.println("Ingrese la cantidad de cartas a dar:");
					cant = s.nextInt();
				} while (cant > 40);
				srvB.darCartas(b, cant);
				break;
			case 5:
				srvB.cartasMonton(b);
				break;
			case 6:
				srvB.mostrarBaraja(b);
				break;
			case 7:
				System.out.println("Salio");
				break;
			default:
				System.out.println("Ingresa bien, tarao");
			}
		} while (opc!=7);
		
	}
}
