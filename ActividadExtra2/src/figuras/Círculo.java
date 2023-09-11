package figuras;

public class Círculo {

	public double radio;

	public Círculo() {
		super();
	}

	public Círculo(double radio) {
		super();
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double calcularArea() {
		double area=Math.PI*Math.pow(radio, 2);
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro=Math.PI*radio*2;
		return perimetro;
	}

	@Override
	public String toString() {
		return "Círculo [radio=" + radio + "]";
	}
	
}
