package ex1;

public class Conta {
	int numero;
	double saldo;
	double limite;
	
	public Conta(int numero,double saldo,double limite) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	public void sacar(double valor) {
		saldo = saldo - valor;
	}
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	public double consultarSaldo() {
		return saldo;
	}
	public String retornarDados() {
		return numero + "\n" + saldo + "\n" + limite;
	}

}
