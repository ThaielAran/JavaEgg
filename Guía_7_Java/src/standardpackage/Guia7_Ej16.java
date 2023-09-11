package standardpackage;
/*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido*/
import java.util.Scanner;
public class Guia7_Ej16 {
	public static final int MAXVALUE=10;
	public static void main(String[]args) {
		int n, num;
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
			do {
				System.out.println("Ingrese el numero a buscar:");
				num=entrada.nextInt();
			}while((num<0)&&(num>MAXVALUE));
			buscarNumero(arrint,n,num);
		}catch(Exception exc) {
			System.out.println(exc);
		}
		entrada.close();
	}

	public static void buscarNumero(int[] arrint, int n, int num) {
		int cont=0;
		for(int i=0;i<n;i++) {
			if(arrint[i]==num) {
				System.out.println("Se encontro el numero  en la posicion "+i);
				cont++;
			}
		}
		System.out.println(num+" se encontro "+cont+" veces en el arreglo.");
		
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
