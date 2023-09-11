package standardpackage;
/*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
y la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.*/
import java.util.Scanner;
public class Guia7_EjExtra08 {
	public static void main(String[]args) {
		int num, pares=0, impares=0, cont=0;
		Scanner s=new Scanner(System.in);
		try {
			do {
				System.out.println("Ingrese un valor");
				num=s.nextInt();
				if(num%5==0)
					break;
				if(num%2==0)
					pares++;
				else
					impares++;
				if(num>0)
					cont++;
			}while(num%5!=0);
			System.out.println("Numeros leidos: "+cont+"\nNumeros pares: "+pares+"\nNumeros impares: "+impares);
		}catch(Exception exc) {
			System.out.println(exc);
		}
		s.close();
	}
}
