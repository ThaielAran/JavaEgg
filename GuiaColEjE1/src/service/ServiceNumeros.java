package service;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceNumeros {

	public ArrayList <Integer> listaNumeros = new ArrayList<Integer>();
	Scanner s=new Scanner(System.in);
	//System.out.println("");
	
	public void agregarNumeros() {
		int num;
		System.out.println("Ingrese un numero entero (-99 para salir)");
		num=s.nextInt();
		if(num!=-99) {
			listaNumeros.add(num);
			agregarNumeros();
		}
	}
	
	public int valoresIngresados() {
		return listaNumeros.size();
	}
	
	public int sumaValores() {
		int suma=0;
		for(int i:listaNumeros) {
			suma+=i;
		}
		return suma;
	}
	
	public double calcularMedia() {
		double media=0;
		for(int i:listaNumeros) {
			media+=i;
		}
		return media/listaNumeros.size();
	}
}
