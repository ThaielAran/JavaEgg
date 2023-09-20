package entities;

import java.time.LocalDate;

public class Nino extends Persona {

	public Nino() {
		super();
	}

	public Nino(int numeroOrden, String apellido, String nombre, LocalDate nacimiento, int dni, String sexo,
			String vinculo, ProblemaSalud problema, AbordajeNutric abordaje, Familia famili) {
		super(numeroOrden, apellido, nombre, nacimiento, dni, sexo, vinculo, problema, abordaje, famili);
	}
	
}
