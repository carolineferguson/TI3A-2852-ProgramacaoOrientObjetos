import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int op = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha uma operação"));
		
		switch (op) {
		case 1:
			cadastrarEmpregado();
			break;
		case 2:
			cadastrarCliente();
			break;
		case 3:
			Pesquisar("");
			break;
		case 4:
			ListarEmpregados();
			break;
		case 5:
			ListarClientes();
			break;
		case 6:
			Remover();
			break;
		}
		

	}
	
	public static Empregado cadastrarEmpregado() {
		Empregado empregado = null;
		return empregado;
	}
	
	public static Cliente cadastrarCliente() {
		Cliente cliente = null;
		return cliente;
	}
	public static void Pesquisar(String cpf) {
		
	}
	
	public static void ListarEmpregados() {
	}
	
	public static void ListarClientes() {
		
	}
	
	public static void Remover() {
		
	}

}
