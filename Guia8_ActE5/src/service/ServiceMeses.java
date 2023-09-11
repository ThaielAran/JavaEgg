package service;

import entidades.Meses;

public class ServiceMeses {

	public Meses crearMeses() {
		Meses m1=new Meses();
		String [] anio= {"Enero","Febrero","Marzo","Abril","Mayo","Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		m1.setMeses(anio);
		m1.setMesSecreto(anio[(int)(Math.random()*12)+1]);
		return m1;
	}
	public boolean buscarMes(Meses m, String mes) {
		return (m.getMesSecreto().equalsIgnoreCase(mes));
	}
}
