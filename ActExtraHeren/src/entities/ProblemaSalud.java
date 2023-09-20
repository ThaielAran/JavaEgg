package entities;

public class ProblemaSalud {

	private int nroOrden;
	private int ideFamilia;
	private boolean hta;
	private boolean dbt;
	
	public ProblemaSalud() {
		super();
	}
	public ProblemaSalud(int nroOrden, int ideFamilia, boolean hta, boolean dbt) {
		super();
		this.nroOrden = nroOrden;
		this.ideFamilia = ideFamilia;
		this.hta = hta;
		this.dbt = dbt;
	}
	public int getNroOrden() {
		return nroOrden;
	}
	public void setNroOrden(int nroOrden) {
		this.nroOrden = nroOrden;
	}
	public int getIdeFamilia() {
		return ideFamilia;
	}
	public void setIdeFamilia(int ideFamilia) {
		this.ideFamilia = ideFamilia;
	}
	public boolean isHta() {
		return hta;
	}
	public void setHta(boolean hta) {
		this.hta = hta;
	}
	public boolean isDbt() {
		return dbt;
	}
	public void setDbt(boolean dbt) {
		this.dbt = dbt;
	}
	
}
