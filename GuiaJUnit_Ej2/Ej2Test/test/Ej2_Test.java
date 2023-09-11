package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entidades.TemperatureConverter;

class Ej2_Test {

	private TemperatureConverter tc;
	
	@BeforeEach
	public void setUp() {
		tc=new TemperatureConverter();
	}
	
	//C-F
	@Test
	public void testCelciusToFarenheit() {
		assertEquals(89.6,tc.celciusToFareheit(32));
	}
	
	//F-C
	@Test
	public void testFarenheitToCelcius() {
		assertEquals(32,tc.fareheitToCelcius(89.6));
	}
	
	//K-C
	@Test
	public void testKelvinToCelcius() {
		assertEquals(32,tc.kelvinToCelcius(305.15));
	}
	
	//C-K
	@Test
	public void testCelciusToKelvin() {
		assertEquals(305.15,tc.celciusToKelvin(32));
	}
	
	//F-K
	@Test
	public void testFarenheitToKelvin() {
		assertEquals(305.15,tc.farenheitToKelvin(89.6));
	}
	//K-F
	@Test
	public void testoKelvinToFarenheit() {
		assertEquals(89.6,tc.kelvinToFarenheit(305.15));
	}
}
