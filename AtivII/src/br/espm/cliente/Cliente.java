
package br.espm.cliente;

import br.espm.pessoa.Pessoa;

public class Cliente extends Pessoa {
	private double valorDaDivida;

	public Cliente(String nome, String cpf, double valorDaDivida) {
		super(nome, cpf);
		this.valorDaDivida = valorDaDivida;
	}

}
