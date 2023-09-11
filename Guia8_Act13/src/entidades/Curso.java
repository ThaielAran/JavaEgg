package entidades;

import java.util.Arrays;

/*nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos*/

public class Curso {

	private String nombreCurso;
	private int cantidadHorasPorDia;
	private int cantidadDiasPorSemana;
	private boolean turno;
	private double precioPorHora;
	private String[] alumnos=new String [5];
	
	public Curso() {
	}

	public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, boolean turno,
			double precioPorHora, String[] alumnos) {
		super();
		this.nombreCurso = nombreCurso;
		this.cantidadHorasPorDia = cantidadHorasPorDia;
		this.cantidadDiasPorSemana = cantidadDiasPorSemana;
		this.turno = turno;
		this.precioPorHora = precioPorHora;
		this.alumnos = alumnos;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public int getCantidadHorasPorDia() {
		return cantidadHorasPorDia;
	}

	public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
		this.cantidadHorasPorDia = cantidadHorasPorDia;
	}

	public int getCantidadDiasPorSemana() {
		return cantidadDiasPorSemana;
	}

	public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
		this.cantidadDiasPorSemana = cantidadDiasPorSemana;
	}

	public boolean isTurno() {
		return turno;
	}

	public void setTurno(boolean turno) {
		this.turno = turno;
	}

	public double getPrecioPorHora() {
		return precioPorHora;
	}

	public void setPrecioPorHora(double precioPorHora) {
		this.precioPorHora = precioPorHora;
	}

	public String[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(String[] alumnos) {
		this.alumnos = alumnos;
	}

	@Override
	public String toString() {
		return "Curso [nombreCurso=" + nombreCurso + ", cantidadHorasPorDia=" + cantidadHorasPorDia
				+ ", cantidadDiasPorSemana=" + cantidadDiasPorSemana + ", turno=" + turno + ", precioPorHora="
				+ precioPorHora + ", alumnos=" + Arrays.toString(alumnos) + "]";
	}
	
	
}
