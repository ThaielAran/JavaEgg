package actExtra1;

import entidades.Vehiculo;

public class ActExtra1 {

	public static void main(String[]args) {
		Vehiculo v1=new Vehiculo("bici","Vector","MB",2001);
		Vehiculo v2=new Vehiculo("moto","Yamaha","250",2005);
		Vehiculo v3=new Vehiculo("auto","Ford","Focus",2015);

		System.out.println("El vehiculo "+v1.getTipo()+" avanza "+v1.moverse(5)+" metros en 5 segundos, "+v1.moverse(10)+" metros en 10 segundos y "+v1.moverse(60)+" metros en 60 segundos.");
		System.out.println("El vehiculo "+v2.getTipo()+" avanza "+v2.moverse(5)+" metros en 5 segundos, "+v2.moverse(10)+" metros en 10 segundos y "+v2.moverse(60)+" metros en 60 segundos.");
		System.out.println("El vehiculo "+v3.getTipo()+" avanza "+v3.moverse(5)+" metros en 5 segundos, "+v3.moverse(10)+" metros en 10 segundos y "+v3.moverse(60)+" metros en 60 segundos.");

		int raceV1=v1.moverse(300)+v1.frenar();
		int raceV2=v2.moverse(300)+v2.frenar();
		int raceV3=v3.moverse(300)+v3.frenar();
		
		if(raceV1>raceV2 &&raceV1>raceV3) {
			System.out.println("El vehiculo "+v1+" fue el que mas recorrio despues de 5 mins., con un total de "+raceV1+" metros.");
		}else if (raceV2>raceV1 && raceV2>raceV3) {
			System.out.println("El vehiculo "+v2+" fue el que mas recorrio despues de 5 mins., con un total de "+raceV2+" metros.");
		}else {
			System.out.println("El vehiculo "+v3+" fue el que mas recorrio despues de 5 mins., con un total de "+raceV3+" metros.");
		}
			
	}
}
