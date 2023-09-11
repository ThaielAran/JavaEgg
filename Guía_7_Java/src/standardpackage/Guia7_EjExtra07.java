package standardpackage;
/*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y los
números serán introducidos por el usuario. Realice dos versiones del programa, una
usando el bucle “while” y otra con el bucle “do - while”.*/

import java.util.Scanner;
public class Guia7_EjExtra07 {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		int n,cont, num,max=0,min=99999999,suma=0;
		try {
			do {
				System.out.println("Ingrese la cantidad de numeros");
				n=s.nextInt();
			}while(n<=1);
			cont=n;
			while(cont>0) {
				System.out.println("Ingrese un valor");
				num=s.nextInt();
				if(num<min)
					min=num;
				if(num>max)
					max=num;
				suma+=num;
				cont--;
			}
			/*do {
				System.out.println("Ingrese un valor");
				num=s.nextInt();
				if(num<min)
					min=num;
				if(num>max)
					max=num
				suma+=num;
				n--;
			}while(n>0);*/
			System.out.println("Promedio: "+suma/n+"\nValor maximo: "+max+"\nValor minimo: "+min);
		}catch(Exception exc) {
			System.out.println(exc);
		}
		s.close();
	}
}
