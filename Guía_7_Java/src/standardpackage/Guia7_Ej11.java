package standardpackage;
/*Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
del programa, caso contrario se vuelve a mostrar el menú.*/
import java.util.Scanner;
public class Guia7_Ej11 {
	public static void main(String[]args) {
		int num1, num2, opc;
		String confirmacion="n";
		Scanner entrada=new Scanner(System.in);
		try {
			do {
				System.out.println("Ingrese dos enteros positivos:");
				num1=entrada.nextInt();
				num2=entrada.nextInt();
			}while((num1<0)||(num2<0));
			
			do {
				do {
					System.out.println("  MENU \nIngrese una opcion.\n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Salir");
					opc=entrada.nextInt();
				}while((opc<1)||(opc>5));
				
				switch(opc) {
					case 1:
						System.out.println(num1+num2);
						break;
					case 2:
						System.out.println(num1-num2);
						break;
					case 3:
						System.out.println(num1*num2);
						break;
					case 4:
						System.out.println(num1/num2);
						break;
					case 5:
						System.out.println("Está seguro que desea salir delprograma?(S/N)");
						confirmacion=entrada.next();
						break;
				}
				System.out.println(confirmacion);
			}while(!confirmacion.equals("s"));
			
		}catch(Exception exc) {
			System.out.println(exc);
		}
		entrada.close();
	}
}
