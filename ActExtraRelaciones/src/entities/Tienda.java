package entities;

import java.util.HashMap;

public class Tienda {

	private HashMap<Producto,Integer> stockTienda=new HashMap<Producto,Integer>();
	private int id;
	private String direccion;
	private String encargado;
	public Tienda() {
		super();
	}
	public Tienda(HashMap<Producto, Integer> stockTienda, int id, String direccion, String encargado) {
		super();
		this.stockTienda = stockTienda;
		this.id = id;
		this.direccion = direccion;
		this.encargado = encargado;
	}
	public HashMap<Producto, Integer> getStockTienda() {
		return stockTienda;
	}
	public void setStockTienda(HashMap<Producto, Integer> stockTienda) {
		this.stockTienda = stockTienda;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEncargado() {
		return encargado;
	}
	public void setEncargado(String encargado) {
		this.encargado = encargado;
	}
	@Override
	public String toString() {
		return "Tienda [id=" + id + ", direccion=" + direccion + ", encargado="
				+ encargado + "]";
	}
	
}
