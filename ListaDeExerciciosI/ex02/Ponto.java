package ex02;

public class Ponto {
	double x,y;
	
	
	public Ponto(double x,double y) {
		this.x =x;
		this.y = y;
	}
	public Ponto() {
		this(0,0);
	}
	
	public String retornarDados() {
		return "("+x+","+y+")";
	}
	
	public double dist(double x,double y) {
		return Math.sqrt(Math.pow((x-this.x), 2)+Math.pow((y-this.y), 2));
	
	}
}
