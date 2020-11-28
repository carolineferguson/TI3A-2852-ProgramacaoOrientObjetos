package Teste;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Cliente.Cliente;
import Cliente.ClienteDAO;
import Cliente.Pessoa_Fisica;
import Cliente.Pessoa_Juridica;
import Vinho.Vinho;
import Vinho.VinhoDAO;

public class Main {
	public static void main(String [] args) {
		ClienteDAO cliente_dao = new ClienteDAO();
		VinhoDAO vinho_dao = new VinhoDAO();
		try {
			Login(cliente_dao,vinho_dao);
			
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Digite uma opção numérica");
			Login(cliente_dao,vinho_dao);
		}
		catch (ArithmeticException e) {
	        JOptionPane.showMessageDialog(null, e);
	        Login(cliente_dao,vinho_dao);
	      }
		catch (Exception e) {
	        JOptionPane.showMessageDialog(null, e);
	        Login(cliente_dao,vinho_dao);
	      }
		
	
	}
	
	public static void Login(ClienteDAO cliente_dao,VinhoDAO vinho_dao) {
		String cpf_cnpj = JOptionPane.showInputDialog("CPF/CNPJ");
		ArrayList<Cliente>lista = cliente_dao.listar();
		for (Cliente e :lista) {
			if (e instanceof Pessoa_Fisica) {
				Pessoa_Fisica aux = (Pessoa_Fisica) e;
				if(aux.getCpf().equals(cpf_cnpj)){
					String senha = JOptionPane.showInputDialog("Senha:");
					if(aux.getSenha().equals(senha)) {
						Opcoes(e,cliente_dao,vinho_dao);
					}
				}
			}
			if (e instanceof Pessoa_Juridica) {
				Pessoa_Juridica aux = (Pessoa_Juridica) e;
				if(aux.getCnpj().equals(cpf_cnpj)){
					String senha = JOptionPane.showInputDialog("Senha:");
					if(aux.getSenha().equals(senha)) {
						Opcoes(e,cliente_dao,vinho_dao);
					}
				}
			}
			
		}
		JOptionPane.showMessageDialog(null,"Ainda não cadastro para este cpf/cnpj.");
		Cadastro(cliente_dao,vinho_dao);
	}
	
	public static void Cadastro(ClienteDAO cliente_dao,VinhoDAO vinho_dao) {
		String cpf_cnpj = JOptionPane.showInputDialog("CPF/CNPJ");
		ArrayList <String> lista = cliente_dao.listarCpf();
		for(String e: lista) {
			if(e.equals(cpf_cnpj)) {
				JOptionPane.showMessageDialog(null,"Este cpf/cnpj já esta cadastrado");
				Login(cliente_dao,vinho_dao);
			}
		}
		String nome = JOptionPane.showInputDialog("Nome:");
		String email = JOptionPane.showInputDialog("Email:");
		String senha = JOptionPane.showInputDialog("Senha:");
		String tipo = JOptionPane.showInputDialog("PF ou PJ?");
		Cliente novo_cliente = null;
		if(tipo.equalsIgnoreCase("pf")) {
			 novo_cliente = new Pessoa_Fisica(nome,email,senha,cpf_cnpj);
		}
		if(tipo.equalsIgnoreCase("pj")) {
			 novo_cliente = new Pessoa_Juridica(nome,email,senha,cpf_cnpj);
		}
		cliente_dao.inserir(novo_cliente);
		Login(cliente_dao,vinho_dao);
		
	}
	
	public static void Opcoes(Cliente cliente,ClienteDAO cliente_dao,VinhoDAO vinho_dao) {
		String op = JOptionPane.showInputDialog("Listar ou Cadastrar Vinhos");
		if(op.equalsIgnoreCase("listar")) {
			String aux = "";
			for(Vinho a : vinho_dao.listarPont()) {
				aux += a.getProduto() + " " + a.getCasta() + " " + a.getSafra() + " "+ a.getPontuacao()+ "\n";
			}
			JOptionPane.showMessageDialog(null,aux);
			Opcoes(cliente,cliente_dao,vinho_dao);
		}
		else {
			CadastroVinho(cliente,cliente_dao,vinho_dao);
		}
	}
	
	public static void CadastroVinho(Cliente cliente,ClienteDAO cliente_dao,VinhoDAO vinho_dao) {
		String produto = JOptionPane.showInputDialog("Produto");
		String casta =  JOptionPane.showInputDialog("Casta");
		int safra =  Integer.parseInt(JOptionPane.showInputDialog("Safra"));
		float pontuacao =  Float.parseFloat(JOptionPane.showInputDialog("Pontuação"));
		int id = vinho_dao.listar().size()+1000;
		String cpf_cnpj;
		if(cliente instanceof Pessoa_Juridica) {
			Pessoa_Juridica aux = (Pessoa_Juridica) cliente;
			cpf_cnpj = aux.getCnpj();
		}
		else {
			Pessoa_Fisica aux = (Pessoa_Fisica) cliente;
			cpf_cnpj = aux.getCpf();
		}
		Vinho novo_vinho = new Vinho(id,cpf_cnpj,produto,casta,safra,pontuacao); 
		vinho_dao.inserir(novo_vinho);
		Opcoes(cliente,cliente_dao,vinho_dao);
		
	}

}
