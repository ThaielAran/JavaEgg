package entities;

import java.util.ArrayList;

public class Familia {

	/*Dirección
	IDE
	N° de lote
	Barrio
	Localidad*/
	protected String direcion;
	protected int ide;
	protected int numLote;
	protected String barrio;
	protected String localidad;
	protected ArrayList<Persona> listaIntegrantes=new ArrayList<Persona>();
	protected InfoVivienda vivienda;
	
	public Familia() {
	}
	public Familia(String direcion, int ide, int numLote, String barrio, String localidad,
			ArrayList<Persona> listaIntegrantes, InfoVivienda vivienda) {
		this.direcion = direcion;
		this.ide = ide;
		this.numLote = numLote;
		this.barrio = barrio;
		this.localidad = localidad;
		this.listaIntegrantes = listaIntegrantes;
		this.vivienda = vivienda;
	}
	
	public String getDirecion() {
		return direcion;
	}
	public void setDirecion(String direcion) {
		this.direcion = direcion;
	}
	public int getIde() {
		return ide;
	}
	public void setIde(int ide) {
		this.ide = ide;
	}
	public int getNumLote() {
		return numLote;
	}
	public void setNumLote(int numLote) {
		this.numLote = numLote;
	}
	public String getBarrio() {
		return barrio;
	}
	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public ArrayList<Persona> getListaIntegrantes() {
		return listaIntegrantes;
	}
	public void setListaIntegrantes(ArrayList<Persona> listaIntegrantes) {
		this.listaIntegrantes = listaIntegrantes;
	}
	public InfoVivienda getVivienda() {
		return vivienda;
	}
	public void setVivienda(InfoVivienda vivienda) {
		this.vivienda = vivienda;
	}
	
}
