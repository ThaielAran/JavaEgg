package entities;

public class AbordajeNutric {
	
	private int nroOrden;
	private int edad;
	private double peso;
	private double altura;
	private boolean eutrofico;
	private boolean bajoPeso;
	private boolean sobrePeso;
	
	public AbordajeNutric() {
		super();
	}
	public AbordajeNutric(int nroOrden, int edad, double peso, double altura, boolean eutrofico, boolean bajoPeso, boolean sobrePeso) {
		super();
		this.nroOrden = nroOrden;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
		this.eutrofico = eutrofico;
		this.bajoPeso = bajoPeso;
		this.sobrePeso = sobrePeso;
	}
	public int getNroOrden() {
		return nroOrden;
	}
	public void setNroOrden(int nroOrden) {
		this.nroOrden = nroOrden;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public boolean isEutrofico() {
		return eutrofico;
	}
	public void setEutrofico(boolean eutrofico) {
		this.eutrofico = eutrofico;
	}
	public boolean isBajoPeso() {
		return bajoPeso;
	}
	public void setBajoPeso(boolean bajoPeso) {
		this.bajoPeso = bajoPeso;
	}
	public boolean isSobrePeso() {
		return sobrePeso;
	}
	public void setSobrePeso(boolean sobrePeso) {
		this.sobrePeso = sobrePeso;
	}
	public void calculoImc() {
		//Peso en kilogramos dividio en estatura en metros cuadrados
		int imc=(int)(peso/Math.pow(altura, 2));
		if (imc<18) {
			eutrofico=false;
			bajoPeso=true;
			sobrePeso=false;
		}else if(imc<25) {
			eutrofico=true;
			bajoPeso=false;
			sobrePeso=false;
		}else {
			eutrofico=false;
			bajoPeso=false;
			sobrePeso=true;
		}
	}
}
