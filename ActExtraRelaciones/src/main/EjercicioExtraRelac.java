package main;

import java.util.Scanner; 
import service.ServiceProducto;
import service.ServiceTienda;

/*Se necesita una app para una cadena de tiendas en la cual queremos
almacenar los distintos productos que venderemos y el precio que
tendran,
Ademas, se necesita que la app cuente con las funciones basicas.
(Estas las realizaremos en la clase de servicio)
Las funciones son basicas son:
CrearProducto()
MostrarProductos()
ModificarProducto()
EliminarProducto()
Cada producto tiene que tener como atributos: id, nombre, y debe tener
asociado un precio.
La app, tambien debe contener las diferentes tiendas. Cada tienda, tendrá como atributos: ID de tienda, Lista de productos,
direccion, representante de la tienda.
Las funciones de la tienda son:
CrearTienda()
MostrarTiendas()
ModificarTienda()
EliminarTienda()
Además:
AgregarProductos(): Agrega el producto elegido y la cantidad.
VenderProductos(): Vende cierta cantidad del producto.
EliminarProductos(): Elimina el Producto de esa tienda.
StockProductos(): Nos devuelve cuantos productos hay.
Nota:
- Cada tienda tendrá una lista de productos diferentes con sus respectivos stocks.
Una vez realizado el programa:
- Crear 3 tiendas.
- Crear 15 productos.
- Asociar a cada tienda, 5 productos de los creados. (algunos productos pueden repetirse, pero no todos)
- Agregar cantidad de stock de cada producto a la tienda
- Realizar algunas ventas
- Calcular el stock restante.
Nota: Agregar o modificar funciones para que se realice correctamente lo que se pide. (Por ejemplo; No se
puede vender cierto producto si es que no hay stock.)*/

public class EjercicioExtraRelac {
	
		static ServiceTienda servT=new ServiceTienda();
		static ServiceProducto servP=new ServiceProducto();
		static Scanner s=new Scanner(System.in).useDelimiter("/r/n");
		
	public static void main(String[]args) {
		int tienda, producto, opc, opc2;
		crearTienda();
		System.out.println("Creando Productos...");
		servP.generarProductos();
		System.out.println("    MENU\nIngrese una opcion:\n1.Productos\n2. Tiendas\n3. Vender"
							+ "\n4. Mostrar Stock\n5. Salir");
		opc=s.nextInt();
		switch (opc) {
		case 1:
			System.out.println("    MENU PRODUCTOS\nIngrese una opcion:\n1. Crear Producto\n2. Modificar Producto\n3. Eliminar Producto"
					+ "\n4. Mostrar Productos\n5. Salir");
			break;
		case 2:
			System.out.println("    MENU\nIngrese una opcion:\n1.Productos\n2. Tiendas\n3. Vender"
					+ "\n4. Mostrar Stock\n5. Salir");
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		default:
			System.out.println("Ingrese una opcion valida");
			break;
		}
		
		
		
		
		
		agregarProductos();
		servT.stockProductos(1);
		servT.venderProducto(servT.buscarTienda(), servP.returProducto(servP.buscarProducto()),10);
		servT.stockProductos(1);
	}
	public static void crearTienda() {
		String opc;
		servT.crearTienda();
		do {
			System.out.println("Desea crear otra tienda? S/N");
			opc = s.nextLine();
		} while (!opc.equalsIgnoreCase("s")&&!opc.equalsIgnoreCase("n"));
		if (opc.equalsIgnoreCase("s")) {
			crearTienda();
		}
	}
	public static void agregarProductos() {
		String opc;
		servT.agregarProducto(servT.buscarTienda(), servP.returProducto(servP.buscarProducto()),
				servP.numAleatorio(0, 100));
		
		do {
			System.out.println("Desea agregar otro producto? S/N");
			opc = s.nextLine();
		} while (!opc.equalsIgnoreCase("s")&&!opc.equalsIgnoreCase("n"));
		if (opc.equalsIgnoreCase("s")) {
			agregarProductos();
		}
	}
}
