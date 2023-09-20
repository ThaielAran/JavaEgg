package entities;

import java.util.ArrayList;

public class SinFactoresDeRiesgo extends Familia{

	private boolean mejora;

	public SinFactoresDeRiesgo() {
		super();
	}

	public SinFactoresDeRiesgo(String direcion, int ide, int numLote, String barrio, String localidad,
			ArrayList<Persona> listaIntegrantes, InfoVivienda vivienda) {
		super(direcion, ide, numLote, barrio, localidad, listaIntegrantes, vivienda);
	}

	public SinFactoresDeRiesgo(boolean mejora) {
		super();
		this.mejora = mejora;
	}

	
	
}
