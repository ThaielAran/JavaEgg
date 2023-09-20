package entities;

import java.time.LocalDate;

public class AdultoMayor extends Adulto {

	private boolean jubilacion;

	public AdultoMayor(int numeroOrden, String apellido, String nombre, LocalDate nacimiento, int dni, String sexo,
			String vinculo, ProblemaSalud problema, AbordajeNutric abordaje, Familia famili) {
		super(numeroOrden, apellido, nombre, nacimiento, dni, sexo, vinculo, problema, abordaje, famili);
	}

	public AdultoMayor(String estudio, boolean practicaDeporte, boolean trabaja, boolean obraSocial, boolean jubilacion) {
		super(estudio, practicaDeporte, trabaja, obraSocial);
		this.jubilacion=jubilacion;
	}
	
}
