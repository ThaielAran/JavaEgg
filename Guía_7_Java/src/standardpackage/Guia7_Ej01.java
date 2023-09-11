package standardpackage;
/*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma*/

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Guia7_Ej01 {
	public static void main(String[] args) {
		int a,b,c;
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese dos numeros enteros");
			a=Integer.valueOf(entrada.readLine());
			b=Integer.valueOf(entrada.readLine());
			c=a+b;
			System.out.println("La suma de los numeros es igual a "+c/*a+b*/);
			
		}catch (Exception exc) {
			System.out.println(exc);
		}
	}
}
