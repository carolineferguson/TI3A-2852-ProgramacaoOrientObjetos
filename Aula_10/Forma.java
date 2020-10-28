
public abstract class Forma {
	protected int x;
	protected int y;
	protected double raio;
	
	public Forma(int x,int y,double raio) {
		this.x = x;
		this.y = y;
		this.raio = raio;
	}
	
	
	public String toString() {
		return "X:" + x + "Y:" + y + "Raio:"+ raio;
	}
	
	public abstract double calcularArea();

	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public double getRaio() {
		return raio;
	}


	public void setRaio(double raio) {
		this.raio = raio;
	}
	

}
