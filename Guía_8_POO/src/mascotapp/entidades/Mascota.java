package mascotapp.entidades;

public class Mascota {

	public String nombre;
	public String apodo;
	public String tipo;
	public String raza;
	public String color;
	public boolean cola;
	public int edad;
	
	public Mascota() {
		
	}
	public Mascota(String nombre, String tipo, int edad) {
		
		this.nombre=nombre;
		this.tipo=tipo;
		this.edad=edad;
	}
	
	
}
