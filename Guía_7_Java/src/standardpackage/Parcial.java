package standardpackage;

public class Parcial {
	public static final int B=255;
	public static final int M=20;
	public static void main (String[]args) {
		int[]arr= {255,67,67,67,67,67,67,67,67,255,14,255,33,33,33,33,255,5,98,255};
		int x=3, o=0,ini=0,fin=0;
		mostrarArreglo(arr);
		while(ini<M) {
			ini=buscarIni(arr,ini);
			if(ini<M) {
				fin=buscarFin(arr,ini);
				o=repeticiones(arr,ini,fin);
				if(o>x) {
					comprimir(arr, ini,o);
					fin=ini+1;
				}
			}
			ini=fin+1;
			mostrarArreglo(arr);
		}
	}
	public static void comprimir(int[] arr, int ini, int o) {
		for(int i=0;i<o-2;i++) {
			for(int j=ini;j<M;j++) {
				if(j<M-1)
					arr[j]=arr[j+1];
			}
		}
		arr[ini]=-o;
	}
	public static int repeticiones(int[] arr, int ini, int fin) {
		int v=arr[ini], o=0;
		while((ini<=fin)&&(arr[ini]==v)){
			o++;
			ini++;
		}
		return o;
	}
	public static int buscarFin(int[] arr, int fin) {
		while((fin<M)&&(arr[fin]!=B))
			fin++;
		return fin-1;
	}
	public static int buscarIni(int[] arr, int ini) {
		while((ini<M)&&(arr[ini]==B))
			ini++;
		return ini;
	}
	public static void mostrarArreglo(int[] arr) {
		for (int i = 0; i < M; i++)
		System.out.print(arr[i] + "|");
		System.out.println();
		}
}
