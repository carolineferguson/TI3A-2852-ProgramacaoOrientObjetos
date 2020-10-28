
public class Circulo extends Forma {
	
	 public Circulo(int x, int y, double raio) {
		super(x, y, raio);

	}
	 @Override
	public double calcularArea() {
		return Math.PI * raio * raio;
	}

}
