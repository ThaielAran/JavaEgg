package standardpackage;

import java.util.Scanner;

/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).*/
public class Guia7_Ej17 {
	public static final int MAXVALUE=100000;
	public static void main(String[]args) {
		int n;
		int[] arrint;
		Scanner entrada=new Scanner(System.in);
		try {
			do {
				System.out.println("Ingrese el tamano del vector:");
				n=entrada.nextInt();
			}while(n<=2);
			arrint=new int[n];
			cargarArregloAleatorio(arrint, n);
			imprimirArreglo(arrint, n);
			contarDigitosArreglo(arrint,n);
		}catch(Exception exc) {
			System.out.println(exc);
		}
		entrada.close();
	}
	public static void contarDigitosArreglo(int[] arrint, int n) {
		int cont, digi1=0, digi2=0, digi3=0, digi4=0, digi5=0, num;
		for(int i=0;i<n;i++) {
			cont=0;
			num=arrint[i];
			while(num>0) {
				num=num/10;
				cont++;
				System.out.println(num);
			}
			System.out.println(cont);
			switch(cont) {
			case 1:
				digi1++;
				break;
			case 2:
				digi2++;
				break;
			case 3:
				digi3++;
				break;
			case 4:
				digi4++;
				break;
			case 5:
				digi5++;
				break;
			}
		}
		System.out.println("Numeros de 1 digito: "+digi1+"\nNumeros de 2 digitos: "+digi2+"\nNumeros de 3 digitos: "+digi3+"\nNumeros de 4 digitos: "+digi4+"\nNumeros de 5 digitos: "+digi5);
	}
	public static void imprimirArreglo(int[] arrint, int n) {
		for(int i=0;i<n;i++) {
			if(i!=n-1)
				System.out.print(arrint[i]+" ");
			else
				System.out.println(arrint[i]+" ");
		}
		
	}

	public static void cargarArregloAleatorio(int[] arrint, int n) {
		
		for(int i=0;i<n;i++) {
			arrint[i]=(int)(MAXVALUE*Math.random());
		}
		
	}
}
