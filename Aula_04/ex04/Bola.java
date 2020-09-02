package ex04;

public class Bola {
	String cor;
	double raio;
	
	public Bola(String cor,double raio) {
		this.cor = cor;
		this.raio = raio;
	}
	
	public Bola maiorBola(Bola b2,Bola b3) {
		Bola aux = this;// referencia ao objeto que fez a chamada
		if(b2.raio>b3.raio && b2.raio > aux.raio) {
			aux =  b2;
		}
		else if(b3.raio>aux.raio) {
			aux = b3;
		}
		return aux;
	}
	
	public String retornarDados() {
		return cor +" " + raio;
	}

}
