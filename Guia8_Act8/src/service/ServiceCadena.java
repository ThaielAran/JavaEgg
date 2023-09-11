package service;

import java.util.Scanner;

import entidades.Cadena;

public class ServiceCadena {

	public Cadena crearCadena() {
		Cadena c1=new Cadena();
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese la frase");
		c1.setFrase(s.next());
		return c1;
	}
	public int contarVocales(Cadena c) {
		int i=0, cont=0;
		while(i<c.getLongitud()) {
			if (c.getFrase().toLowerCase().charAt(i)=='a' || c.getFrase().toLowerCase().charAt(i)=='e' || c.getFrase().toLowerCase().charAt(i)=='i' || c.getFrase().toLowerCase().charAt(i)=='o' || c.getFrase().toLowerCase().charAt(i)=='u')
				cont++;
			i++;
		}
		return cont;
	}
	public void invertirFrase(Cadena c) {
		int i=c.getLongitud()-1;
		while(i<=0) {
			if(i>0)
				System.out.print(c.getFrase().charAt(i));
			else
				System.out.println(c.getFrase().charAt(i));
			i--;
		}
	}
	public int vecesRepetido(Cadena c, String car) {
		int cont=0, i=0;
		char ca=car.charAt(0);
		while(i<c.getLongitud()) {
			if (c.getFrase().charAt(i)==ca) {
				cont++;
			}
		}
		return cont;
	}
	public void compararLongitud(Cadena c, String frase) {
		if(frase.length()<c.getLongitud())
			System.out.println("La frase ingresada es de menor longitud");
		else if(frase.length()>c.getLongitud())
			System.out.println("La frase ingresada es de mayor longitud");
		else
			System.out.println("La frase ingresada es de igual longitud");
	}
	public void unirFrases(Cadena c, String frase) {
		System.out.println(c.getFrase().concat(frase));
	}
	public void reemplazar(Cadena c, String letra) {
		int i=0;
		while(i<c.getLongitud()) {
			if (c.getFrase().toLowerCase().charAt(i)=='a')
				System.out.print(letra);
			else
				System.out.print(c.getFrase().charAt(i));
		}
	}
	public boolean contiene(Cadena c, String letra) {
		int i=0;
		char car=letra.charAt(0);
		while(i<c.getLongitud()) {
			if (c.getFrase().toLowerCase().charAt(i)==car)
				return true;
		if (i==c.getLongitud())
			return false;
		}
		return false;
	}
}
