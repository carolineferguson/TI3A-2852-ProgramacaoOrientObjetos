package Vinho;

public class Vinho {
	int id;
	String cpf_cnpj;
	String produto;
	String casta;
	int safra;
	int pontuacao;
	
	public Vinho(int id, String cpf_cnpj, String produto, String casta, int safra, int pontuacao) {
		this.id = id;
		this.cpf_cnpj = cpf_cnpj;
		this.produto = produto;
		this.casta = casta;
		this.safra = safra;
		this.pontuacao = pontuacao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCpf_cnpj() {
		return cpf_cnpj;
	}

	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getCasta() {
		return casta;
	}

	public void setCasta(String casta) {
		this.casta = casta;
	}

	public int getSafra() {
		return safra;
	}

	public void setSafra(int safra) {
		this.safra = safra;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	
	
	
	
	

}
