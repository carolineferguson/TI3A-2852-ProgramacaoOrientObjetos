package br.espm.pessoa;

public abstract class Pessoa {
	protected String nome;
	protected String cpf;
	
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}

	@Override
	public String toString() {
		return "NOME:" + nome + ", CPF:" + cpf ;
	}
}
