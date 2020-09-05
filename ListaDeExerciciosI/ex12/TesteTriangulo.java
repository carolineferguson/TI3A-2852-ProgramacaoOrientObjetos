package ex12;

public class TesteTriangulo {
	public static void main (String[] args) {
		Triangulo teste = new Triangulo();
		teste.a = 3;
		teste.b = 4;
		teste.c = 5;
		
		System.out.println(teste.calcularArea());
		System.out.println(teste.calcularPerimetro());
		System.out.println(teste.calcularCentroideX());
		System.out.println(teste.calcularCentroideY());
	}

}
