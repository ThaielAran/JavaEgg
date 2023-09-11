package standardpackage;

/*Crear un programa que dado un numero determine si es par o impar.*/

import java.util.Scanner;
public class Guia7_Ej06 {
	public static void main(String[]args) {
		int num;
		Scanner entrada=new Scanner(System.in);
		try {
			
			System.out.println("Ingrese un numero");
			num=Integer.valueOf(entrada.nextInt());
			
			if(num%2==0) {
				System.out.println("Es par");
			}else {
				System.out.println("Es impar");
			}
			
		}catch(Exception exc) {
			System.out.println(exc);
		entrada.close();
		}
	}
}
