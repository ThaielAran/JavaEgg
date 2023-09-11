package main;

import entities.Lavadora;
import entities.Televisor;

import java.util.ArrayList;

import entities.Electrodomestico;

/*Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.*/
/*Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.*/

public class Ejercicio2 {

	public static void main(String[] args) {
		ArrayList<Electrodomestico> listaElectrodomesticos=new ArrayList<Electrodomestico>();
		Lavadora l1= new Lavadora(1000,"gris",'C',56,29);
		Televisor t1= new Televisor(1000,"rojo",'A',20,42,true);
		Lavadora l2= new Lavadora(1000, "azul", 'D', 40, 25);
		Televisor t2= new Televisor(1000, "gris", 'B', 25, 50, false);
		listaElectrodomesticos.add(t1);
		listaElectrodomesticos.add(t2);
		listaElectrodomesticos.add(l1);
		listaElectrodomesticos.add(l2);
		
		double sumaTele=0, sumaLava=0, sumaElec=0;
		for(Electrodomestico elec:listaElectrodomesticos) {
			System.out.println(elec.precioFinal());
			sumaElec+=elec.getPrecio();					//se suman los precios de todos los
														//electrodomesticos
			if(elec instanceof Televisor){
				sumaTele+=elec.getPrecio();				//suman precio Teles
			}else
				sumaLava+=elec.getPrecio();				//suman precio Lavadoras
		}
		System.out.println("Televisores= "+sumaTele);
		System.out.println("Lavadoras= "+sumaLava);
		System.out.println("Electrodomesticos= "+sumaElec);
	}

}
