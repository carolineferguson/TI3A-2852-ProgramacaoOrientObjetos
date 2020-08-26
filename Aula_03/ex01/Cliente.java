package ex1;

public class Cliente {
	String nome,cpf;
	CartaoDeCredito cartao;//referencia a um objeto
	Conta conta;
	
	public Cliente(String nome,String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		cartao = new CartaoDeCredito(0,0);
		conta = new Conta(0,0,0);
	}
	
	public String retornarDados(){
		return nome + "\n" + cpf + "\n" +cartao.retornarDados() +"\n"+ conta.retornarDados();
	}

}
