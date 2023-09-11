package service;

import entidades.Matematica;

public class ServiceMatematica {

	public double devolverMayor(Matematica m) {
		if(m.getNum1()>m.getNum2())
			return m.getNum1();
		else
			return m.getNum2();
	}
	public double calcularPotencia(Matematica m) {
		double n1=Math.round(m.getNum1()), n2=Math.round(m.getNum2());
		if (n1>n2)
			return Math.pow(n1, n2);
		else 
			return Math.pow(n2, n1);
	}
	public double calculaRaiz(Matematica m) {
		double n1=Math.abs(m.getNum1()), n2=Math.abs(m.getNum2());
		if (n1<n2)
			return Math.sqrt(n1);
		else
			return Math.sqrt(n2);
	}
}
