package service;

import java.util.Scanner;

import entidades.Cuenta;

public class ServiceCuenta {

	public Cuenta crearCuenta() {
		Cuenta c=new Cuenta();
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese el numero de cuenta");
		c.setNumeroCuenta(s.nextInt());
		System.out.println("Ingrese el DNI del cliente");
		c.setDni(s.nextInt());
		System.out.println("Ingrese el saldo actual");
		c.setSaldo(s.nextInt());
		return c;
	}
	
	public void ingresar(Cuenta c, double ingreso) {
		c.setSaldo(c.getSaldo()+(int)ingreso);
	}
	
	public void retirar(Cuenta c, double retiro) {
		if(c.getSaldo()<retiro) {
			c.setSaldo(0);
		}else {
			c.setSaldo(c.getSaldo()-(int)retiro);
		}
	}
	
	public void extraccionRapida(Cuenta c, double retiro) {
		if(retiro>c.getSaldo()*0.20)
			c.setSaldo((int)(c.getSaldo()-retiro));
		else
			System.out.println("El monto indicado supera limite de extraccion rapida");
	}
	
	public void consultarSaldo(Cuenta c) {
		System.out.println("Su saldo es de "+c.getSaldo());
	}
	public void consultarDatos(Cuenta c) {
		System.out.println(c.toString());
	}
}
