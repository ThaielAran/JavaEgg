package standardpackage;
/*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).

    M           T
 0 -2  4     0  2 -4
 2  0  2    -2  0 -2
-4 -2  0     4 -2  0
*/
public class Guia7_Ej19 {
	public static final int MAXVALUE=10;
	public static void main(String[]args) {
		int n=3;
		int[][] matint=new int [n][n];
		cargarMatriz(matint);
		
		imprimirMatriz(matint, n);
		System.out.println("Es antisimetrica? "+antiSimetrica(matint,n));
	}
	
	public static void cargarMatriz(int[][] matint) {
		matint[0][0]=0;
		matint[0][1]=-2;
		matint[0][2]=4;
		matint[1][0]=2;
		matint[1][1]=0;
		matint[1][2]=2;
		matint[2][0]=-4;
		matint[2][1]=-2;
		matint[2][2]=0;
		
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
	public static boolean antiSimetrica(int[][] matint, int n) {
		boolean bool=false;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++){
				System.out.print(matint[i][j]);
				System.out.println(-matint[j][i]);
				if(matint[i][j]==-matint[j][i]) {
					bool=true;
				}else {
					bool=false;
					return bool;
				}
			}
		}
		return bool;
	}	
}
