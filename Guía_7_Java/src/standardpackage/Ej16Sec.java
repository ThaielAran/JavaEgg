package standardpackage;
/*Hacer un programa que devuelva la posición de inicio y fin de la
secuencia de números distintos de ceros cuya suma del contenido
sea mayor.*/
public class Ej16Sec {

	public static final int MAX=20;
	public static void main(String[]args) {
		int[] arr= {0,2,3,4,0,5,6,0,7,8,0,4,5,7,0,9,1,0,9,0};
		int ini=0, fin, iniMayor=0, finMayor=0, suma, sumaM=0;
		while(ini<MAX) {
			ini=inicio_secuencia(arr,ini);
			fin=fin_secuencia(arr,ini);
			suma=sumaCont(arr, ini, fin);
			if(suma>sumaM) {
				sumaM=suma;
				iniMayor=ini;
				finMayor=fin;
				
			}
			ini=fin+1;
		}
		System.out.println(iniMayor+"."+finMayor);
	}
	public static int sumaCont(int[] arr, int ini, int fin) {
		int suma=0;
		for(int i=ini;i<=fin;i++)
			suma+=arr[i];
		return suma;
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