package entities;

import java.time.LocalDate;

public class Joven extends Persona {

	protected String estudio;
    protected boolean practicaDeporte;
    protected boolean trabaja;
    
	public Joven(String estudio, boolean practicaDeporte, boolean trabaja) {
		super();
		this.estudio = estudio;
		this.practicaDeporte = practicaDeporte;
		this.trabaja = trabaja;
	}
	public Joven(int numeroOrden, String apellido, String nombre, LocalDate nacimiento, int dni, String sexo,
			String vinculo, ProblemaSalud problema, AbordajeNutric abordaje, Familia famili) {
		super(numeroOrden, apellido, nombre, nacimiento, dni, sexo, vinculo, problema, abordaje, famili);
	}
	
}
