package ex01;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("1","a",1);
		Funcionario f2 = new Funcionario("2","b",2);
		
		System.out.println(f1.valeRefeicao); //The static field Funcionario.vale should be accessed in a static way
		Funcionario.ajustarValeRefeicao(10);
		System.out.println(Funcionario.valeRefeicao);
		System.out.println(Funcionario.valeTransporte);
		

	}

}
