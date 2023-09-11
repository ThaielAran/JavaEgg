package standardpackage;
/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.*/
import java.util.Scanner;
public class Guia7_Ej07 {
	public static void main(String[]args) {
		String frase;
		Scanner entrada=new Scanner(System.in);
		try {
			System.out.println("Ingrese una frase: ");
			frase=entrada.nextLine();
			if(frase=="eureka") {
				System.out.println("Correcto");
			}else {
				System.out.println("Incorrecto");
			}
		}catch(Exception exc) {
			System.out.println(exc);
		}
		entrada.close();
	}
}
