package entities;

import java.util.ArrayList;

public class ConFactoresDeRiesgo extends Familia {

	private ArrayList<Integer> factores =new ArrayList<Integer>();

	public ConFactoresDeRiesgo() {
		super();
	}
	public ConFactoresDeRiesgo(String direcion, int ide, int numLote, String barrio, String localidad,
			ArrayList<Persona> listaIntegrantes, InfoVivienda vivienda) {
		super(direcion, ide, numLote, barrio, localidad, listaIntegrantes, vivienda);
	}
	public ConFactoresDeRiesgo(ArrayList<Integer> factores) {
		super();
		this.factores = factores;
	}
	
}
