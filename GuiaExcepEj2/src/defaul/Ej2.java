package defaul;

/*Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).*/

public class Ej2 {

	public static void main(String[] args) {
		Integer[] arreglo=new Integer[3];
	
		for(int i=0; i<5; i++) {
			try {
				System.out.println(arreglo[i]);
			}catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
