package standardpackage;
/*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.*/
import java.util.Scanner;
public class Guia7_EjExtra04 {
	public static void main(String[]args) {
		int num;
		Scanner s=new Scanner(System.in);
		try {
			do {
				System.out.println("Ingrese un numero entre 1 y 10");
				num=s.nextInt();
			}while(num<1||num>10);
			switch (num) {
				case 1:
					System.out.println("I");
					break;
				case 2:
					System.out.println("II");
					break;
				case 3:
					System.out.println("III");
					break;
				case 4:
					System.out.println("IV");
					break;
				case 5:
					System.out.println("V");
					break;
				case 6:
					System.out.println("VI");
					break;
				case 7:
					System.out.println("VII");
					break;
				case 8:
					System.out.println("VIII");
					break;
				case 9:
					System.out.println("IX");
					break;
				case 10:
					System.out.println("X");
					break;
					
			}
		}catch(Exception exc){
			System.out.println(exc);
		}
		s.close();
	}
}
