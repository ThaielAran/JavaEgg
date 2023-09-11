package main;

public class Revolver {

	private int posActual;
	private int posBala;
	public Revolver(int posActual, int posBala) {
		super();
		this.posActual = posActual;
		this.posBala = posBala;
	}
	public Revolver() {
		super();
	}
	public int getPosActual() {
		return posActual;
	}
	public void setPosActual(int posActual) {
		this.posActual = posActual;
	}
	public int getPosBala() {
		return posBala;
	}
	public void setPosBala(int posBala) {
		this.posBala = posBala;
	}
/*• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)*/
	public void llenarRevolver() {//Revolver r1
		this.setPosActual((int)(Math.random()*6));
		this.setPosBala((int)(Math.random()*6));
	}
	public boolean click() {
		return(this.getPosActual()==this.getPosBala());
		
	}
	public void siguiente(){
		if(this.getPosActual()<5)
			this.setPosActual(this.getPosActual()+1);
		else
			this.setPosActual(0);
	}
	public void spin() {
		this.setPosActual((int)(Math.random()*6));
	}
	@Override
	public String toString() {
		return "Posicion actual: " + posActual + ", Posicion de la bala: " + posBala;
	}
	
}
