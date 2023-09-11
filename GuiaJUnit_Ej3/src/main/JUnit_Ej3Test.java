package main;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Entidades.PasswordValidator;

class JUnit_Ej3Test {

	private PasswordValidator pv;
	
	@BeforeEach
	public void setUp() {
		pv=new PasswordValidator();
	}
	@Test
	public void test1() {
		assertTrue(pv.validacion("Val1dat@"));
	}

	@Test
	public void test2() {
		assertTrue(pv.validacion("val1dat@"));
	}
	@Test
	public void test3() {
		assertTrue(pv.validacion("Validat@"));
	}
	@Test
	public void test4() {
		assertTrue(pv.validacion("Val1date"));
	}
	@Test
	public void test5() {
		assertTrue(pv.validacion("Val1dar"));
	}
	@Test
	public void test6() {
		assertTrue(pv.validacion("Val1datt@?"));
	}
	@Test
	public void test7() {
		assertTrue(pv.validacion("Vali da@e2"));
	}
}
