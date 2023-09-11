package standardpackage;
/*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase
String.*/
import java.util.Scanner;
public class Guia7_EjExtra03 {
	public static void main(String[]args) {
		Scanner entrada=new Scanner(System.in);
		String car;
		try {
			System.out.println("Ingrese una letra");
			car=entrada.nextLine().substring(0, 1);
			if(car.toLowerCase().equals("a")||car.toLowerCase().equals("e")||car.toLowerCase().equals("i")||car.toLowerCase().equals("o")||car.toLowerCase().equals("u"))
				System.out.println("Es vocal.");
			else
				System.out.println("No es vocal.");
		}catch(Exception exc) {
			System.out.println(exc);
		}
		entrada.close();
	}
}
