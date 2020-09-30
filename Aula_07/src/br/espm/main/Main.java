package br.espm.main;
import br.espm.aluno.*;

public class Main {
	public static void main(String[] args) {
		Aluno[] objetos = new Aluno[3];
		objetos[0] = new AlunoFundamental(113,"A",9,9,3);
		objetos[1] = new AlunoGraduacao(112,"B",9,9,"T",8);
		objetos[2] = new AlunoPosGraduacao(111,"C",9,9,"T");
		
		for(int i = 0;i<objetos.length;i++) {
			System.out.println(objetos[i].toString());
		}
		
		
	}

}
