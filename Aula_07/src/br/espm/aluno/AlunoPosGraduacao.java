package br.espm.aluno;

public class AlunoPosGraduacao extends Aluno {
	private String curso;
	
	public AlunoPosGraduacao(long ra,String nome,double nota1,double nota2,String curso) {
		super(ra,nome,nota1,nota2);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public double calcularMedia() {
		return (0.6*nota1)+(0.4*nota2);
	}
	public String toString() {
		return "RA:" +ra +" Nome:"+nome+" Curso:"+curso+" Media: "+calcularMedia();
	}

}
