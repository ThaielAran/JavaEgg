package standardpackage;

/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
Java.*/

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Guia7_Ej03 {
	public static void main(String[] args) {
		String frase;
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese una frase");
			frase=entrada.readLine();
			System.out.println(frase.toUpperCase());
			System.out.println(frase.toLowerCase());
		}catch (Exception exc) {
			System.out.println(exc);
		}

	}
}