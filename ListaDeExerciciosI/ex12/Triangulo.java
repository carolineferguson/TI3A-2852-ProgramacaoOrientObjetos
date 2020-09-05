package ex12;

public class Triangulo {
	double a,b,c;
	
	public double calcularSemiperimetro() {
		double semiperimetro =(a+b+c)/2;
		
		return semiperimetro;
		
	}
	public double calcularArea() {
		double p = calcularSemiperimetro();
		double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
		return area;
		
	}
	
	public double calcularPerimetro() {
		double perimetro =a+b+c; 
		return perimetro;
		
	}
	
	public double calcularLambda() {
		double lambda = (Math.pow(a, 2)+Math.pow(b, 2)-Math.pow(c, 2))/2*a*b;
		return lambda;
	}
	public double calcularCentroideX() {
		double lambda = calcularLambda();
		double x = (b+(a*lambda))/3;
		return x;
	}
	public  double calcularCentroideY() {
		double lambda = calcularLambda();
		double y =(a/3)*Math.sqrt(1-(Math.pow(lambda, 2)));
		return y;
	}

}
