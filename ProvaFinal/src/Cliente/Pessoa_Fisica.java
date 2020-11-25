package Cliente;
public class Pessoa_Fisica extends Cliente {
	String cpf;

	public Pessoa_Fisica(String nome, String email, String senha, String cpf) {
		super(nome, email, senha);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	

}
