package standardpackage;
/*Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
este resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.*/
import java.util.Scanner;
public class Guia7_EjExtra09 {
	public static void main (String[]args) {
		int num1, num2, coc=0;
		Scanner s=new Scanner(System.in);
		try {
			do {
				System.out.println("Ingrese el dividendo");
				num1=s.nextInt();
			}while (num1<=1);
			do {
				System.out.println("Ingrese el divisor (< dividendo)");
				num2=s.nextInt();
			}while ((num2<=1)||(num2>num1));
			while(num1>=num2) {
				num1-=num2;
				coc++;
			}
			System.out.println("Cociente: "+coc+"\nResiduo: "+num1);
		}catch (Exception exc) {
			System.out.println(exc);
		}
		s.close();
	}
}
