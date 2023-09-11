package entities;

public class Alojamiento {

	private int idReserva;

	public Alojamiento(int idReserva) {
		this.idReserva = idReserva;
	}

	public Alojamiento() {
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	@Override
	public String toString() {
		return "Reserva=" + idReserva;
	}
	
}
