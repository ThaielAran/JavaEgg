package standardpackage;
/*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/
import java.util.Scanner;
public class Guia7_EjExtra01 {
		public static void main(String[]args) {
			final int DIA=1440;
			final int HORA=60;
			int mins, aux;
			Scanner entrada=new Scanner(System.in);
			try {
				System.out.println("Ingrese una cantidad de minutos");
				mins=entrada.nextInt();
				aux=mins%DIA;
				System.out.println("Los minutos ingresados corresponden a "+mins/DIA+" dia/s, "+aux/HORA+" hora/s.");
				
			}catch(Exception exc){
				System.out.println(exc);
							}
			entrada.close();
		}
}
