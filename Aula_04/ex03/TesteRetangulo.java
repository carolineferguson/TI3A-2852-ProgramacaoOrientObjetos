package ex03;

import java.util.Scanner;

public class TesteRetangulo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Retangulo[] retangulo = new Retangulo[3];
		double base,altura;
		for (int i = 0;i<retangulo.length;i++) {
			System.out.println("Retangulo "+(i+1));
			System.out.println("Base: ");
			base = input.nextDouble();
			System.out.println("Altura ");
			altura = input.nextDouble();
			retangulo[i] = new Retangulo(base,altura);
			System.out.println("Area: " + retangulo[i].calcularArea());
			System.out.println("Perimetro: "+retangulo[i].calcularPerimetro());
		}
		input.close();
	}

}
