package test;

import java.util.Arrays;

/*Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.*/

public class Act10 {

	public static void main(String[]args) {
		double[] arrA=new double[50];
		double[] arrB=new double[20];
		cargarArreglo(arrA);
		mostrarArreglo(arrA, 50);
		Arrays.sort(arrA);
		mostrarArreglo(arrA, 50);
		for (int i=0;i<10;i++) {
			arrB[i]=arrA[i];
		}
		Arrays.fill(arrB, 11, 20, 0.5);
		System.out.println(" ");
		mostrarArreglo(arrB, 20);
	}
	public static void cargarArreglo(double[]arr) {
		for (int i=0;i<50;i++) {
			arr[i]=(double)Math.random()*10;
		}
	}
	public static void mostrarArreglo(double[]arr, int max) {
		for (int i=0;i<max;i++) {
			if(i<49) 
				System.out.print("["+arr[i]+"]");
			else
				System.out.println("["+arr[i]+"]");
		}
	}
}
