package ex2;

public class Main {
	public static void main(String[] args) {
		Professor a = new Professor();
		a.nome = "teste";
		a.titulacao = "doutor";
		a.valorHoraAula = 50;
		a.totalDeAulas = 32;
	    System.out.println(a.retornarDados());
	    a.ajustarValorHoraAula(5);
	    System.out.println(a.valorHoraAula);
		
	}

}
