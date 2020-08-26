package ex1;

public class CartaoDeCredito {
	
	int numero;
	double totalFatura;
	
	public CartaoDeCredito(int numero,double totalFatura) {
		this.numero = numero;
		this.totalFatura = totalFatura;
		
	}
	public String retornarDados() {
		return numero +"\n"+ totalFatura;
	}
	
	public double consultarFatura() {
		return totalFatura;
	}
	
}
