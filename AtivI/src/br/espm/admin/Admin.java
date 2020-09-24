package br.espm.admin;
import br.espm.bilhete.BilheteUnico;
import br.espm.tipo.TipoDeUsuario;
import br.espm.usuario.Usuario;
import java.util.Random;
import Main.Main;


public class Admin {
	Random random = new Random();
	
	public Admin() {
		
	}
	
	public BilheteUnico emitirBilhete(Usuario usuario) { 
		int max = 9999;									//loop com condição para que o numero do bilhete não seja igual a um ja existente dentro do vetor
		int min = 1000;
		int numero = random.nextInt((max-min)+1)+min;
		return new BilheteUnico(numero,usuario,0);
	}
	
	public String imprimirBilhete(BilheteUnico bilhete[]) {
		String aux = "";
		for(int i = 0;i<2;i++) {
		aux = bilhete[i].getDados() + " "+aux;
		}
		return aux;
	}
	
	public String consultarBilhete(BilheteUnico bilhete) {
		return bilhete.getDados();
	}

}
