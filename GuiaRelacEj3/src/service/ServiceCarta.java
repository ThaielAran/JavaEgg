package service;

import entities.Carta;

public class ServiceCarta {

	public ServiceCarta() {
		super();
	}

	public int c=1;
	public int i=0;
	private String[] palos= {"basto","copa","oro","espada"};
	
	public Carta cartaNueva() {
		Carta c1=new Carta();
		if (c == 8)
			c += 2;
		else if (c == 13) {
			c = 1;
			i++;
		}
		c1.setNumero(c);
		c1.setPalo(palos[i]);
		c++;
		return c1;
	}
}
