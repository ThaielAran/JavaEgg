package standardpackage;
/*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.*/
import java.util.Random;
public class Guia7_EjExtra02 {
	public static void main(String[]args) {
		int A,B,C,D,aux;
		Random r=new Random();
		A=r.nextInt(10);
		B=r.nextInt(10);
		C=r.nextInt(10);
		D=r.nextInt(10);
		
		System.out.println("Valores iniciales:\n A:"+A+"\n B:"+B+"\n C:"+C+"\n D:"+D);
		aux=B;
		B=C;
		C=A;
		A=D;
		D=aux;
		System.out.println("Valores modificados:\n A:"+A+"\n B:"+B+"\n C:"+C+"\n D:"+D);
	}
}
