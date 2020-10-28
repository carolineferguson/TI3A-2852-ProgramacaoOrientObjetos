
public class Cilindro extends Forma implements Operacao {
	double altura;
	
	public Cilindro(int x, int y, double raio, double altura) {
		super(x, y, raio);
		this.altura = altura;
	}

	public String toString() {
		return  super.toString() + "Altura:" + altura;
	}


	@Override
	public double calcularArea() {
		return 2*Math.PI * raio * raio + altura * Math.PI * raio * 2;
		
	}
	
	@Override
	public double calcularVolume() {
		return calcularArea() * altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	

}
