package br.espm.admin;
import br.espm.bilhete.BilheteUnico;
import br.espm.usuario.Usuario;

import java.util.ArrayList;
import java.util.Random;



public class Admin {
	Random random = new Random();
	
	public Admin() {
		
	}
	
	public BilheteUnico emitirBilhete(Usuario usuario) { 
		int max = 9999;									 
		int min = 1000;
		int numero = random.nextInt((max-min)+1)+min;
		return new BilheteUnico(numero,usuario,0);
	}
	
	public String imprimirBilhete(ArrayList <BilheteUnico> bilhetes) {
		String aux = "";
		for(int i = 0;i<bilhetes.size();i++) {
		aux = bilhetes.get(i).getDados() + " "+aux;
		}
		return aux;
	}
	
	public String consultarBilhete(BilheteUnico bilhete) {
		return bilhete.getDados();
	}
	


}
