package service;

import java.util.ArrayList;
import java.util.Scanner;

import entidades.Cliente;

/*registrarCliente: lo registra en el sistema.
obtenerClientes(): devuelve una lista con todos los clientes registrados en el sistema.
actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo): recibe el identificador
de un cliente existente y los nuevos datos del cliente, y actualiza la información correspondiente en el sistema.
eliminarCliente(int id): recibe el identificador de un cliente existente y lo elimina del sistema.*/

public class ServiceCliente {

	ArrayList <Cliente> listaClientes =new ArrayList<Cliente>();
	Scanner s=new Scanner(System.in);//.useDelimiter("\n");
	int id=0;
	
	public void registrarCliente() {
		Cliente c1=new Cliente();
		
		c1.setId(id);
		id++;
		//s.nextLine();
		System.out.println("Ingrese el nombre");
		c1.setNombre(s.nextLine());
		System.out.println("Ingrese la edad");
		c1.setEdad(s.nextInt());
		System.out.println("Ingrese la altura en cm");
		c1.setAltura(s.nextInt());
		System.out.println("Ingrese el peso");
		c1.setPeso(s.nextDouble());
		System.out.println("Ingrese el objetivo");
		s.nextLine();
		c1.setObjetivo(s.nextLine());
		
		listaClientes.add(c1);
	}
	public void obtenerClientes() {
		System.out.println(listaClientes);
	}
	public void actualizarCliente(int id, String nombre, int edad, int altura, double peso, String objetivo) {
		listaClientes.get(id).setNombre(nombre);
		listaClientes.get(id).setEdad(edad);
		listaClientes.get(id).setAltura(altura);
		listaClientes.get(id).setPeso(peso);
		listaClientes.get(id).setObjetivo(objetivo);
		
	}
	public void eliminarCliente(int id) {
		listaClientes.remove(id);
		for (int i=id;i<listaClientes.size();i++) {
			listaClientes.get(i).setId(i);
		}
	}
}
