package entities;

import java.time.LocalDate;
import java.util.Objects;

public class Habitacion {

	private int nroHabitacion;
	private LocalDate fecha;
	private int nroPersonas;
	private boolean ocupada;
	private boolean reservada;
	
	public Habitacion() {
	}
	public Habitacion(int nroHabitacion) {
		this.nroHabitacion = nroHabitacion;
	}
	
	public Habitacion(int nroHabitacion, LocalDate fecha, int nroPersonas, boolean ocupada, boolean reservada) {
		super();
		this.nroHabitacion = nroHabitacion;
		this.fecha = fecha;
		this.nroPersonas = nroPersonas;
		this.ocupada = ocupada;
		this.reservada = reservada;
	}
	public int getNroHabitacion() {
		return nroHabitacion;
	}
	
	public void setNroHabitacion(int nroHabitacion) {
		this.nroHabitacion = nroHabitacion;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public int getNroPersonas() {
		return nroPersonas;
	}
	public void setNroPersonas(int nroPersonas) {
		this.nroPersonas = nroPersonas;
	}
	public boolean isOcupada() {
		return ocupada;
	}
	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}
	public boolean isReservada() {
		return reservada;
	}
	public void setReservada(boolean reservada) {
		this.reservada = reservada;
	}
	@Override
	public String toString() {
		return "Habitacion [nroHabitacion=" + nroHabitacion + ", fecha=" + fecha + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(fecha, nroHabitacion);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Habitacion other = (Habitacion) obj;
		return Objects.equals(fecha, other.fecha) && nroHabitacion == other.nroHabitacion;
	}
}
