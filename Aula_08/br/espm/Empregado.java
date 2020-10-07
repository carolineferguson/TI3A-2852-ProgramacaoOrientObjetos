package br.espm;

public abstract class Empregado {
	protected long matricula;
	protected String nome;
	
	public Empregado(long matricula,String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}
	
	public abstract double calcularSalario();
	
	public  String toString() {
		return "Matricula:" + matricula+ " Nome:" +nome+ " Salario:";
	}


}
