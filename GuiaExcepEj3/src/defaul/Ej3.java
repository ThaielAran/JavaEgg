package defaul;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.*/

public class Ej3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		DivisionNumero dn=new DivisionNumero();
		String a;
		String b;
		try {
			System.out.println("Ingrese el dividendo");
			a=s.next();
			System.out.println("Ingrese el divisor");
			b=s.next();
			dn.pasarAlObjeto(a, b);
			System.out.println(a+"/"+b+"="+dn.dividir());
		}catch(NumberFormatException e){
			System.out.println("Ingresa solo numeros enteros");
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(InputMismatchException e){
			System.out.println("Eso no es un numero, eu");
		}
	}
}
