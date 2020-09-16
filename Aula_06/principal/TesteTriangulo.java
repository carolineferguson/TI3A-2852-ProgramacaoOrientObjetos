package principal;
import javax.swing.JOptionPane;

import ex01.Triangulo;

public class TesteTriangulo {

	public static void main(String[] args) {
		Triangulo[] triangulo = new Triangulo[3];
		
		
		for (int i=0;i<3;i++) {
			double a = Double.parseDouble(JOptionPane.showInputDialog("Valor A:"));
			double b = Double.parseDouble(JOptionPane.showInputDialog("Valor B:"));
			double c = Double.parseDouble(JOptionPane.showInputDialog("Valor C:"));
			triangulo[i] = new Triangulo(a,b,c);
		}
		
		
		for (int i=0;i<3;i++) {
			String area = String.format("%.4f",triangulo[i].calcularArea());
			String perim = String.format("%.4f",triangulo[i].calcularPerimetro());
			String x = String.format("%.4f",triangulo[i].calcularCentroideX());
			String y = String.format("%.4f",triangulo[i].calcularCentroideY());
			JOptionPane.showMessageDialog(null,"Tringulo "+(i+1)+"\n"+"Area:"+area+"\n"
			+"Perim:"+perim+"\n"+"x:"+x+"\n"+"y:"+y);
		}
		
		
	}

}
