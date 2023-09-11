package service;

import java.util.Scanner;

import entidades.Ahorcado;

public class ServiceAhorcado {

	int cont=0;
	char[] correctos=new char[10];
	Scanner s=new Scanner(System.in);
	
	/*Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
	Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
	vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
	de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
	máximas, el valor que ingresó el usuario y encontradas en 0.*/
	public void crearJuego(Ahorcado juego) {
		//int intentos;
		String palabra;
		do {
			System.out.println("Ingrese una palabra:");
			palabra = s.next();
		} while (palabra.length()<3);
		/*do {
			System.out.println("Ingrese la cantidad maxima de jugadas:");
			intentos=s.nextInt();
		} while (intentos<3);*/

		juego.setLargo(palabra.length());
		juego.setPalabra(palabra.toCharArray());
		juego.setLetrasEncontradas(0);
		juego.setJugadas(7);
		
	}
	public char[] palabraAVector(String palabra) {
		char[] vector=new char[palabra.length()];
		for (int i=0;i<palabra.length();i++) {
			vector[i]=palabra.charAt(i);
		}
		return vector;
	}
	
	/* Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.*/
	public void longitud(Ahorcado juego) {
		System.out.println("La palabra tiene "+juego.getPalabra().length+" letras.");
	}
	
	/*Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
	letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.*/
	public void buscarLetra(Ahorcado juego, char letra) {
		if(encontradas(juego, letra)) {
			for (int j=0;j<juego.getLargo();j++) 
				if(juego.getPalabra()[j]==letra) 
					System.out.println("La letra se encontro en la posicion "+j);
		}else
			System.out.println("La letra no se encontro");
	}
	
	/* Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.*/
	public boolean encontradas(Ahorcado juego, char letra) {
		System.out.println("Han sido encontradas "+ juego.getLetrasEncontradas()+" letras.\nLe quedan por encontrar "+(juego.getLargo()-juego.getLetrasEncontradas())+" letras.");
		int i=0, k=0;
		while((k<10)&&(correctos[k]!=letra))
			k++;
		if(k==10) {
			while((i<juego.getLargo())&&(juego.getPalabra()[i]!=letra)) {
				i++;
			}
			if (i<juego.getLargo()) {
				correctos[cont]=letra;
				cont++;
				for (int j=0;j<juego.getLargo();j++) {
					if(juego.getPalabra()[j]==letra) {
						juego.setLetrasEncontradas(juego.getLetrasEncontradas()+1);
					}
				}
				return true;
			}else
				juego.setJugadas(juego.getJugadas()-1);;
				return false;	
		}
		else
			System.out.println("La letra ya se ha ingresado y encontrado.");
			return false;
	}
	
// Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
	public void intentos(Ahorcado juego) {
		System.out.println("Le quedan "+juego.getJugadas()+" intentos");
	}

/* Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.*/
	public void juego() {
		char letra;
		Ahorcado game=new Ahorcado();
		crearJuego(game);
		
		do {
			System.out.println("Ingrese una letra");
			letra = s.next().charAt(0);
			longitud(game);
			buscarLetra(game, letra);
			intentos(game);
			guiones(game);
			dibujo(game);
		} while ((game.getJugadas()>0)&&(game.getLetrasEncontradas()<game.getLargo()));
		if(game.getLetrasEncontradas()==game.getLargo()) 
			System.out.println("Felicitaciones! Ha encontrado todas las letras! :D");
		else
			System.out.println("Te has quedado sin intentos... :(");
	}
	public void guiones(Ahorcado juego) {
		for (int i=0; i<juego.getLargo();i++) {
			for (int j=0; j<cont; j++) {
				if (juego.getPalabra()[i]==correctos[j]) {
					System.out.print(juego.getPalabra()[i]);
					break;
				}else if (j==cont-1)
					System.out.print("_");
			}
			
		}
		System.out.println("");
	}
	/*___________
	|	         O
	|			/|\
	|	         -
	|			/ \
	|
	==============*/
	public void dibujo(Ahorcado juego) {
		switch (juego.getJugadas()) {
		case 7:
			System.out.println("____________\n|\n|\n|\n|\n|\n==============");
			break;
		case 6:
			System.out.println("____________\n|	    O\n|\n|\n|\n|\n==============");
			break;
		case 5:
			System.out.println("____________\n|	    O\n|           |\n|\n|\n|\n==============");
			break;
		case 4:
			System.out.println("____________\n|	    O\n|          /|\n|\n|\n|\n==============");
			break;
		case 3:
			System.out.println("____________\n|	    O\n|          /|\\ " + "\n|\n|\n|\n==============");
			break;
		case 2:
			System.out.println("____________\n|	    O\n|          /|\\\n|           -\n|\n|\n==============");
			break;
		case 1:
			System.out.println("____________\n|	    O\n|          /|\\\n|           -\n|          /\n|\n==============");
			break;
		case 0:
			System.out.println("____________\n|	    O\n|          /|\\\n|           -\n|          / \\\n|\n==============\"");
			break;
		}
	}
}


