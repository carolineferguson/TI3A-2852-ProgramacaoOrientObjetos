
public class Reserva implements Pagamento {
	Cliente cliente;
	boolean pagamentoAVista;
	
	public  Reserva(Cliente cliente, boolean pagamentoAVista) {
		this.cliente = cliente;
		this.pagamentoAVista = pagamentoAVista;
	}


	@Override
	public String toString() {
		if (cliente instanceof PessoaFisica) {
			if(pagamentoAVista) {
			return "Cliente:" + cliente.nome + "Tipo: Fisica"+" Pagamento A Vista" + "Valor:"+calcularPagamento();
			}
			else {
			return "Cliente:" + cliente.nome + "Tipo: Fisica"+"Pagamento Parcelado" + pagamentoAVista + "Valor:"+calcularPagamento();
			}
		}
		else {
			if(pagamentoAVista) {
				return "Cliente:" + cliente.nome + "Tipo: Juridica "+" Pagamento A Vista"  + " Valor:"+calcularPagamento();
			}
			else {
				return "Cliente:" + cliente.nome + "Tipo: Juridica"+" Pagamento Parcelado" +  " Valor:"+calcularPagamento();
			}
			
		}
			
	}
			
	
	
	public double calcularPagamento() {
		if(pagamentoAVista)
			return 3200-3200*0.1;
		else
			return 3200;
	}

	
}
