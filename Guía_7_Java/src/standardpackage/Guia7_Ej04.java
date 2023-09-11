package standardpackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/

public class Guia7_Ej04 {
	public static void main(String[] args) {
		double temp;
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese la temperatura");
			temp=Double.valueOf(entrada.readLine());
			System.out.println("La temperatura en Farenheit: "+ 32+(9*temp/5) );
			
		}catch (Exception exc) {
			System.out.println(exc);
		}
	}
}
