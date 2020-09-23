import javax.swing.JOptionPane;
import br.espm.bilhete.*;
import br.espm.tipo.*;
import br.espm.usuario.Usuario;
import java.util.Random;
import br.espm.admin.Admin;
public class Main {

	public static void main(String[] args) {
		Usuario u1 = new Usuario("Du","5342132",TipoDeUsuario.NORMAL); //VETOR
		Usuario u2 = new Usuario("Tais","4322324",TipoDeUsuario.ESTUDANTE);
		Admin admin = new Admin();
		final String senha = "admin"; 
		String aux = JOptionPane.showInputDialog("Senha ou CPF ou Sair");
		
		if(aux.equals("admin")) { //MUDAR
			String var = "1. Emitir bilhete" + "\n" + "2.Imprimir bilhete" + "\n" + "3.Consultar bilhete" + "\n" + "4.Sair";
			String op = JOptionPane.showInputDialog(var);
				if(op.equals("1")) {
					BilheteUnico b1 = admin.emitirBilhete(u1);
				}
				else if(op.equals("2")) {
					System.out.println(admin.imprimirBilhete());
				}
				else if(op.equals("3")) {
					admin.consultarBilhete(u1.getCpf());
				}
				
				else if(op.equals("4")) { //MUDAR
				
				}
		else if(aux.equals("Sair")) {
			
		}
		else {
			Usuario usuario;                   //MUDAR
				if(u1.getCpf().equals(aux)) {
					usuario = u1;
				}
				else {
					usuario = u2;
				}
			BilheteUnico b2 = admin.emitirBilhete(usuario);//MUDAR
			String var2 = "1. Carregar bilhete" +"\n" + "2.Passar na catraca" + "\n" + "3.Consultar saldo" + "\n" + "4.Sair";
			String op2 = JOptionPane.showInputDialog(var2);
				if(op2.equals("1")) {
					double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor:"));
					b2.carregarBilhete(valor);
				}
				else if(op2.equals("2")) {
					b2.passarNaCatraca();
				}
				else if(op2.equals("3")) {
					b2.getDados();
				}
		}
	}

}
}
