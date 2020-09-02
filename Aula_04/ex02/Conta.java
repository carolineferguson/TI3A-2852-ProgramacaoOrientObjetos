package ex02;

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
		public String gerarExtrato() {
			return "Extrato" + numero;
		}
		public String gerarExtrato(int dias) {
			return "Extrato" + numero;
		}
		public void  transferir(Conta origem,Conta destino,double valor) {
			//destino.saldo += valor;
			//this.saldo -= valor;
			sacar(valor);
			destino.depositar(valor);
		}
		

	}



