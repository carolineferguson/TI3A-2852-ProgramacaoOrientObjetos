package br.espm.aluno;

public abstract class Aluno {
	protected long ra;
	protected String nome;
	protected double nota1,nota2;
	
	public Aluno (long ra,String nome,double nota1,double nota2) {
		this.ra = ra;
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

}
