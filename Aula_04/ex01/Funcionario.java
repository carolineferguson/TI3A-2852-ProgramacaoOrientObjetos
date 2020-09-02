package ex01;

public class Funcionario {
	String cpf,nome;
	double salario;
	static double valeRefeicao = 550;
	final static double valeTransporte = 50; //constante
	
	public Funcionario(String cpf, String nome, double salario) {
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
	}
	
	
	
	public void aumentarSalario(double porcentagem) {
		salario += salario*porcentagem/100;
	}
	
	public String retornarDados() {
		return nome + " " + cpf + " " + salario;
		}
	public static void ajustarValeRefeicao(double porcentagem) {
		valeRefeicao += valeRefeicao*porcentagem/100;
	}
	
	
	
	

}



