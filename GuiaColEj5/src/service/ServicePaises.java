package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ServicePaises {

	public HashSet <String> listaPaises=new HashSet<String>();
	Scanner s=new Scanner(System.in);
	//System.out.println("");
	
	public void cargarPaises() {
		String pais, opc;
		System.out.println("Ingrese un pais:");
		pais=s.nextLine();
		if(listaPaises.contains(pais)) {
			System.out.println("El pais ya se ha ingresado");
		}else {
			listaPaises.add(pais);
		}
		do {
			System.out.println("Desea ingresar otro pais? S/N");
			opc = s.nextLine();
		} while (!opc.equalsIgnoreCase("n")&&!opc.equalsIgnoreCase("s"));
		if(opc.equalsIgnoreCase("s")) {
			cargarPaises();
		}
	}
	public void mostrarPaises() {
		for(String i: listaPaises) {
			System.out.println(i);
		}
	}
	public void ordenarAlfabetic() {
		ArrayList<String> listaPais=new ArrayList<String>(listaPaises);
		Collections.sort(listaPais);
		System.out.println("\nOrdenado alfabeticamente:");
		for(String i: listaPais) {
			System.out.println(i);
		}
	}
	public void buscarYEliminar() {
		System.out.println("Ingrese un pais para eliminarlo de la lista");
		String pais=s.nextLine();
		Iterator<String> it=listaPaises.iterator();
		while(it.hasNext()) {
			if(it.next().equalsIgnoreCase(pais)) {
				it.remove();
			}
		}
	}
}
