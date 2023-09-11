package entidades;

public class TemperatureConverter {

	public double celciusToFareheit(double tempC) {
		return (tempC * 9 / 5) +32;
	}
	
	public double fareheitToCelcius(double tempF) {
		return (tempF-32) * 5 / 9;
	}
	
	public double kelvinToCelcius(double tempK) {
		return (tempK- 273.15);
	}
	
	public double celciusToKelvin(double tempC) {
		return (tempC+ 273.15);
	}
	
	public double farenheitToKelvin(double tempF) {
		return 5/9*(tempF-32)+273.15;
	}
	
	public double kelvinToFarenheit(double tempK) {
		return 5/9*(tempK-273.15)+32;
	}
}
