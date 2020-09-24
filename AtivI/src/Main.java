package Main;
import javax.swing.JOptionPane;
import br.espm.bilhete.*;
import br.espm.tipo.*;
import br.espm.usuario.Usuario;
import br.espm.admin.Admin;
public class Main {
	

	public static void main(String[] args) {
		Usuario[] usuario = new Usuario[2];
		BilheteUnico[] bilhetes = new BilheteUnico[2];
		Admin admin = new Admin();
		final String senha = "admin"; 
		
		//Preencher usuarios para teste
		for(int i=0;i<usuario.length;i++) {
			String nome  = JOptionPane.showInputDialog("Nome");
			String cpf  = JOptionPane.showInputDialog("Cpf");
			String tipo = JOptionPane.showInputDialog("Tipo:");
			if(tipo.equals("ESTUDANTE")) {
				usuario[i]  = new Usuario(nome,cpf,TipoDeUsuario.ESTUDANTE);
			}
			else if(tipo.equals("PROFESSOR")){
				usuario[i]  = new Usuario(nome,cpf,TipoDeUsuario.PROFESSOR);
			}
			else if(tipo.equals("NORMAL")) {
				usuario[i]  = new Usuario(nome,cpf,TipoDeUsuario.NORMAL);
			}
			else {
				JOptionPane.showMessageDialog(null,"Tipo de usuario inexistente");
			}
			
			}
		
		for(int i=0;i<usuario.length;i++) {
			bilhetes[i] = admin.emitirBilhete(usuario[i]);
		}
		
	
		String aux = JOptionPane.showInputDialog("Senha ou CPF ou Sair"); //primeira janela grafica
		
		BilheteUnico bilhete_aux = null ;         
		for(int i = 0;i<usuario.length;i++) {	
			if(usuario[i].getCpf().equals(aux)) { //pegar o usuario dentro do vetor pelo cpf
				if(usuario[i].equals(bilhetes[i].getUsuario())) { //pegar o bilhete unico pelo usuario
					bilhete_aux = bilhetes[i]; 
				}
			}
			
		}
		
		
		//se for o admin:
		if(aux.equals(senha)) { //MUDAR
			String var = "1. Emitir bilhete" + "\n" + "2.Imprimir bilhete" + "\n" + "3.Consultar bilhete" + "\n" + "4.Sair";
			String op = JOptionPane.showInputDialog(var); //segunda janela grafica
				if(op.equals("1")) {
					int id = Integer.parseInt(JOptionPane.showInputDialog("Qual id do usuario?")); //O Id do usuario é a posição dele no vetor
					admin.emitirBilhete(usuario[id]);
				}
				else if(op.equals("2")) {
					System.out.println(admin.imprimirBilhete(bilhetes));
				}
				else if(op.equals("3")) {
					admin.consultarBilhete(bilhete_aux);
				}
				
				else if(op.equals("4")) { //MUDAR
				
				}
		}
				
		//se for a opção sair		
		else if(aux.equals("Sair")) {
			
		}
		//se for o usuario
		else { 
		
			
			String var2 = "1. Carregar bilhete" +"\n" + "2.Passar na catraca" + "\n" + "3.Consultar saldo" + "\n" + "4.Sair";
			String op2 = JOptionPane.showInputDialog(var2); //segunda janela grafica
				if(op2.equals("1")) {
					double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor:"));
					bilhete_aux.carregarBilhete(valor);
				}
				else if(op2.equals("2")) {
					bilhete_aux.passarNaCatraca();
				}
				else if(op2.equals("3")) {
					bilhete_aux.getDados();
				}
		}
		
	}
	
	
}
	



