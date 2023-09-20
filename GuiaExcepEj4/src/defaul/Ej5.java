package defaul;

import java.util.InputMismatchException;
import java.util.Scanner;

/*public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 500 + 1);
        int guess = 0, intentos = 0;
        
        do {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            try {
                System.out.println("Adivina el valor entre 1 y 500!");
                guess = leer.nextInt();
                intentos++;

                if (guess < 1 || guess > 500) {
                    throw new MiException("entre 1 y 500 dije");
                } else if (guess < randomNum) {
                    System.out.println("El numero que buscas en mayor al ingresado");
                } else if (guess > randomNum) {
                    System.out.println("El numero que buscas es menor al ingresado");
                }
                 catch (MiException e) {
                System.out.println(e);

            } catch (InputMismatchException e) {
                System.out.println(e);
                System.out.println("Creo que eso no era un numero");

            } catch (Exception e) {
                System.out.println(e);
                System.out.println("akajskasjka esta no te la sabia");
            } /*finally {
                guess = 0;
            }

        } while (guess != randomNum);

        System.out.println("El numero era " + randomNum + "!"
                + "\nTe tomó " + intentos + " intentos");
    }*/

/*Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.*/

public class Ej5 {

	public static void main (String[]args) {
		int numAleatorio=(int)(Math.random()*500+1);
		int guess=0, intentos=0;
		Scanner s=new Scanner(System.in).useDelimiter("\r\n");
		
		do {
			try {
				System.out.println("Adivine un numero entre 1 y 500");
				guess = s.nextInt();
				intentos++;
				if ((guess<1)||(guess>500)) {
					throw new MiExcepcion("Numero fuera de rango..");
				}
				if(guess<numAleatorio) {
					System.out.println("El numero es mayor al ingresado");
				}else if(guess>numAleatorio) {
					System.out.println("El numero es menor al ingresado");
				}
			} catch (InputMismatchException e) {
				System.out.println("Numeros solamente..");
				s.next();
			} catch (MiExcepcion e) {
				System.out.println(e);
			} catch (Exception e) {
				System.out.println("Lo que?");
			}
		} while (numAleatorio!=guess);
		
		System.out.println("El numero era " + numAleatorio + "!"
                + "\nTe tomó " + intentos + " intentos");
	}
}
