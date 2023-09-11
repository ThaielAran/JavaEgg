package standardpackage;
/*Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al
menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
columna de la matriz M en la cual empieza el primer elemento de la submatriz P.
Ejemplo:


Como podemos observar nuestra submatriz P se encuentra en la matriz M en los índices:
4,4 - 4,5 - 4,6 - 5,4 - 5,5 - 5,6 - 6,4 - 6,5 - 6,6.*/
public class Guia7_Ej21 {
	public static void main(String[]args) {
		int[][] matrizM,matrizP;
		matrizM=new int [10][10];
		matrizP=new int [3][3];
		cargarMatrizEjemplo(matrizM, matrizP);
		subMatrizContenida(matrizM, matrizP);
		
	}
	public static void subMatrizContenida(int[][] matrizM, int[][] matrizP) {
		int coinciden=0;
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				
				if((matrizM[i][j]==matrizP[0][0])&&((i+2<10)&&(j+2<10))) {
					for(int k=0;k<3;k++) {
						for(int l=0;l<3;l++) {
							if(matrizM[i+k][j+l]==matrizP[k][l]) {
								coinciden++;
							}
						}
					}
					if (coinciden==9) {
						System.out.println("Matriz P se encuentra dentro de Matriz M en los indices ["+i+"]["+j+"]");	
					}
				}
			}
		}
		
	}
	public static void cargarMatrizEjemplo(int[][]matrizM,int[][] matrizP){
		matrizM[0][0]=1;
		matrizM[0][1]=1;
		matrizM[0][2]=1;
		matrizM[0][3]=1;
		matrizM[0][4]=1;
		matrizM[0][5]=1;
		matrizM[0][6]=1;
		matrizM[0][7]=1;
		matrizM[0][8]=1;
		matrizM[0][9]=1;
		matrizM[1][0]=1;
		matrizM[1][1]=1;
		matrizM[1][2]=1;
		matrizM[1][3]=1;
		matrizM[1][4]=1;
		matrizM[1][5]=1;
		matrizM[1][6]=1;
		matrizM[1][7]=1;
		matrizM[1][8]=1;
		matrizM[1][9]=1;
		matrizM[2][0]=1;
		matrizM[2][1]=1;
		matrizM[2][2]=1;
		matrizM[2][3]=1;
		matrizM[2][4]=1;
		matrizM[2][5]=1;
		matrizM[2][6]=1;
		matrizM[2][7]=1;
		matrizM[2][8]=1;
		matrizM[2][9]=1;
		matrizM[3][0]=1;
		matrizM[3][1]=1;
		matrizM[3][2]=1;
		matrizM[3][3]=1;
		matrizM[3][4]=1;
		matrizM[3][5]=1;
		matrizM[3][6]=1;
		matrizM[3][7]=1;
		matrizM[3][8]=1;
		matrizM[3][9]=1;
		matrizM[4][0]=1;
		matrizM[4][1]=1;
		matrizM[4][2]=1;
		matrizM[4][3]=1;
		matrizM[4][4]=36;
		matrizM[4][5]=5;
		matrizM[4][6]=67;
		matrizM[4][7]=1;
		matrizM[4][8]=1;
		matrizM[4][9]=1;
		matrizM[5][0]=1;
		matrizM[5][1]=1;
		matrizM[5][2]=1;
		matrizM[5][3]=1;
		matrizM[5][4]=89;
		matrizM[5][5]=90;
		matrizM[5][6]=75;
		matrizM[5][7]=1;
		matrizM[5][8]=1;
		matrizM[5][9]=1;
		matrizM[6][0]=1;
		matrizM[6][1]=1;
		matrizM[6][2]=1;
		matrizM[6][3]=1;
		matrizM[6][4]=14;
		matrizM[6][5]=22;
		matrizM[6][6]=26;
		matrizM[6][7]=1;
		matrizM[6][8]=1;
		matrizM[6][9]=1;
		matrizM[7][0]=1;
		matrizM[7][1]=1;
		matrizM[7][2]=1;
		matrizM[7][3]=1;
		matrizM[7][4]=1;
		matrizM[7][5]=1;
		matrizM[7][6]=1;
		matrizM[7][7]=1;
		matrizM[7][8]=1;
		matrizM[7][9]=1;
		matrizM[8][0]=1;
		matrizM[8][1]=1;
		matrizM[8][2]=1;
		matrizM[8][3]=1;
		matrizM[8][4]=1;
		matrizM[8][5]=1;
		matrizM[8][6]=1;
		matrizM[8][7]=1;
		matrizM[8][8]=1;
		matrizM[8][9]=1;
		matrizM[9][0]=1;
		matrizM[9][1]=1;
		matrizM[9][2]=1;
		matrizM[9][3]=1;
		matrizM[9][4]=1;
		matrizM[9][5]=1;
		matrizM[9][6]=1;
		matrizM[9][7]=1;
		matrizM[9][8]=1;
		matrizM[9][9]=1;
		
		matrizP[0][0]=36;
		matrizP[0][1]=5;
		matrizP[0][2]=67;
		matrizP[1][0]=89;
		matrizP[1][1]=90;
		matrizP[1][2]=75;
		matrizP[2][0]=14;
		matrizP[2][1]=22;
		matrizP[2][2]=26;
		
	}
}
