package ex1;

public class TesteCliente {
	
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Teste", "128.439.392-10");
		c1.cartao.numero = 43809;
		c1.cartao.totalFatura = 3298.00;
		c1.conta.limite = 4000;
		c1.conta.numero = 13425;
		c1.conta.saldo = 200;
		System.out.println(c1.retornarDados());
	}

}
