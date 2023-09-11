package entidades;

import java.util.Scanner;

public class Rectangulo {

	private int base;
	private int altura;
	
	public Rectangulo() {
		super();
	}
	
	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public Rectangulo crearRectangulo() {
		
		Rectangulo r1=new Rectangulo();
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese la base");
		r1.setBase(s.nextInt());
		System.out.println("Ingrese la altura");
		r1.setAltura(s.nextInt());
		s.close();
		return r1;	
	}
	
	public int superficie(Rectangulo r1) {
		return r1.getBase()*r1.getAltura();
	}
	
	public int perimetro(Rectangulo r1) {
		return (r1.getBase()+r1.getAltura())*2;
	}
	
	public void dibujarRectangulo(Rectangulo r1) {
		for(int i=0;i<r1.getAltura();i++) {
			for (int j=0;j<r1.getBase();j++) {
				if(i==0 || i==r1.getAltura()-1) {
					if (j!=r1.getBase()-1)
						System.out.print("*");
					else
						System.out.println("*");
				}else if(j==0) {
					System.out.print("*");
				}else if(j==r1.getBase()-1) {
					System.out.println("*");
				}else
					System.out.print(" ");
					
			}
		}
	}
}
