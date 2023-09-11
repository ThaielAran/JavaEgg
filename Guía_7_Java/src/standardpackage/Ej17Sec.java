package standardpackage;
/*Hacer un programa que devuelva la posición de inicio y fin de la
anteúltima secuencia de números distintos de ceros.*/
public class Ej17Sec {
	public static final int MAX=20;
	public static void main(String[]args) {
		int[] arr= {0,2,3,4,0,5,6,0,7,8,0,4,5,7,0,9,1,0,9,0};
		int ini=0, fin, iniAnterior=0, finAnterior=0;
		while(ini<MAX) {
			ini=inicio_secuencia(arr,ini);
			fin=fin_secuencia(arr,ini);
			if(fin+2==MAX)
				break;
			iniAnterior=ini;
			finAnterior=fin;
			ini=fin+1;
		}
		System.out.println(iniAnterior+"."+finAnterior);
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
