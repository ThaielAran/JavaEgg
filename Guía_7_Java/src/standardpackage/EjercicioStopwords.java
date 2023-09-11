package standardpackage;

public class EjercicioStopwords {
	public static final int MAX_A=42;
	public static final int MAX_S=20;
	public static void main(String[]args) {
		char[]arr={' ','l','a',' ','c','a','s','a',' ','r','o','j','a',',',' ','a',' ','l','a',' ','v','u','e','l','t','a',' ','d','e',' ','l','a',' ','e','s','q','u','i','n','a','.',' '};
		char[]sWords={' ','a',' ','l','o',' ','l','o','s',' ','d','e',' ','l','a',' ','l','a','s',' '};
		int iniA, finA, pos=0;
		mostrarArreglo(arr);
		do {
			mostrarArreglo(arr);
			iniA=buscar_inicio(arr,pos,MAX_A);
			finA=buscar_fin(arr,iniA,MAX_A);
			if(buscar_como_sWord(arr,iniA,finA,sWords)){
					eliminar_sWord(arr,iniA,finA);
					finA=iniA;
			}
			pos=finA+1;
			
		}while(pos<MAX_A);
		mostrarArreglo(arr);
	}
	public static void eliminar_sWord(char[] arr, int iniA, int finA) {
		for(int i=iniA;i<=finA;i++) {
			corrimIzq(arr,iniA);
		}
	}
	public static void corrimIzq(char[] arr, int iniA) {
		for(int i=iniA;i<MAX_A-1;i++) {
			arr[i]=arr[i+1];
		}
		
	}
	public static boolean buscar_como_sWord(char[] arr, int iniA, int finA, char[] sWords) {
		int iniS=0,finS=0;
		boolean stopW=false;
		while(iniS<MAX_S) {
			iniS=buscar_inicio(sWords,iniS,MAX_S);
			finS=buscar_fin(sWords,iniS,MAX_S);
			if((finA-iniA)==(finS-iniS)&&son_iguales(arr,iniA,finA,sWords,iniS))
				//System.out.println("t");
					stopW=true;
			iniS=finS+1;
			
		}
		return stopW;
	}
	public static boolean son_iguales(char[] arr, int iniA, int finA, char[] sWords, int iniS) {
		while((iniA<=finA)&&arr[iniA]==sWords[iniS]) {
			iniA++;
			iniS++;
		}
		return iniA>finA;
	}
	public static int buscar_fin(char[] arr, int pos, int size) {
		while((pos<size)&&(arr[pos]!=' '&&arr[pos]!=','&&arr[pos]!='.'))
			pos++;
		return pos-1;
	}
	public static int buscar_inicio(char[] arr, int pos, int size) {
		while((pos<size)&&(arr[pos]==' '||arr[pos]==','||arr[pos]=='.'))
			pos++;
		return pos;
	}
	public static void mostrarArreglo(char[] arr) {
		for (int i = 0; i < MAX_A; i++)
		System.out.print(arr[i] + "|");
		System.out.println();
		}
}
