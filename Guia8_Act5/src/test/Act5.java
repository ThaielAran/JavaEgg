package test;

import java.util.Scanner;
import entidades.Cuenta;
import service.ServiceCuenta;

/*Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta*/

public class Act5 {

	public static void main(String[]args) {
		ServiceCuenta serv=new ServiceCuenta();
		Cuenta c1=new Cuenta();
		c1=serv.crearCuenta();
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int opc=0;
		double monto;
		do {
			System.out.println("     MENU\nIngrese una opcion");
			System.out.println("1.Extraccion rapida\n2.Consultar datos\n3.Consultar saldo\n4.Deposito\n5.Extraccion\n6.Salir");
			opc=s.nextInt();
			switch (opc) {
			case 1:
				System.out.println("Ingrese el monto a extraer");
				monto=s.nextDouble();
				serv.extraccionRapida(c1, monto);
				break;
			case 2:
				serv.consultarDatos(c1);
				break;
			case 3:
				serv.consultarSaldo(c1);
				break;
			case 4:
				System.out.println("Ingrese el monto a depositar");
				monto=s.nextDouble();
				serv.ingresar(c1, monto);
				break;
			case 5:
				System.out.println("Ingrese el monto a extraer");
				monto=s.nextDouble();
				serv.retirar(c1, monto);
				break;
			default:
				System.out.println("No ingresó una opcion valida");
				break;
			}
		}while (opc!=6);
		System.out.println("Salio.");
	}
}
