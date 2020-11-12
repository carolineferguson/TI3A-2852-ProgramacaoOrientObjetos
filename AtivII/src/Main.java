import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		ArrayList<Pessoa> dados = new ArrayList<Pessoa>();
		principal(dados);
	}
	public static void principal(ArrayList<Pessoa> dados) {
		int op = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha uma operação:\n"+"1. Cadastrar Empregado\n"+"2. Cadastrar Cliente\n"+"3. Pesquisar\n"+"4. Listar Empregados\n"+"5. Listar Clientes\n"+"6. Remover\n"+"7. Finalizar"));
		
		switch (op) {
		case 1:
			cadastrarEmpregado(dados);
			break;
		case 2:
			cadastrarCliente(dados);
			break;
		case 3:
			Pesquisar(dados);
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
		String cpf = JOptionPane.showInputDialog("CPF:");
		String matricula = JOptionPane.showInputDialog("Matricula:");
		String tipo = JOptionPane.showInputDialog("Gerente ou Vendedor?");
		if(tipo.equalsIgnoreCase("vendedor")) {
			Vendedor vend = new Vendedor(nome,cpf,matricula,0,0);
			dados.add(vend);
		}
		else {
			Gerente gerente = new Gerente(nome,cpf,matricula,0,0);
			dados.add(gerente);
		}
		principal(dados);
			
	}
	
	public static void cadastrarCliente(ArrayList<Pessoa> dados) {
		String nome = JOptionPane.showInputDialog("Nome:");
		String cpf = JOptionPane.showInputDialog("CPF:");
		Cliente cliente = new Cliente(nome,cpf,0);
		dados.add(cliente);
		principal(dados);
		
	}
	public static void Pesquisar(ArrayList <Pessoa> dados) {
		String cpf = JOptionPane.showInputDialog("CPF:");
		for(Pessoa pessoa:dados) {
			if(pessoa.getCpf().equals(cpf)) {
				if(pessoa instanceof Empregado) {
					JOptionPane.showMessageDialog(null,pessoa.toString()+"Empregado");
				}
				else {
					JOptionPane.showMessageDialog(null,pessoa.toString()+" Cliente");
				}
				break;
			}
		}
		principal(dados);
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
		String cpf = JOptionPane.showInputDialog("CPF:");
		for(Pessoa pessoa:dados) {
			if(pessoa.getCpf().equals(cpf)) {
				int confirm = JOptionPane.showConfirmDialog(null,"Tem certeza que deseja excluir?");
				if(confirm == JOptionPane.YES_OPTION) {
					dados.remove(pessoa);
				}
				break;
			}
		}
		principal(dados);
	}

}
