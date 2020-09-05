package ex09;

public class Retangulo {
	double base,altura;
	
	public Retangulo(double base,double altura) {
		this.base = base;
		this.altura = altura;
		
	}
	
	public double calcularPerimetro() {
		return 2*(base+altura);
	}
	
	public double calcularArea() {
		return base*altura;
	}

}
