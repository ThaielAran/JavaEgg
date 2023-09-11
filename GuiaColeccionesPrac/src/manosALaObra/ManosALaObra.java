package manosALaObra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*1.Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno.
  2.Toma la Lista, el Conjunto y el Mapa que hiciste previamente y elimina en cada uno un objeto de
cada forma que aprendiste arriba.
  3.Crea una lista de Libros y muestra el título de cada uno con un bucle.*/
public class ManosALaObra {

	public static void main(String[]args) {
		
		ArrayList<Integer> listaNumeros=new ArrayList<Integer>();
		for(int i=0;i<5;i++) {
			int num=3+i;
			listaNumeros.add(num);
		}
		listaNumeros.remove(2);
		for(int i:listaNumeros) {
			System.out.println(i);
		}
		
		HashSet<Integer> conjuntoNumeros=new HashSet<Integer>();
		for(int i=0;i<5;i++) {
			int num=5+i;
			conjuntoNumeros.add(num);
		}
		conjuntoNumeros.remove(6);
		for(int i:conjuntoNumeros) {
			System.out.println(i);
		}
		
		HashMap<Integer,String> mapaNumeros=new HashMap<Integer, String>();
		for(int i=0;i<5;i++) {
			int dni=3445766+i;
			String nombre="Juan Carlos"+i;
			mapaNumeros.put(dni, nombre);
		}
		mapaNumeros.remove(3445767);
		for(Map.Entry<Integer,String> entry:mapaNumeros.entrySet()) 
			System.out.println("dni="+entry.getKey()+", nombre="+entry.getValue());
		
	
	
	
	}
}
