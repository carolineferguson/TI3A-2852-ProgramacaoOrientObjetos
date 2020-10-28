import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Forma> lista =  new ArrayList<Forma>();
		lista.add(new Circulo(2,2,2));
		lista.add(new Cilindro(3,3,3,3));
		lista.add(new Circulo(4,4,4));
		lista.add(new Cilindro(5,5,5,5));
		
		for(Forma e:lista) {
			System.out.println(e.toString());
			System.out.println(e.calcularArea());
			if(e instanceof Cilindro) {
				System.out.println(((Cilindro) e).calcularVolume());
			}
		}
		

	}

}
