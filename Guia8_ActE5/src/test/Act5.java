package test;

import java.util.Scanner;

import entidades.Meses;
import service.ServiceMeses;

/*Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!*/

public class Act5 {

	public static void main(String[]args) {
		String mes;
		Meses m=new Meses();
		Scanner s=new Scanner(System.in);
		ServiceMeses serv=new ServiceMeses();
		m=serv.crearMeses();
		System.out.println("Adivine el mes secreto:");
		mes=s.nextLine();
		while(!serv.buscarMes(m, mes)) {
			System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
			mes=s.nextLine();
		}
		System.out.println("Ha acertado!!");
	}
}
