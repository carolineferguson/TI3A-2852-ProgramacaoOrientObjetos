package ex2;

public class Professor {
	String nome,titulacao;
	int totalDeAulas;
	double valorHoraAula;
	
	
	public Professor(String nome,String titulacao,double valorHoraAula,int totalDeAulas) {
		this.nome = nome;
		this.titulacao = titulacao;
		this.valorHoraAula = valorHoraAula;
		this.totalDeAulas = totalDeAulas;
	}
	
	public Professor() {} //construtor sem parametros
    
	public double calcularSalario() {
        double sb = totalDeAulas*valorHoraAula*4.5;
		if(titulacao.equalsIgnoreCase("mestre")){
			sb *= 1.03;
		}
		else {
			sb *= 1.085;
		}
		double ha = sb * 0.05;
		double dsr = (sb+ha) / 6;
		
		return (sb+ ha +dsr);
		
	}
	public void ajustarValorHoraAula(double aumento) {
		valorHoraAula = valorHoraAula + valorHoraAula * aumento/100;
		}
	
	public String retornarDados() {
		String dados = nome + " " + titulacao + " " + calcularSalario();
		return dados;
	}
	
}
