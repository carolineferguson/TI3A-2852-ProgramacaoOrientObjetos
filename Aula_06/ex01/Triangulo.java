package ex01;

public class Triangulo {
	
		private double a,b,c;
		
		public Triangulo(double a,double b,double c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}
		
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
			double lambda = (a*a+b*b-c*c)/(2*a*b);
			return lambda;
		}
		public double calcularCentroideX() {
			double lambda = calcularLambda();
			double x = (b+(a*lambda))/3;
			return x;
		}
		public  double calcularCentroideY() {
			double lambda = calcularLambda();
			double y =(a/3)*Math.sqrt(1-(lambda*lambda));
			return y;
		}
		
		public double getA() {
			return a;
		}
		
		public double getB() {
			return b;
		}
		public double getC() {
			return c;
		}
		
		public void setA(double a) {
			this.a = a;
		}
		
		public void setB(double b) {
			this.b = b;
		}
		
		public void setC(double c) {
			this.c = c;
		}

	}



