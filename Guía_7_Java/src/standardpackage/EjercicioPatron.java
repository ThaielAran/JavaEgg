package standardpackage;
/*Un dispositivo que lleva un animal bovino en su cuello recolecta datos de un acelerómetro en tres ejes: X Y Z.
  Cada toma de datos se representa comouna secuencia de valores enteros entre 0 y 1023 para cada eje, las
  secuencias estan separadas por -1 (valor no valido para esta logica). El productor quiere conocer como se ha
  comportado su animal en el transcurso del dia y para ello ingresa un patron de aceleracion X Y Z y una cantidad
  N de repeticiones. Un patron que se repite una cierta cantidad de veces significa que el animal puede estar
  pastoreando, caminando, rumiando, etc. Dado un valor N y el patron X Y Z en un arreglo inicializado con -1 (de
  tamaño igual al arreglo que tiene los datos), hacer un programa en JAVA que:
  	-Compruebe si el patron se repitió N o mas veces y si es asi que elimine del arreglo las secuencias que se 
  	 siguen repitiendo luego de la cantidad N.
  Por ejemplo, si tenemos el siguiente arreglo de datos:
  -1|12|22|44|-1|23|34|55|-1|23|34|55|-1|23|34|55|-1|23|34|57|-1|
  El arreglo patron X Y Z a analizar es x=23,Y=34,Z=55 y el N=2
  -1|-1|-1|-1|-1|-1|-1|-1|23|34|55|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|
  el arreglo resultante seria
  -1|12|22|44|-1|23|34|55|-1|23|34|55|-1|-1|23|34|57|-1|-1|-1|-1|
  */
public class EjercicioPatron {
	public static final int SIZE=21;
	public static void main(String[]args) {
		int[]datos= {-1,12,22,44,-1,23,34,55,-1,23,34,55,-1,23,34,55,-1,23,34,57,-1};
		int[]patron= {-1,-1,-1,-1,-1,-1,-1,-1,-1,23,34,55,-1,-1,-1,-1,-1,-1,-1,-1,-1};
		int iniP,cont=0, N=2;
		iniP=buscar_inicio(patron,0);
		
		int iniA=0,finA=-1;
		while(iniA<SIZE) {
			iniA=buscar_inicio(datos,finA+1);
			if(iniA<SIZE) {
				finA=buscar_fin(datos,iniA);
				if(sonIguales(datos,patron,iniA,finA, iniP)){
				cont++;
				if(cont>N) {
					corrIzq(datos, iniA,finA);
					finA=iniA;
				}
			}
			
			}
			mostrarArreglo(datos);
		}

	}
	public static void corrIzq(int[] datos, int iniA, int finA) {
		for(int j= 0; j<=finA-iniA; j++) {
			for(int i=iniA; i<SIZE-1; i++) {
				datos[i]=datos[i+1];
			}
		}
	}
	public static boolean sonIguales(int[] datos, int[] patron, int iniA, int finA, int iniP) {
		while((iniA<=finA)&&(datos[iniA]==patron[iniP])) {
			iniA++;
			iniP++;
		}
		return iniA>finA;
	}
	public static int buscar_fin(int[] arr, int iniP) {
		while((iniP<SIZE)&&(arr[iniP]!=-1))
			iniP++;
		return iniP-1;
	}
	public static int buscar_inicio(int[] arr, int ini) {
		while((ini<SIZE)&&(arr[ini]==-1))
			ini++;
		return ini;
	}
	public static void mostrarArreglo(int[] arr) {
		for (int i = 0; i < SIZE; i++)
		System.out.print(arr[i] + "|");
		System.out.println();
		}
}
