package standardpackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().*/
public class Guia7_Ej05 {
	public static void main(String[] args) {
		int num;
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese unnumero");
			num=Integer.valueOf(entrada.readLine());
			System.out.println("Doble: "+num*2);
			System.out.println("Triple: "+num*3);
			System.out.println("Raiz cuadrada: "+Math.sqrt(num));
		}catch (Exception exc) {
			System.out.println(exc);
		}
	}
}