
public class Main {
	public static void main(String[] args) {
		PessoaFisica p1 = new PessoaFisica("G","5252");
		Reserva r1 = new Reserva(p1,true);
		
		System.out.println(r1.toString());
		System.out.println(p1.toString());
	}

}
