package main;

import java.util.Scanner;

public class Jugador {

	private int id;
	private String nombre;
	private boolean vivo;
	
	public Jugador(int id, String nombre, boolean vivo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.vivo = vivo;
	}
	public Jugador() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isVivo() {
		return vivo;
	}
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	/*• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.*/
	int cont=0;
	static Scanner s=new Scanner(System.in).useDelimiter("\r\n");
	public Jugador crearJugador() {
		Jugador j=new Jugador();
		cont++;
		j.setId(cont);
		System.out.println("Ingrese el nombre");
		j.setNombre(s.next());
		j.setVivo(true);
		return j;
	}
	public boolean gatillo(Revolver r) {
		if(r.click()) {
			System.out.println(">¡¡¡BANG!!!<");
			this.setVivo(false);
			r.siguiente();
			return true;
		}else
			System.out.println(">Click...<");
			r.siguiente();
			return false;
	}
	@Override
	public String toString() {
		return "Jugador " + id + ": " + nombre ;
	}
}
