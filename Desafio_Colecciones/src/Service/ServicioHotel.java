/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

//@author rembe
import java.util.InputMismatchException;
import java.util.Scanner;

public class ServicioHotel {

    private Scanner leer;

    public ServicioHotel() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void menu() {
        boolean salir = false, salir2 = false;
        int var, var2;

        while (!salir) {

            System.out.println("\n********************************");
            System.out.println("BIENVENIDO AL HOTEL TRANSILVANIA");
            System.out.println("*******************************\n");
            System.out.println("1. Crear Cliente/Habitaciones");
            System.out.println("2. Reservar Habitación");
            System.out.println("3. Visualizar Alojamiento");
            System.out.println("4. Salir\n");
            System.out.println("Ingrese una opción --> ");

            try {
                var = leer.nextInt();
                switch (var) {
                    case 1:

                        while (!salir2) {

                            System.out.println("\n*******");
                            System.out.println("Gestor Clientes");
                            System.out.println("1. Crear Persona");
                            System.out.println("2. Crear Habitación");
                            System.out.println("3. Salir\n");

                            try {
                                var2 = leer.nextInt();
                                switch (var2) {
                                    case 1:
                                        System.out.println("Cliente Creado");
                                        // Pegar aqui el método para crear cliente (personas)
                                        break;

                                    case 2:
                                        System.out.println("Habitacion Creada");
                                        // Pegar aqui el método para crear habitacion
                                        break;
                                    case 3:
                                        salir2 = true;
                                        break;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("AQUI VA ESTO");
                            }
                        }

                        break;

                    case 2:
                        // Crear Reserva
//                        while (true)   {
//                            System.out.println("Persona Creada");
//                            //Pegar aqui el metodo para crear personas
//                        }
                        System.out.println("Reserva Creada");
                        //Pegar aqui el método para crear reserva
                        break;

                    case 3:
                        // Mostrar Alojamientos
//                        while (true)   {
//                            System.out.println("Persona Creada");
//                            //Pegar aqui el metodo para crear personas
//                        }
                        System.out.println("Lleno total. No hay habitaciones disponibles. A dormir a otro lado");
                        //Pegar aqui el método para crear reserva
                        break;
                    case 4:
                        System.out.println("Hasta Luego");
                        salir = true;
                        break;
                    default:
                        System.out.println("Error. La opción ingresada no es válida.");
                        System.out.println("Ingrese nuevamente una opción.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error. Escribir un número");
            }
        }
    }

}
