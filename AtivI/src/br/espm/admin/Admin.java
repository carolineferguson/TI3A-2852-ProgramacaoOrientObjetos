package br.espm.admin;
import br.espm.bilhete.BilheteUnico;
import br.espm.tipo.TipoDeUsuario;
import br.espm.usuario.Usuario;

import java.util.Random;


public class Admin {
	Random random = new Random();
	Usuario u1 = new Usuario("Du","5342132",TipoDeUsuario.NORMAL); //VETOR
	Usuario u2 = new Usuario("Tais","4322324",TipoDeUsuario.ESTUDANTE);
	
	public Admin() {
		
	}
	
	public BilheteUnico emitirBilhete(Usuario usuario) {
		int max = 9999;
		int min = 1000;
		int numero = random.nextInt((max-min)+1)+min;
		return new BilheteUnico(numero,usuario,0);
	}
	
	public String imprimirBilhete() {
		return u1 +"\n"+ u2; //VETOR
	}
	
	public Usuario consultarBilhete(String cpf) {
		if(u1.getCpf().equals(cpf)) { //VETOR
			return u1;
		}
		
		return u2;
	}

}
