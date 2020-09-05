package ex10;

public class Circulo {
	
	double raio;
	
	public void alterarRaio (double raio) {
		this.raio = raio;
	}
	
	public String retornarRaio() {
		return "" + raio;
	}
	
	public double calcularArea() {
		return Math.PI * Math.pow(raio, 2);
	}
	
	public double calcularPerimetro() {
		return Math.PI * 2 * raio;
	}

}
