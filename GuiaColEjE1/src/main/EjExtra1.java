package main;

import service.ServiceNumeros;

/*Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).*/

public class EjExtra1 {

	public static void main(String[]args) {
		ServiceNumeros serv=new ServiceNumeros();
		serv.agregarNumeros();
		System.out.println("Se han ingresado "+serv.valoresIngresados()+" numeros");
		System.out.println("Suma total de valores: "+serv.sumaValores());
		System.out.println("Media de valores: "+serv.calcularMedia());
	}
}
