
public class Pessoa {
	protected String nome;
	protected String cpf;
	
	public Pessoa(String nome,String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String toString() {
		return nome + cpf;
	}

}