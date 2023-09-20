package entities;

import java.time.LocalDate;

public class Adulto extends Joven {
	
	protected boolean obraSocial;

    public Adulto(int numeroOrden, String apellido, String nombre, LocalDate nacimiento, int dni, String sexo,
			String vinculo, ProblemaSalud problema, AbordajeNutric abordaje, Familia famili) {
		super(numeroOrden, apellido, nombre, nacimiento, dni, sexo, vinculo, problema, abordaje, famili);
	}

	public Adulto(String estudio, boolean practicaDeporte, boolean trabaja,boolean obraSocial) {
		super(estudio, practicaDeporte, trabaja);
		this.obraSocial=obraSocial;
	}
    
}
