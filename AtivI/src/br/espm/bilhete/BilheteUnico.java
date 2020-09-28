package br.espm.bilhete;

import br.espm.usuario.Usuario;

public class BilheteUnico {
	private int numero;
	private Usuario usuario;
	private double saldo;
	private static double valorDaPassagem = 4.40;
	
	public BilheteUnico(int numero,Usuario usuario,double saldo) {
		this.numero = numero;
		this.usuario = usuario;
		this.saldo = saldo;
	}
	
	public String getDados() {
		return "Numero:" + numero +"\n"+"Usuario -> "+usuario.getDados() +"\n"+"Saldo:"+ saldo;
	}
	
	public void passarNaCatraca() {
		saldo -= valorDaPassagem;
	}
	public void carregarBilhete(double valor) {
		saldo += valor;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

}
