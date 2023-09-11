package main;

import java.util.ArrayList;

public class Equipo {

	public ArrayList<Jugador>listaJugadores=new ArrayList<Jugador>();

	public Equipo() {
	}
	public Equipo(ArrayList<Jugador> listaJugadores) {
		this.listaJugadores = listaJugadores;
	}

	public ArrayList<Jugador> getListaJugadores() {
		return listaJugadores;
	}

	public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
		this.listaJugadores = listaJugadores;
	}
	
}
