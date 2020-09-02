package ex03;

public class Retangulo {
	double base,altura;
	
	//sobrecarga de método -> dois ou mais metodos com o mesmo nome variando os parametros
	public Retangulo(double base,double altura) {
		this.base = base;
		this.altura = altura;
		
	}
	public Retangulo() {
		//this.base = 0;
		//this.altura = 0;
		this(0,0); //chamada para o construtor com parametro
	}
	
	public double calcularPerimetro() {
		return 2*(base+altura);
	}
	
	public double calcularArea() {
		return base*altura;
	}

}
