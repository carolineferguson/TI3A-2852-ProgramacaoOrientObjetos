package br.espm;

public class EmpregadoComissionado extends Empregado {

	double totalDeVendas,comissao;
	
	public EmpregadoComissionado(long matricula, String nome, double totalDeVendas,double comissao) {
		super(matricula, nome);
		this.totalDeVendas = totalDeVendas;
		this.comissao = comissao;
		
	}
	
	public double getTotalDeVendas() {
		return totalDeVendas;
	}

	public void setTotalDeVendas(double totalDeVendas) {
		this.totalDeVendas = totalDeVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double calcularSalario() {
		return totalDeVendas*comissao/100;
	}
	
	public String toString() {
		return "Matricula:"+matricula+" Nome:"+nome+" Salario:"+calcularSalario();
	}

}
