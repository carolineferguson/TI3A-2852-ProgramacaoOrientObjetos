package ex02;

import java.util.Scanner;

public class TestePonto {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x,y;
		System.out.println("X:");
		x = input.nextDouble();
		System.out.println("Y:");
		y = input.nextDouble();
		
		Ponto a = new Ponto(x,y);
		
	System.out.println(a.retornarDados());
	System.out.println((a.dist(8, 2)));
	}

}
