package entities;

import java.time.LocalDate;
import java.util.Objects;

public class Reserva {

	private int id;
	private int numHabitacion;
	private int cantPersonas;
	private LocalDate fechaReserva;
	
	public Reserva(int id, int numHabitacion, int cantPersonas, LocalDate fechaReserva) {
		this.id = id;
		this.numHabitacion = numHabitacion;
		this.cantPersonas = cantPersonas;
		this.fechaReserva = fechaReserva;
	}
	public Reserva() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumHabitacion() {
		return numHabitacion;
	}
	public void setNumHabitacion(int numHabitacion) {
		this.numHabitacion = numHabitacion;
	}
	public int getCantPersonas() {
		return cantPersonas;
	}
	public void setCantPersonas(int cantPersonas) {
		this.cantPersonas = cantPersonas;
	}
	public LocalDate getFechaReserva() {
		return fechaReserva;
	}
	public void setFechaReserva(LocalDate fechaReserva) {
		this.fechaReserva = fechaReserva;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cantPersonas, fechaReserva, id, numHabitacion);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reserva other = (Reserva) obj;
		return cantPersonas == other.cantPersonas && Objects.equals(fechaReserva, other.fechaReserva) && id == other.id
				&& numHabitacion == other.numHabitacion;
	}
	@Override
	public String toString() {
		return "Reserva [id=" + id + ", numHabitacion=" + numHabitacion + ", cantPersonas=" + cantPersonas
				+ ", fechaReserva=" + fechaReserva + "]";
	}
	
	
}
