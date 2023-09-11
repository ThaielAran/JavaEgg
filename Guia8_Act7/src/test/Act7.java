package test;

import entidades.Persona;
import service.ServicePersona;

/*Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores*/

public class Act7 {
	public static final double TOTAL=4;
	public static void main(String[]args) {
		double flacos=0, fit=0, gordos=0, menores=0, mayores=0;
		Persona [] arrPersonas=new Persona [(int)TOTAL];
		ServicePersona serv=new ServicePersona();
		for (int i=0; i<TOTAL;i++) {

			arrPersonas[i]=serv.crearPersona();

			if (serv.calcularIMC(arrPersonas[i])==-1) {
				flacos++;
				System.out.println("Esta por debajo de su peso ideal");
			}else if (serv.calcularIMC(arrPersonas[i])==0) {
				fit++;
				System.out.println("Esta dentro su peso ideal");
			}else {
				gordos++;
				System.out.println("Esta por encima de su peso ideal");
			}

			if (serv.esMayorDeEdad(arrPersonas[i])){
				mayores++;
				System.out.println("Es mayor de edad");
			}else {
				menores++;
				System.out.println("Es menor de edad");
			}
		}
		System.out.println("Debajo del peso ideal: "+(flacos/TOTAL)*100+"%"+"\nDentro del peso ideal: "+(fit/TOTAL)*100+"%"+"\nEncima del peso ideal: "+(gordos/TOTAL)*100+"%"+"\nMayores: "+(mayores/TOTAL)*100+"%"+"\nMenores: "+(menores/TOTAL)*100+"%");
	}
}
