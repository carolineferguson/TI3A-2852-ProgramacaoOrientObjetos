package br.espm.usuario;

import br.espm.tipo.TipoDeUsuario;

public class Usuario {
	private String nome,cpf;
	private TipoDeUsuario tipo;
	
	public Usuario(String nome,String cpf,TipoDeUsuario tipo) {
		this.nome = nome;
		this.setCpf(cpf);
		this.tipo = tipo;
	}
	
	public String getDados() {
		return "Nome:" + nome +"\n"+"CPF:"+getCpf() + "\n"+"Tipo:" + tipo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
