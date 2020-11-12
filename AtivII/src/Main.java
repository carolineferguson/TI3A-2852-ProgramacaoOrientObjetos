import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		ArrayList<Pessoa> dados = new ArrayList<Pessoa>();
		principal(dados);
	}
	public static void principal(ArrayList<Pessoa> dados) {
		int op = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha uma operação"));
		
		switch (op) {
		case 1:
			cadastrarEmpregado(dados);
			break;
		case 2:
			cadastrarCliente(dados);
			break;
		case 3:
			Pesquisar();
			break;
		case 4:
			ListarEmpregados(dados);
			break;
		case 5:
			ListarClientes(dados);
			break;
		case 6:
			Remover(dados);
			break;
		}
		}
	
	public static void cadastrarEmpregado(ArrayList <Pessoa> dados) {

		String nome = JOptionPane.showInputDialog("Nome:");
		String reg = JOptionPane.showInputDialog("CPF ou CNPJ:");
		String matricula = JOptionPane.showInputDialog("Matricula:");
		String tipo = JOptionPane.showInputDialog("Gerente ou Vendedor?");
		if(tipo.equalsIgnoreCase("vendedor")) {
			Vendedor vend = new Vendedor(nome,reg,matricula,0,0);
			dados.add(vend);
		}
		else {
			Gerente gerente = new Gerente(nome,reg,matricula,0,0);
			dados.add(gerente);
		}
		principal(dados);
			
	}
	
	public static void cadastrarCliente(ArrayList<Pessoa> dados) {
		String nome = JOptionPane.showInputDialog("Nome:");
		String reg = JOptionPane.showInputDialog("CPF ou CNPJ:");
		Cliente cliente = new Cliente(nome,reg,0);
		dados.add(cliente);
		principal(dados);
		
	}
	public static void Pesquisar() {
		
	}
	
	public static void ListarEmpregados(ArrayList<Pessoa> dados) {
		String aux = " ";
		for(Pessoa pessoa:dados) {
			if (pessoa instanceof Empregado) {
			aux += "\n"+pessoa.toString(); 
			}
		}
		JOptionPane.showMessageDialog(null,aux);
		principal(dados);
	}
	
	public static void ListarClientes(ArrayList<Pessoa> dados) {
		String aux = " ";
		for(Pessoa pessoa:dados) {
			if (pessoa instanceof Cliente) {
			aux += "\n"+pessoa.toString(); 
			}
		}
		JOptionPane.showMessageDialog(null,aux);
		principal(dados);
	}
	
	public static void Remover(ArrayList<Pessoa> dados) {
		
	}

}
