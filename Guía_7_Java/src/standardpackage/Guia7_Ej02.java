package standardpackage;

/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.*/

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Guia7_Ej02 {
	public static void main(String[] args) {
		String name;
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese su nombre");
			name=entrada.readLine();
			System.out.println("Su nombre es "+name);
		}catch (Exception exc) {
			System.out.println(exc);
		}

	}
}
