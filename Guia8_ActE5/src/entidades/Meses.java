package entidades;

public class Meses {

	private String[] meses=new String[12];
	private String mesSecreto;
	
	public Meses() {
	}
	public Meses(String[] meses) {
		this.meses = meses;
	}

	public String[] getMeses() {
		return meses;
	}
	public void setMeses(String[] meses) {
		this.meses = meses;
	}
	public String getMesSecreto() {
		return mesSecreto;
	}
	public void setMesSecreto(String mesSecreto) {
		this.mesSecreto = mesSecreto;
	}
	
}
