import java.util.LinkedList;

import javax.swing.JOptionPane;


public class Main {
			static LinkedList<Reserva> lista_reserva = new LinkedList<Reserva>();
			static LinkedList<Reserva> lista_espera = new LinkedList<Reserva>();
			static LinkedList<String> lista_reservareg = new LinkedList<String>();
			static LinkedList<String> lista_esperareg = new LinkedList<String>();
	public static void main(String[] args) {
		
		try {
		principal();
		
		}
		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null,"Digite um n�mero");
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
		else if(aux==5) {
			cancelarReserva();
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
			lista_esperareg.add(reg);
			JOptionPane.showMessageDialog(null, "Esta reserva foi para a lista de espera");
		}
		principal();

		
	}
	
	public static void pesquisar() {
		String aux_reg = JOptionPane.showInputDialog("CPF OU CNPJ:");
		if(lista_reservareg.contains(aux_reg)) {
			JOptionPane.showMessageDialog(null, "H� reserva para esse cpf/cnpj");
				
			}
			else {
				JOptionPane.showMessageDialog(null, "N�o h� reserva para esse cpf/cnpj");
			}
		
		principal();
		}
	public static void imprimirReservas() {
		String aux = " ";
		for(Reserva reserva:lista_reserva) {
			aux += "\n"+reserva.toString(); 
		}
		JOptionPane.showMessageDialog(null,aux);
		principal();
	}
	public static void imprimirEspera() {
		String aux = " ";
		int cont = 1;
		for(Reserva reserva:lista_espera) {
			aux += "\n"+cont+" "+reserva.toString();
			cont++;
		}
		JOptionPane.showMessageDialog(null,aux);
		principal();
	}
	public static void cancelarReserva() {
		int cont = 0;
		String reg = JOptionPane.showInputDialog("CPF ou CNPJ:");
		if(lista_reservareg.contains(reg)) {
			JOptionPane.showMessageDialog(null, "H� reserva para esse cpf");
		
		for(String re: lista_reservareg) {
			if(reg.equals(re)) {
				JOptionPane.showMessageDialog(null, "H� reserva para esse cpf");
				lista_reserva.remove(cont);
				lista_reservareg.remove(cont);
				lista_reserva.addLast(lista_espera.element());
				lista_espera.remove();
				lista_esperareg.remove();
				break;
			}
		}
		}
			else {
				JOptionPane.showMessageDialog(null, "N�o h� reserva para esse cpf");
			}
			cont++;
		
		
		principal();
	}
	

}
