package standardpackage;
/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.*/

import java.util.Scanner;
public class Guia7_Ej10 {
	public static void main(String[]args) {
		int lim, num, suma=0;
		Scanner entrada=new Scanner(System.in);
		try {
			do {
				System.out.println("Ingrese el limite positivo");
				lim=entrada.nextInt();
			}while (lim<0);
			do {
				System.out.println("Ingrese un numero");
				num=entrada.nextInt();
				suma=sumarNumeros(suma,num);
			}while (suma<=lim);
			System.out.println(suma+" supero el limite "+lim);
		}catch (Exception exc) {
			System.out.println(exc);
		}
		entrada.close();
	}
	public static int sumarNumeros(int suma, int num) {
		suma+=num;
		return suma;
	}
}
