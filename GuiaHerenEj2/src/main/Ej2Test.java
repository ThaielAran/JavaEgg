package main;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entities.Lavadora;
import entities.Televisor;

class Ej2Test {

	Lavadora l;
	Televisor t;
	
	@BeforeEach
	public void setUp() {
		l=new Lavadora(1000,"gris",'C',56,29);
		t=new Televisor(1000,"rojo",'A',20,42,true);
	
	}

}
