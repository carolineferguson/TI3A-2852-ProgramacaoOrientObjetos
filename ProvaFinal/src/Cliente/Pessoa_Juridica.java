package Cliente;
public class Pessoa_Juridica extends Cliente {

	String cnpj;
	public Pessoa_Juridica(String nome, String email, String senha, String cnpj) {
		super(nome, email, senha);
		this.cnpj = cnpj;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	



}
