
public class PessoaFisica extends Cliente {
	String cpf;
	
	public PessoaFisica(String nome,String cpf) {
		super(nome);
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "cpf" + cpf + "nome:" + nome;
	}
	
	

}
