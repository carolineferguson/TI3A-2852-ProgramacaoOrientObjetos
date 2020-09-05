package ex03;

public class eqSeg {
	double a,b,c;
	public eqSeg() {
		this(0,0,0);
	}
	public eqSeg(double a,double b,double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public String calcularRaizes() {
		double delta = Math.pow(b, 2) - 4 * a * c;
		double x1 = (-1 * b + Math.sqrt(delta))/(2*a);
		double x2 = (-1 * b - Math.sqrt(delta))/(2*a);
		return x1 + " " + x2;
	}
	

}
