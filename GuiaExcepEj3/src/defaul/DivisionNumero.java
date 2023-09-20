package defaul;

public class DivisionNumero {

	protected int num1;
	protected int num2;
	public DivisionNumero(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	public DivisionNumero() {
		super();
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public void pasarAlObjeto(String a, String b) throws NumberFormatException{
		
		num1=Integer.parseInt(a);
		num2=Integer.parseInt(b);
	}
	
	public double dividir() throws ArithmeticException{
		if(num2==0) {
			throw new ArithmeticException("No me dividas por 0");
		}else if(num1<num2) {
			throw new ArithmeticException("No hay decimales");
		}
		return num1/num2;
	}
}
