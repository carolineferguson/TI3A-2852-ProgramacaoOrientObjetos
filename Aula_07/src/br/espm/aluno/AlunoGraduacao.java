package br.espm.aluno;

public class AlunoGraduacao extends Aluno {
	private String curso;
	private double integrativa;
	
	public AlunoGraduacao(long ra, String nome, double nota1, double nota2, String curso,double integrativa) {
		super(ra, nome, nota1, nota2);
		this.curso = curso;
		this.integrativa = integrativa;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public String setCurso(String curso) {
		return this.curso = curso;
	}
	
	public double getIntegrativa() {
		return integrativa;
	}
	
	public double calcularMedia() {
		return (0.7*((nota1+nota2)/2))+(0.3*integrativa);
	}
	
	public String toString() {
		return "RA:" +ra +" Nome:"+nome+" Curso:"+curso+" Media: "+calcularMedia();
	}
}
