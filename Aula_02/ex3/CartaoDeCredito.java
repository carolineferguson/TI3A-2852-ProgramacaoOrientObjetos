package ex3;

public class CartaoDeCredito {
	
	int numero;
	double totalFatura ;
	
	public CartaoDeCredito(int numero,double totalFatura) {
		this.numero = numero;
		this.totalFatura = totalFatura;
		
	}
	public String retornarDados() {
		
		String dados = numero + " " + totalFatura ;
		return dados;
	}
	
	public double consultarFatura() {
		return totalFatura;
	}
	
}
