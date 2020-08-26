package ex3;

public class Cliente {
	
		String nome,cpf;
		
		public Cliente(String nome,String cpf) {
			this.nome = nome;
			this.cpf = cpf;
			
		}
		public String retornarDados() {
			
			String dados = nome + " " + cpf ;
			return dados;
		}
		


}