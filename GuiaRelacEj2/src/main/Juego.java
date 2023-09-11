package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

	private ArrayList<Jugador> listaJugadores=new ArrayList<Jugador>();
	private Revolver boy;
	public Juego() {
		super();
	}
	public Juego(ArrayList<Jugador> listaJugadores, Revolver boy) {
		super();
		this.listaJugadores = listaJugadores;
		this.boy = boy;
	}
	public ArrayList<Jugador> getListaJugadores() {
		return listaJugadores;
	}
	public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
		this.listaJugadores = listaJugadores;
	}
	public Revolver getBoy() {
		return boy;
	}
	public void setBoy(Revolver boy) {
		this.boy = boy;
	}
	/*• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.*/
	public void llenarJuego(ArrayList<Jugador>jugadores, Revolver r) {
		this.setListaJugadores(jugadores);
		this.setBoy(r);
	}
	
	Scanner s=new Scanner(System.in).useDelimiter("\r\n");
	public void ronda() {
		String opc="s";
		for(Jugador j: this.getListaJugadores()) {
			
			if(j.isVivo()) {
				System.out.println(j.toString());
				do {
					System.out.println("Desea girar el barril? s/n");
					opc = s.next();
				} while (!opc.equalsIgnoreCase("s")&&!opc.equalsIgnoreCase("n"));
				if(opc.equalsIgnoreCase("s")) {
					this.boy.spin();
				}
				if(j.gatillo(boy)) {
					System.out.println("Se acabó el juego. "+j.getNombre()+ " murio");
					break;
				}else {
					System.out.println(j.getNombre()+" pasó la ronda");
			}
			}
		}
	}
}
