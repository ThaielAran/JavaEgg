package entidades;

public class Vehiculo {

	public String tipo;
	public String marca;
	public String modelo;
	public int anio;
	
	public Vehiculo() {
	}

	public Vehiculo(String tipo, String marca, String modelo, int anio) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	

	@Override
	public String toString() {
		return  tipo + " " + marca + " " + modelo + " " + anio;
	}

	public int moverse(int segundos) {
		int avanzar=0;
		switch(this.tipo) {
			case "bici":
				avanzar=segundos*1;
				return avanzar;
			case "moto":
				avanzar=segundos*2;
				return avanzar;
			case "auto":
				avanzar=segundos*3;
				return avanzar;
			default:
				return 0;
		}
	}
	public int frenar() {
		if (!this.tipo.equalsIgnoreCase("bici")) {
			return 2;
		}else {
			return 0;
		}
	}
}
