package ex1;

public class Main {

	public static void main(String[] args) {
		Paciente a = new Paciente();
		a.nome = "teste";
		a.idade = 35;
		System.out.println(a.calcularFreqMaxima());
		
		Paciente b = new Paciente();
		b.idade = 45;
		System.out.println(b.calcularFreqAlvo());
		}

}
