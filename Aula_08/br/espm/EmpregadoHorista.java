package br.espm;

public class EmpregadoHorista extends Empregado{
	int totalDeHorasTrabalhadas;
	double valorDaHoraTrabalhada;
	
	public EmpregadoHorista(long matricula,String nome,int totalDeHorasTrabalhadas,double valorDaHoraTrabalhada) {
		super(matricula,nome);
		this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
		this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
	}
	
	
	public int getTotalDeHorasTrabalhadas() {
		return totalDeHorasTrabalhadas;
	}

	public void setTotalDeHorasTrabalhadas(int totalDeHorasTrabalhadas) {
		this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
	}

	public double getValorDaHoraTrabalhada() {
		return valorDaHoraTrabalhada;
	}

	public void setValorDaHoraTrabalhada(double valorDaHoraTrabalhada) {
		this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
	}
	@Override
	public double calcularSalario() {
		return totalDeHorasTrabalhadas*valorDaHoraTrabalhada;
	}
	
	@Override
	public String toString() {
		return "Matricula:"+matricula+" Nome:"+nome+" Salario:"+calcularSalario();
	}

}
