import javax.swing.JOptionPane;
public class Main {
	public static void main(String[] args) {
		
		try {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Primeiro valor"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Segundo valor"));
		int res = x/y;
		JOptionPane.showMessageDialog(null,res);
		}
		catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"Digite um número");
			
		}
		catch(ArithmeticException e) {
			JOptionPane.showMessageDialog(null,"Não existe divisão por zero");
		}
		
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		finally {
			JOptionPane.showMessageDialog(null,"Fechando");
		}
	}

}
