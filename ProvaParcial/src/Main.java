import java.util.LinkedList;

import javax.swing.JOptionPane;


public class Main {
			static LinkedList<Reserva> lista_reserva = new LinkedList<Reserva>();
			static LinkedList<Reserva> lista_espera = new LinkedList<Reserva>();
			static LinkedList<String> lista_reservareg = new LinkedList<String>();
	public static void main(String[] args) {
		
		try {
		principal();
		
		}
		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null,"Digite um número");
		}
		
	}
	
	public static int principal() {
		int aux = Integer.parseInt(JOptionPane.showInputDialog("Restaurante SABOR SOFISTICADO"+"\n"+"1.Reservar mesa"+"\n"+"2.Pesquisar reserva"+"\n"+"3.Imprimir reservas"+"\n"+"4.Imprimir lista de espera"+"\n"+"5.Cancelar reserva"+"\n"+"6.Finalizar"));
		if(aux == 1) {
			reservar();
		}
		else if(aux == 2) {
			pesquisar();
		}
		else if(aux ==3) {
			imprimirReservas();
		}
		else if(aux == 4) {
			imprimirEspera();
		}
		return aux;
	}
	
	public static void reservar() {
		String tipo = JOptionPane.showInputDialog("Fisica ou Juridica?");
		String nome = JOptionPane.showInputDialog("Nome:");
		String reg = JOptionPane.showInputDialog("CPF ou CNPJ:");
		String pgto = JOptionPane.showInputDialog("Pagamento a vista?");
		Reserva r = null;
		if(tipo.equalsIgnoreCase("Fisica")) {
			PessoaFisica p = new PessoaFisica(nome,reg);
			
			if(pgto.equalsIgnoreCase("sim")) {
				 r = new Reserva(p,true);
			}
			else {
				 r = new Reserva(p,false);
			}
		}
		else {
			PessoaJuridica p = new PessoaJuridica(nome,reg);
			if(pgto.equalsIgnoreCase("sim")) {
				 r = new Reserva(p,true);
			}
			else {
				 r = new Reserva(p,false);
			}
			
		}
		
		if(lista_reserva.size()<6) {
		lista_reserva.add(r);
		lista_reservareg.add(reg);
		}
		else {
			lista_espera.add(r);
		}
		principal();

		
	}
	
	public static void pesquisar() {
		String aux_reg = JOptionPane.showInputDialog("CPF OU CNPJ:");
		for(String reg: lista_reservareg) {
			if(aux_reg.equals(reg)) {
				JOptionPane.showMessageDialog(null, "Há reserva para esse cpf");
				break;
			}
			else {
				JOptionPane.showMessageDialog(null, "Não há reserva para esse cpf");
			}
		}
		principal();
		}
	public static void imprimirReservas() {
		JOptionPane.showMessageDialog(null,lista_reserva);
		principal();
	}
	public static void imprimirEspera() {
		JOptionPane.showMessageDialog(null,lista_espera);
		principal();
	}
	public static void cancelarReserva() {
		String reg = JOptionPane.showInputDialog("CPF ou CNPJ:");
		
	}
	

}
