package entities;

/*Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
*/

public class Televisor extends Electrodomestico{

	private int resolucion;
	private boolean sintonizadorTDT;
	
	public Televisor() {
		super();
	}
	public Televisor(double precio, String color, char consumoEnergetico, int peso, int resolucion,
			boolean sintonizadorTDT) {
		super(precio, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}
	public int getResolucion() {
		return resolucion;
	}
	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}
	public void crearTelevisor() {
		String opc;
		super.crearElectrodomestico();
		System.out.println("Ingrese la resolucion");
		this.setResolucion(s.nextInt());
		do {
			System.out.println("Tiene sintonizador TDT? S/N");
			opc = s.next();
		} while (!opc.equalsIgnoreCase("s")&&!opc.equalsIgnoreCase("n"));
		if(opc.equalsIgnoreCase("s"))
			this.setSintonizadorTDT(true);
		else
			this.setSintonizadorTDT(false);
	}
	public double precioFinal() {
		double pFinal= super.precioFinal();
		if(this.isSintonizadorTDT()) {
			pFinal+=500;
		}
		if(this.getResolucion()>40)
			pFinal=pFinal*1.3;
		this.precio=pFinal;
		return pFinal;
	}
}
