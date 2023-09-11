package standardpackage;
/*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.*/
import java.util.Scanner;
public class Guia7_Ej20 {
	public static void main(String[]args) {
		int[][] matriz=new int [3][3];
		cargarMatriz(matriz);
		if(esMagico(matriz)) {
			System.out.println("Es magico.");
		}else {
			System.out.println("No es magico.");
		}
		
	}

	public static boolean esMagico(int[][] matriz) {
		boolean esMagico=false,fil=false,col=false,diag=false;
		int suma, aux=0;
		
		for(int i=0;i<3;i++) {					//suma y compara filas
			suma=0;
			for(int j=0;j<3;j++) {
				suma+=matriz[i][j];
				if (i==0)
					aux=suma;
			}
			if(aux!=suma) {
				fil=false;
				break;
			}else
				fil=true;
		}	
		
		for(int i=0;i<3;i++) {					//suma y compara columnas
			suma=0;
			for(int j=0;j<3;j++) {
				suma+=matriz[j][i];
				if (i==0)
					aux=suma;
			}
			if(aux!=suma) {
				col=false;
				break;
			}else
				col=true;
		}
		
		suma=0;
		for(int i=0;i<3;i++) {					//suma y compara diagonales
			suma+=matriz[i][i];
		}
		aux=0;
		for(int i=2;i>=0;i--) {
			aux+=matriz[i][i];
		}
		if(suma==aux)
			diag=true;
		else
			diag=false;
		
		if (fil&&col&&diag)
			esMagico=true;
		return esMagico;
	}

	public static void cargarMatriz(int[][] matriz) {
		Scanner entrada=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				do {
					System.out.println("Ingrese el numero en la posicion ["+i+"]["+j+"]");
					matriz[i][j]=entrada.nextInt();
				}while((matriz[i][j]<1)||(matriz[i][j]>9));
				
			}
		}
		entrada.close();
	}
}
