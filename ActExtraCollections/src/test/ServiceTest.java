package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entities.Producto;
import service.ServiceProducto;

class ServiceTest {

	private ServiceProducto serv;
	private Producto p1;
	private ArrayList<Producto> listaProductos=new ArrayList<Producto>();
	
	@BeforeEach
	public void setUp(){
		serv=new ServiceProducto();
		p1=new Producto();
	}
	/*@Test
	void testCrearProducto() {
		
	}*/
	@Test
	void testEliminar() {
		listaProductos.add(p1);
		serv.eliminar(listaProductos, 0);
		assertEquals(0,listaProductos.size());
	}
	@Test
	void testReposicion() {
		p1.setStock(1);
		serv.reposicion(p1);
		assertEquals(2,p1.getStock());
	}
	@Test
	void testVenta() {
		p1.setStock(1);
		assertTrue(serv.venta(p1));
	}

}
