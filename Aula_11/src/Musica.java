
public class Musica {
	private String idspotify;
	private String nome;
	private String idalbum;
	private String nomealbum;
	
	public Musica(String idspotify, String nome, String idalbum, String nomealbum) {
		this.idspotify = idspotify;
		this.nome = nome;
		this.idalbum = idalbum;
		this.nomealbum = nomealbum;
	}


	public String getIdspotify() {
		return idspotify;
	}

	public void setIdspotify(String idspotify) {
		this.idspotify = idspotify;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdalbum() {
		return idalbum;
	}

	public void setIdalbum(String idalbum) {
		this.idalbum = idalbum;
	}

	public String getNomealbum() {
		return nomealbum;
	}

	public void setNomealbum(String nomealbum) {
		this.nomealbum = nomealbum;
	}
	
	

}
