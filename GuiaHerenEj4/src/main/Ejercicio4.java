package main;

/*Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.*/

public class Ejercicio4 {

	public static void main(String[] args) {
		Circulo c1=new Circulo(26.7);
		Rectangulo r1=new Rectangulo(34.5 , 32);
		
		System.out.println("Circulo: area="+c1.calcularArea()+" perimetro="+c1.calcularPerimetro());
		System.out.println("Rectangulo: area="+r1.calcularArea()+" perimetro="+r1.calcularPerimetro());

	}

}
