
public class Vendedor extends Empregado implements Salario {
	private double totalDasVendas;
	private double comissao;
	
	public Vendedor(String nome, String cpf, String matricula,double totalDasVendas,double comissao) {
		super(nome, cpf, matricula);
		this.totalDasVendas = totalDasVendas;
		this.comissao = comissao;
	}
	
	public double calcularSalario() {
		return totalDasVendas*comissao;
	}


}
