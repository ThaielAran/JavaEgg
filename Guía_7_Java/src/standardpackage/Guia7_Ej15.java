package standardpackage;
/*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.*/
public class Guia7_Ej15 {
	public static final int MAX=100;
	public static void main(String[]args) {
		int[]arrenteros=new int [MAX];
		rellenarVector(arrenteros);
		imprimirDescendente(arrenteros);
	}
	public static void rellenarVector(int[] arrenteros) {
		for(int i=0;i<MAX;i++) {
			arrenteros[i]=i+1;
		}
		
	}
	
	public static void imprimirDescendente(int[] arrenteros) {
		for(int i=MAX-1;i>=0;i--) {
			if(i!=0) 
				System.out.print(arrenteros[i]+", ");
			else 
				System.out.print(arrenteros[i]);
		}
		
	}
	
}
