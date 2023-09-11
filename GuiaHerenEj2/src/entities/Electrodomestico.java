package entities;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/*precio, color, consumoEnergetico, peso*/

public class Electrodomestico {

	private final int PRECIOINICIAL= 1000;
	
	protected double precio;
	protected String color;
	protected char consumoEnergetico;
	protected int peso;
	
	public Electrodomestico(double precio, String color, char consumoEnergetico, int peso) {
		super();
		this.precio = precio;
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}
	public Electrodomestico() {
		super();
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}
	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Electrodomestico [precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico
				+ ", peso=" + peso + "]";
	}
	/*Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.*/
	private char comprobarConsumoEnergetico(Character letra) {
		letra=Character.toLowerCase(letra);
		return (letra>='a'&& letra<='f')?letra:'f';
		/*if (letra>='a'&& letra<='f') {
			return letra;
		}else {
			return 'f';
			}*/
	}
	/*Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible*/
	private String comprobarColor(String color) {
		List<String> colores= List.of("blanco","negro","rojo","azul","gris");
		return colores.contains(color)?color:colores.get(0);
	}
	
	/*Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.*/
	static Scanner s=new Scanner(System.in).useDelimiter("\r\n");
	
	public void crearElectrodomestico() {            
		System.out.println("Ingrese el color");
		this.color=comprobarColor(s.next());
		System.out.println("Ingrese el peso");
		this.peso=s.nextInt();
		System.out.println("Ingrese el consumo energetico");
		this.consumoEnergetico=comprobarConsumoEnergetico(s.next().charAt(0));
		this.precio=PRECIOINICIAL;
	}
	/*Método precioFinal(): según el Consumo Energético (CE) y su tamaño, aumentará el valor del
							precio. Esta es la lista de precios:
							
							LETRA PRECIO
								A $1000
								B $800
								C $600
								D $500
								E $300
								F $100

							PESO 			 PRECIO
							Entre 1 y 19 kg  $100
							Entre 20 y 49 kg $500
							Entre 50 y 79 kg $800
							Mayor que 80 kg  $1000*/
	
	static HashMap<Character,Integer> listaPrecios=new HashMap<Character,Integer>();
	public double precioFinal() {
		listaPrecios.put('a', 1000);		//Se busca la letra de CE como key															--
		listaPrecios.put('b', 800);			//en un HashMap y se añade el value
		listaPrecios.put('c', 600);			//al precio total
		listaPrecios.put('d', 500);
		listaPrecios.put('e', 300);
		listaPrecios.put('f', 100);
		double precioFinal=this.precio+listaPrecios.get(this.consumoEnergetico);
		if(this.peso<19) {
			this.precio=precioFinal+100;
			return precioFinal+100;
		}else if(this.peso<49) {
			this.precio=precioFinal+500;
			return precioFinal+500;
		}else if(this.peso<79) {
			this.precio=precioFinal+800;
			return precioFinal+800;
		}else {
			this.precio=precioFinal+1000;
			return precioFinal+1000;
		}
	}
	
	
	
	
	
}
