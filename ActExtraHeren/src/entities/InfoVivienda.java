package entities;

public class InfoVivienda {

	private int numDormis;
	private String tipoParedes;
	private String tipoPiso;
	private boolean iluminacion;
	public InfoVivienda(int numDormis, String tipoParedes, String tipoPiso, boolean iluminacion) {
		super();
		this.numDormis = numDormis;
		this.tipoParedes = tipoParedes;
		this.tipoPiso = tipoPiso;
		this.iluminacion = iluminacion;
	}
	public int getNumDormis() {
		return numDormis;
	}
	public void setNumDormis(int numDormis) {
		this.numDormis = numDormis;
	}
	public String getTipoParedes() {
		return tipoParedes;
	}
	public void setTipoParedes(String tipoParedes) {
		this.tipoParedes = tipoParedes;
	}
	public String getTipoPiso() {
		return tipoPiso;
	}
	public void setTipoPiso(String tipoPiso) {
		this.tipoPiso = tipoPiso;
	}
	public boolean isIluminacion() {
		return iluminacion;
	}
	public void setIluminacion(boolean iluminacion) {
		this.iluminacion = iluminacion;
	}
	
	
}
