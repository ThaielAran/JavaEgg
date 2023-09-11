package main;

public class Ej2 {

	public static void main(String[]args) {
		
		Equipo e=new Equipo();
		Jugador j1=new Jugador("Thaiel", "Gallardo", 7, "lateral derecho");
		e.getListaJugadores().add(j1);
		System.out.println(e.getListaJugadores().toString());
	}
}
