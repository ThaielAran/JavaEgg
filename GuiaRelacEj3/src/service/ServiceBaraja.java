package service;

import java.util.ArrayList;
import java.util.Collections;

import entities.Baraja;
import entities.Carta;

public class ServiceBaraja {

	
	public Baraja crearBaraja() {
		Baraja b=new Baraja();
		ServiceCarta srvC =new ServiceCarta();
		b.setBaraja(new ArrayList<Carta>());
		for(int i=0;i<40;i++) {
			Carta c1=srvC.cartaNueva();
			b.getBaraja().add(c1);
		}
		System.out.println(b.toString());
		return b;
	}
	public void barajar(Baraja b) {
		Collections.shuffle(b.getBaraja());
	}
	
	public void siguienteCarta(Baraja b) {
		if(!b.getBaraja().isEmpty()) {
			System.out.println(b.getBaraja().get(0));
			b.getBaraja().get(0);
			b.getBajadas().add((b.getBaraja().get(0)));
			b.getBaraja().remove(0);
		}else
			System.out.println("Te quedaste sin cartas..");
		
	}
	public void cartasDisponibles(Baraja b) {
		System.out.println(b.getBaraja().size());
	}
	public void darCartas(Baraja b, int num) {
		if (num<=b.getBaraja().size()) {
			for (int i = num; i > 0; i--) {
				this.siguienteCarta(b);
			} 
		}else
			System.out.println("Eeeeh son muchas!");
	}
	public void cartasMonton(Baraja b) {
		System.out.println(b.toString2());
	}
	public void mostrarBaraja(Baraja b) {
		System.out.println(b.getBaraja().toString());
	}
}
