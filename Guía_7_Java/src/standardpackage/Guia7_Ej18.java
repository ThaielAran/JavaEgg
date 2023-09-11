package standardpackage;
/*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
obtiene cambiando sus filas por columnas (o viceversa).
1 0 4    1 0 6
0 5 0    0 5 0
6 0 -9   4 0 -9
*/

public class Guia7_Ej18 {
	public static final int MAXVALUE=10;
	public static void main(String[]args) {
		int n=4;
		int[][] matint=new int [n][n];
		for(int i=0;i<n;i++)
			cargarArregloAleatorio(matint[i], n);
		
		imprimirMatriz(matint, n);
		System.out.println(" ");
		imprimirMatrizTraspuesta(matint, n);
	}
	public static void imprimirMatriz(int[][] arrint, int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j!=n-1)
					System.out.print(arrint[i][j]+" ");
				else
					System.out.println(arrint[i][j]+" ");
			}
		}
		
	}
	public static void imprimirMatrizTraspuesta(int[][] matint, int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j!=n-1)
					System.out.print(matint[j][i]+" ");
				else
					System.out.println(matint[j][i]+" ");
			}
		}
		
	}

	public static void cargarArregloAleatorio(int[] arrint, int n) {
		
		for(int i=0;i<n;i++) {
			arrint[i]=(int)(MAXVALUE*Math.random());
		}
		
	}
}
