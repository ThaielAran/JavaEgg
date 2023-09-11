package entidades;

public class Cuenta {

	private int numeroCuenta;
	private int dni;
	private int saldo;
	
	public Cuenta() {
	}

	public Cuenta(int numeroCuenta, int dni, int saldo, double interes) {
		this.numeroCuenta = numeroCuenta;
		this.dni = dni;
		this.saldo = saldo;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", dni=" + dni + ", saldo=" + saldo + "]";
	}
	
	
}
