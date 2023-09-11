package tests;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entities.Gato;
import entities.Caballo;
import entities.Perro;

class Ej1Test {
	
	Perro p;
	Caballo c;
	Gato g;
	
	@BeforeEach
	public void setUp() {
	p=new Perro("Cachilo", "Ozobuco", 8, "Pastor alemán");
	g=new Gato("Kaban", "Higado", 3, "Siberiano");
	c=new Caballo("Penumbra", "Heno", 5, "Percheron");
	}
	
	@Test
	public void test() {
		assertNotNull(p.getAlimento());
		assertNotNull(g.getAlimento());
		assertNotNull(c.getAlimento());
	}

}
