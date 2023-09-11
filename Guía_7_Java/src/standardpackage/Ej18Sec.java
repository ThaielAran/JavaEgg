package standardpackage;
/*Hacer un programa que devuelva la posición de inicio y de fin
de la secuencia de mayor tamaño.*/
public class Ej18Sec {

	public static final int MAX=20;
	public static void main(String[]args) {
		int[] arr= {0,2,3,4,0,5,6,0,7,8,0,4,5,7,9,0,9,1,0,0};
		int ini=0, fin, iniLargo=0, finLargo=-1;
		while(ini<MAX) {
			ini=inicio_secuencia(arr,ini);
			fin=fin_secuencia(arr,ini);
			if(fin-ini>finLargo-iniLargo) {
				iniLargo=ini;
				finLargo=fin;
			}
			ini=fin+1;
		}
		System.out.println(iniLargo+"."+finLargo);
	}
	
	private static int fin_secuencia(int[] arr, int fin) {
		while((fin<MAX)&&(arr[fin]!=0))
			fin++;
		return fin-1;	
	}
	private static int inicio_secuencia(int[] arr, int ini) {
		while((ini<MAX)&&(arr[ini]==0))
			ini++;
		return ini;
	}
}
