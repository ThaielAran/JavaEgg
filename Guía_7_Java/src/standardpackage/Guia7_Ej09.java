package standardpackage;
/*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
investigar la función Substring y equals() de Java.*/

import java.util.Scanner;
public class Guia7_Ej09 {
	public static void main(String[]args) {
		String frase;
		Scanner entrada=new Scanner(System.in);
		try {
			System.out.println("Ingrese una frase: ");
			frase=entrada.nextLine();
			if(frase.substring(0, 1).equals("A")) {
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
