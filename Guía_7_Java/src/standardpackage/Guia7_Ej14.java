package standardpackage;
/*Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €*/
import java.util.Scanner;
public class Guia7_Ej14 {
	public static void main(String[]args) {
		String divisa;
		double euros;
		Scanner entrada=new Scanner(System.in);
		try {
			do {
				System.out.println("Ingrese un valor (en euros)");
				euros=entrada.nextDouble();
			}while(euros<=0);
			do {
				System.out.println("Ingrese una moneda a la que convertir (libra, dolar o yen)");
				divisa=entrada.nextLine();
			}while((!divisa.equals("libra"))&&(!divisa.equals("dolar"))&&(!divisa.equals("yen")));
			convertirDivisa(euros, divisa);
		}catch(Exception exc) {
			System.out.println(exc);
		}
		entrada.close();
	}
	public static void convertirDivisa(double eur, String divisa) {
		switch (divisa) {
		case "libra":
			System.out.println(eur+" euros son "+eur*0.86+" libras");
			break;
		case "dolar":
			System.out.println(eur+" euros son "+eur*1.28611+" dolares");
			break;
		case "yen":
			System.out.println(eur+" euros son "+eur*129.852+" yenes");
			break;
		default:
			System.out.println("ERROR");
		}
	}
}
