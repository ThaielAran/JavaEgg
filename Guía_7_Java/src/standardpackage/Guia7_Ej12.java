package standardpackage;
/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().*/
import java.util.Scanner;
public class Guia7_Ej12 {
	public static final int Largo=5;
	public static void main(String[]args) {
		String FDE="&&&&&";
		String frase;
		int contCorrectas=0,contIncorrectas=0;
		Scanner entrada=new Scanner(System.in);
		try {
			do {
				System.out.println("Ingrese una frase.(formato correcto: 'X---O')");
				frase=entrada.nextLine();
				if(frase.equals(FDE))
					break;
				if(formato(frase)) 
					contCorrectas++;
				else
					contIncorrectas++;
			} while(!frase.equals(FDE));
			System.out.println("Lecturas correctas: "+contCorrectas+"\nLecturas Incorrectas: "+contIncorrectas);
		}catch(Exception exc){
			System.out.println(exc);
		}
		entrada.close();
	}
	public static boolean formato(String frase) {
		boolean formato;
		//System.out.println(frase.substring(frase.length()-2,frase.length()-1));
		if((frase.length()<=Largo)&&(frase.substring(0,1).equals("X"))&&(frase.substring(frase.length()-1,frase.length()).equals("O"))) 
			formato=true;
		else
			formato=false;
		return formato;
	}
}
