package standardpackage;
/*Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
por debajo de 1.60 mts. y el promedio de estaturas en general.*/

import java.util.Scanner;
public class Guia7_EjExtra06 {
	public static void main(String[]args) {
		final float menores=1.60f;
		Scanner s=new Scanner(System.in);
		int N, petizos=0;
		float altura, suma=0, bajos=0;
		try {
			do {
				System.out.println("Ingrese la cantidad de personas");
				N=s.nextInt();
			}while(N<=1);
			for(int i=0; i<N;i++) {
				System.out.println("Ingrese una altura");
				altura=s.nextFloat();
				suma+=altura;
				if(altura<=menores) {
					petizos++;
					bajos+=altura;
				}
			}
			System.out.println("Altura promedio: "+suma/N+"\nAltura promedio debajo de 1.60: "+bajos/petizos);
		}catch(Exception exc) {
			System.out.println(exc);
		}
		s.close();
	}
}
