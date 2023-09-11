package standardpackage;
/*Una obra social tiene tres clases de socios:

o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.

Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.*/
import java.util.Scanner;
public class Guia7_EjExtra05 {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		float valor;
		char socio;
		try {
			do {
				System.out.println("Ingrese el tipo de socio (A, B o C)");
				socio=s.next().charAt(0);
			}while(socio!='a'||socio!='c'||socio!='b'||socio!='A'||socio!='C'||socio!='B');
			System.out.println("Ingrese el costo del tratamiento");
			valor=s.nextFloat();
			switch(socio) {
			case'a','A':
				System.out.println("Valor a pagar: "+valor*0.5);
			case'b','B':
				System.out.println("Valor a pagar: "+valor*0.35);
			case'c','C':
				System.out.println("Valor a pagar: "+valor);
			}
		}catch(Exception exc){
			System.out.println(exc);
		}
		s.close();
	}

}
