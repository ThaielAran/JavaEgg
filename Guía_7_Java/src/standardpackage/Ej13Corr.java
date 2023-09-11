package standardpackage;
/*Hacer un programa que inserte un elemento en un arreglo
(ordenado decrecientemente) de tamaño MAX=10.*/
import java.util.Scanner;
import java.util.Random;
public class Ej13Corr {
	public static final int MAX=10;
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		int num;
		int[] arr=new int [MAX];
		cargarArregloAleatorio(arr);
		ordenarArregloDecreciente(arr);
		imprimirArreglo(arr);
		do {
			System.out.println("Ingrese un entero menor a 10 para insertarlo");
			num=s.nextInt();
		}while(num<1||num>=10);
		insertarEnArreglo(arr,num);
		imprimirArreglo(arr);
		s.close();
	}
	public static void insertarEnArreglo(int[] arr, int num) {
		for(int i=MAX-1;i>0;i--) {
			arr[i]=arr[i-1];
			if(arr[i]>num) {
				arr[i]=num;
				break;
			}
			if(arr[0]<num)
				arr[0]=num;
		}

	}
	public static void cargarArregloAleatorio(int[]arr) {
		Random r=new Random();
		for(int i=0;i<MAX;i++) {
			arr[i]=r.nextInt(MAX);
		}
	}
	public static void ordenarArregloDecreciente(int[]arr) {
		int aux=0, j=0;
		for (int i=0;i<MAX;i++) {
			aux=arr[i];
			j=i-1;
			while((j>=0)&&(arr[j]<aux)) {
				arr[j+1]=arr[j];
				j--;
			}
		}
		arr[j+1]=aux;
	}
	public static void imprimirArreglo(int[]arr) {
		for(int i=0;i<MAX;i++) {
			if(i!=MAX-1)
				System.out.print("["+arr[i]+"]");
			else
				System.out.println("["+arr[i]+"]");
		}
	}
}
