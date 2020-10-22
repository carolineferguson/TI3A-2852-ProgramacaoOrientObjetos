
public class PessoaJuridica extends Cliente {
	String cnpj;
	
	public PessoaJuridica(String nome,String cnpj) {
		super(nome);
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "cnpj:" + cnpj + "nome:" + nome;
	}

	public String getCnpj() {
		return cnpj;
	}
	
	

}
