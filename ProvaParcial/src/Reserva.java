
public class Reserva implements Pagamento {
	Cliente cliente;
	boolean pagamentoAVista;
	
	public  Reserva(Cliente cliente, boolean pagamentoAVista) {
		this.cliente = cliente;
		this.pagamentoAVista = pagamentoAVista;
	}

	@Override
	public String toString() {
		if (cliente instanceof PessoaFisica) 
			return "cliente:" + cliente + "Tipo: Fisica"+"pagamentoAVista:" + pagamentoAVista + "Valor:"+calcularPagamento();
		else
			return "cliente:" + cliente + "Tipo: Juridica"+ ", pagamentoAVista:" + pagamentoAVista+"Valor:"+calcularPagamento();
	}
	
	
	public double calcularPagamento() {
		if(pagamentoAVista)
			return 3200-3200*0.1;
		else
			return 3200;
	}
}
