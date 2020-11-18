package br.espm.main;

import br.espm.pessoa.Pessoa;
import br.espm.cliente.Cliente;
import br.espm.empregado.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Pessoa> dados = new ArrayList<Pessoa>();
		try {
			principal(dados);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Digite uma opção numérica");
			principal(dados);
		}
		catch (ArithmeticException e) {
	        JOptionPane.showMessageDialog(null, e);
	        principal(dados);
	      }
		catch (Exception e) {
	        JOptionPane.showMessageDialog(null, e);
	        principal(dados);
	      }
	}

	public static void principal(ArrayList<Pessoa> dados) {
		int op = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Escolha uma operação" + "\n" + "1. Cadastrar Empregado" + "\n" + "2. Cadastrar Cliente" + "\n"
						+ "3. Pesquisar" + "\n" + "4. Listar Empregados" + "\n" + "5. Listar Clientes" + "\n"
						+ "6. Remover" + "\n" + "7. Finalizar"));

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
		case 7:
			JOptionPane.showMessageDialog(null, "Finalizando janela gráfica");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Número inválido");
		}		
	}
	

	public static void cadastrarEmpregado(ArrayList<Pessoa> dados) {
		String tipo = JOptionPane.showInputDialog("Gerente ou Vendedor?");
		String nome = JOptionPane.showInputDialog("Nome:");
		String cpf = JOptionPane.showInputDialog("CPF:");
		String matricula = JOptionPane.showInputDialog("Matricula:");
		if (tipo.equalsIgnoreCase("vendedor")) {
			Vendedor vend = new Vendedor(nome, cpf, matricula, 0, 0);
			dados.add(vend);
		} else {
			Gerente gerente = new Gerente(nome, cpf, matricula, 0, 0);
			dados.add(gerente);
		}
		principal(dados);

	}

	public static void cadastrarCliente(ArrayList<Pessoa> dados) {
		String nome = JOptionPane.showInputDialog("Nome:");
		String cpf = JOptionPane.showInputDialog("CPF:");
		Cliente cliente = new Cliente(nome, cpf, 0);
		dados.add(cliente);
		principal(dados);

	}

	public static void Pesquisar(ArrayList<Pessoa> dados) {
		String cpf = JOptionPane.showInputDialog("CPF:");
		for (Pessoa pessoa : dados) {
			if (pessoa.getCpf().equals(cpf)) {
				if (pessoa instanceof Empregado) {
					JOptionPane.showMessageDialog(null, pessoa.toString() + " Empregado");
				} else {
					JOptionPane.showMessageDialog(null, pessoa.toString() + " Cliente");
				}
				break;
			}
			else {
				JOptionPane.showMessageDialog(null,"Não há este cpf no registro");
				break;
			}
		}
		principal(dados);
	}

	public static void ListarEmpregados(ArrayList<Pessoa> dados) {
		String aux = " ";
		for (Pessoa pessoa : dados) {
			if (pessoa instanceof Empregado) {
				aux += "\n" + pessoa.toString();
			}
		}
		JOptionPane.showMessageDialog(null, aux, "Lista de Empregados", JOptionPane.DEFAULT_OPTION);
		principal(dados);
	}

	public static void ListarClientes(ArrayList<Pessoa> dados) {
		String aux = " ";
		for (Pessoa pessoa : dados) {
			if (pessoa instanceof Cliente) {
				aux += "\n" + pessoa.toString();
			}
		}
		JOptionPane.showMessageDialog(null, aux, "Lista de Clientes", JOptionPane.DEFAULT_OPTION);
		principal(dados);
	}

	public static void Remover(ArrayList<Pessoa> dados) {
		String cpf = JOptionPane.showInputDialog("CPF:");
		for (Pessoa pessoa : dados) {
			if (pessoa.getCpf().equals(cpf)) {
				int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir?");
				if (confirm == JOptionPane.YES_OPTION) {
					dados.remove(pessoa);
				}
				break;
			}
			else {
				JOptionPane.showMessageDialog(null,"Não há este cpf no registro");
				break;
			}
		}
		principal(dados);

	}

}