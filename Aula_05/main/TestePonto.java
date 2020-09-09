package main;

import java.util.Scanner;

import ponto.Ponto;

public class TestePonto {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Ponto[] ponto = new Ponto[3];
		double x,y;
		
		for (int i = 0;i<ponto.length;i++) {
			System.out.println("Ponto"+(i+1));
			System.out.println("X:");
			x = input.nextDouble();
			System.out.println("Y:");
			y = input.nextDouble();
			ponto[i] = new Ponto(x,y);
			System.out.println();
		}
		
		Ponto p = maisProximo(ponto);
		System.out.println(p.retornarDados());
		}
	public static Ponto maisProximo(Ponto[] ponto) {
		Ponto aux = null;
		double distanciaAux = Double.MAX_VALUE;
		double distancia;
		for (int i = 0;i<ponto.length;i++) {
			distancia = ponto[i].dist(new Ponto (0,0));
			if(distancia<distanciaAux) {
				distanciaAux = distancia;
				aux = ponto[i];
			}
		}
		return aux;
		
	}

}
