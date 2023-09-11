package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entities.Pelicula;
import utilidades.Comparadores;

/*deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.*/

public class ServicePelicula {

	Scanner s = new Scanner(System.in);
	ArrayList<Pelicula> listaPeliculas=new ArrayList<Pelicula>();
	
	public void crearPelicula(){
		String checkout;
		Pelicula p1=new Pelicula();
		System.out.println("Ingrese el titulo");
		p1.setTitulo(s.nextLine());
		System.out.println("Ingrese el director");
		p1.setDirector(s.nextLine());
		System.out.println("Ingrese la duracion en minutos");
		p1.setDuracion((double)s.nextInt()/60);
		listaPeliculas.add(p1);
		do {
			System.out.println("Desea ingresar otra pelicula? S/N");
			checkout = s.nextLine();
		} while (!checkout.equalsIgnoreCase("s")&&!checkout.equalsIgnoreCase("n"));
		if(checkout.equalsIgnoreCase("s"))
			crearPelicula();	
	}
	public void mostrarPeliculas() {
		for(Pelicula i: listaPeliculas) {
			System.out.println(i.toString());
		}
	}
	public void mostrarPeliculasMayores() {
		for(Pelicula i: listaPeliculas) {
			if(i.getDuracion()>1)
				System.out.println(i.toString());
		}
	}
	public void ordenarDecreciente() {
		System.out.println("Ordenadas por duracion (decreciente)");
		Collections.sort(listaPeliculas, Comparadores.compararDuracionDecr);
		mostrarPeliculas();
	}
	public void oredenarCrecienate() {
		System.out.println("Ordenadas por duracion (creciente)");
		Collections.sort(listaPeliculas, Comparadores.compararDuracionCrec);
		mostrarPeliculas();
	}
	public void oredenarTitulo() {
		System.out.println("Ordenadas por titulo");
		Collections.sort(listaPeliculas, Comparadores.compararTitulo);
		mostrarPeliculas();
	}
	public void ordenarDirector() {
		System.out.println("Ordenadas por director");
		Collections.sort(listaPeliculas, Comparadores.compararDirector);
		mostrarPeliculas();
	}
	
}














