package entities;

import java.util.ArrayList;

public class Baraja {

	private ArrayList<Carta> baraja = new ArrayList<Carta>();
	private ArrayList<Carta> bajadas = new ArrayList<Carta>();

	public Baraja() {
		super();
	}
	public Baraja(ArrayList<Carta> baraja) {
		super();
		this.baraja = baraja;
	}

	public ArrayList<Carta> getBaraja() {
		return baraja;
	}
	public void setBaraja(ArrayList<Carta> baraja) {
		this.baraja = baraja;
	}
	public ArrayList<Carta> getBajadas() {
		return bajadas;
	}
	public void setBajadas(ArrayList<Carta> bajadas) {
		this.bajadas = bajadas;
	}
	@Override
	public String toString() {
		return "Baraja [baraja=" + baraja + "]";
	}
	
	public String toString2() {
		return "Baraja [baraja=" + bajadas + "]";
	}
}
