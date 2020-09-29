package Main;
import javax.swing.JOptionPane;
import br.espm.bilhete.*;
import br.espm.tipo.*;
import br.espm.usuario.Usuario;
import br.espm.admin.Admin;
import java.util.ArrayList;
public class Main {
	

	public static void main(String[] args) {
		Usuario[] usuario = new Usuario[2];
		ArrayList<BilheteUnico> bilhetes = new ArrayList();
		Admin admin = new Admin();
		final String senha = "admin"; 
		
		//Preencher usuarios para teste
		for(int i=0;i<usuario.length;i++) {
			String nome  = JOptionPane.showInputDialog("Nome");
			String cpf  = JOptionPane.showInputDialog("Cpf");
			String tipo = JOptionPane.showInputDialog("Tipo:");
			if(tipo.equalsIgnoreCase("ESTUDANTE")) {
				usuario[i]  = new Usuario(nome,cpf,TipoDeUsuario.ESTUDANTE);
			}
			else if(tipo.equalsIgnoreCase("PROFESSOR")){
				usuario[i]  = new Usuario(nome,cpf,TipoDeUsuario.PROFESSOR);
			}
			else if(tipo.equalsIgnoreCase("NORMAL")) {
				usuario[i]  = new Usuario(nome,cpf,TipoDeUsuario.NORMAL);
			}
			else {
				JOptionPane.showMessageDialog(null,"Tipo de usuario inexistente");
			}
			JOptionPane.showMessageDialog(null,usuario[i].getDados());
			
			}
		
		Usuario usuario_teste = new Usuario ("A","123",TipoDeUsuario.NORMAL); // Teste para que não seja necessario emitir o bilhete para testes
		BilheteUnico bilhete_teste = new BilheteUnico(1,usuario_teste,0);
		bilhetes.add(bilhete_teste);
		
		String aux = JOptionPane.showInputDialog("Senha ou CPF ou Sair"); //primeira janela grafica
		BilheteUnico bilhete_aux = null ;         
		for(int i = 0;i<usuario.length;i++) {	
			if(usuario[i].getCpf().equals(aux)) { //pegar o usuario dentro do vetor pelo cpf
				if(usuario[i].equals(bilhetes.get(i).getUsuario())) { //pegar o bilhete unico pelo usuario
					bilhete_aux = bilhetes.get(i); 
				}
			}
			
		}
		
		
		//se for o admin:
		if(aux.equals(senha)) { //MUDAR
			String var = "1. Emitir bilhete" + "\n" + "2.Imprimir bilhete" + "\n" + "3.Consultar bilhete" + "\n" + "4.Sair";
			String op = JOptionPane.showInputDialog(var); //segunda janela grafica
				if(op.equals("1")) {
					String cpf = JOptionPane.showInputDialog("Qual cpf do usuario?"); 
					for(int i = 0;i<usuario.length;i++) {	
						if(cpf.equals(usuario[i].getCpf())) { 
							BilheteUnico novo_bilhete = admin.emitirBilhete(usuario[i]);
							bilhetes.add(admin.emitirBilhete(usuario[i]));
							JOptionPane.showMessageDialog(null,novo_bilhete.getDados());
							break;
						}
						else {
							JOptionPane.showMessageDialog(null,"Este usuario não esta no sistema");
						}
						
					}
					
				}
				
				
				else if(op.equals("2")) {
					JOptionPane.showMessageDialog(null,admin.imprimirBilhete(bilhetes)); 
				}
				else if(op.equals("3")) {
					String cpf = JOptionPane.showInputDialog("Qual cpf do usuario?");
					BilheteUnico bilhete_consultar = null ;  
					if (cpf.equals(usuario_teste.getCpf())) { //Para usar o bilhete de teste sem que o admin tenha emitido
						bilhete_consultar = bilhete_teste;
					}
					for(int i = 0;i<usuario.length;i++) {	
						if(usuario[i].getCpf().equals(cpf)) { 
							if(usuario[i].equals(bilhetes.get(i).getUsuario())) { 
								bilhete_consultar = bilhetes.get(i); 
							}	
						}
						
						
					}
					JOptionPane.showMessageDialog(null,admin.consultarBilhete(bilhete_consultar));
				}
				
				else if(op.equals("4")) { //SAIR
				
				}
		}
				
		//se for a opção sair		
		else if(aux.equalsIgnoreCase("Sair")) {
			
		}
		//se for o usuario
		else { 
		
			
			String var2 = "1. Carregar bilhete" +"\n" + "2.Passar na catraca" + "\n" + "3.Consultar saldo" + "\n" + "4.Sair";
			String op2 = JOptionPane.showInputDialog(var2); //segunda janela grafica
			if(aux.equals(usuario_teste.getCpf())) {
				bilhete_aux = bilhete_teste;
			}
				if(op2.equals("1")) {
					double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor:"));
					bilhete_aux.carregarBilhete(valor);
					JOptionPane.showMessageDialog(null,bilhete_aux.getDados());
				}
				else if(op2.equals("2")) {
					bilhete_aux.passarNaCatraca();
					JOptionPane.showMessageDialog(null,bilhete_aux.getDados());
				}
				else if(op2.equals("3")) {
					JOptionPane.showMessageDialog(null,bilhete_aux.getDados());
				}
		}
		
	}
	
	
}
	



