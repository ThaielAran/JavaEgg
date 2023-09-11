package standardpackage;
/*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
*/

import java.util.Scanner;
public class Guia7_Ej13 {
	
	public static void main(String[]args) {
		int n;
		Scanner entrada=new Scanner(System.in);
		try {
			do {
				System.out.println("Ingrese el tamano de bordes");
				n=entrada.nextInt();
			}while (n<2);
			
		for(int i=0;i<n;i++) {
			System.out.print("*");
		}
		System.out.println("");
		
		for(int i=1;i<n;i++) {
			System.out.print("*");
			for(int j=0;j<n-2;j++) {
				System.out.print(" ");
			}
			i++;
			System.out.print("*");
			System.out.println("");
		}
		
		for(int i=0;i<n;i++) {
			System.out.print("*");
		}
		System.out.println("");
		
		}catch(Exception exc) {
			System.out.println(exc);
		}
		entrada.close();
	}
}
