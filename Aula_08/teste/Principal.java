package teste;
import java.util.ArrayList;
import java.util.LinkedList;

import br.espm.Empregado;
import br.espm.EmpregadoComissionado;
import br.espm.EmpregadoHorista;

public class Principal {
	public static void main(String[] args) {
		ArrayList<Empregado> lista = new ArrayList<Empregado>(0);
		LinkedList<Empregado> lista2 = new LinkedList<Empregado>();
		
		lista.add(new EmpregadoHorista(0,"g",50,50));
		lista.add(new EmpregadoComissionado(2,"x",50,50));
		Empregado aux;
		for (int i = 0; i < lista.size(); i++) {
			aux = lista.get(i);
			System.out.println(aux);
			
		}
		
		for (Empregado empregado : lista) {
			System.out.println(empregado);
		}
	}

}
