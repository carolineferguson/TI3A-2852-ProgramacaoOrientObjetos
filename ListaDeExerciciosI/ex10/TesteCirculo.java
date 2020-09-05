package ex10;

public class TesteCirculo {

	public static void main(String[] args) {
		Circulo teste = new Circulo();
		teste.raio = 6;
		teste.alterarRaio(5);
		System.out.println(teste.retornarRaio());
		System.out.println(teste.calcularArea());
		System.out.println(teste.calcularPerimetro());
	}

}
