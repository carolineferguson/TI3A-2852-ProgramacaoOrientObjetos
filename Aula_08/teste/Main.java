package teste;

import br.espm.Empregado;
import br.espm.EmpregadoComissionado;
import br.espm.EmpregadoHorista;

public class Main {
	public static void main(String[] args) {
		Empregado[] empregados = new Empregado[2];
		empregados[0] = new EmpregadoComissionado(1,"A",50,100);
		empregados[1] = new EmpregadoHorista(2,"B",5,10);
			
		for(Empregado e: empregados) {
			System.out.println(e.toString());
		}
	}

}
