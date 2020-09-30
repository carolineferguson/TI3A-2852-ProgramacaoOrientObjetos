package br.espm.aluno;

public class AlunoFundamental extends Aluno{
	private int serie;
	
	public AlunoFundamental(long ra,String nome,double nota1,double nota2,int serie) {
		super(ra,nome,nota1,nota2);
		this.serie = serie;
	}
	
	
	public int getSerie() {
		return serie;
	}


	public void setSerie(int serie) {
		this.serie = serie;
	}


	public double calcularMedia() {
		return (this.nota1+this.nota2)/2;
		
	}
	
	public String toString() {
		return "RA:" +ra +" Nome:"+nome+" Serie:"+serie+" Media: "+calcularMedia();
	}

}
