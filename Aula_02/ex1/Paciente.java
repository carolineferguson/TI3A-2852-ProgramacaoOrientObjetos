package ex1;

public class Paciente {
	int idade;
	String nome;
	
	public int calcularFreqMaxima() {
		int freq = 220 - idade;
		return freq;
	}
	public double calcularFreqAlvo() {
		double freqalvomin = (220-idade) * 0.5;
		double freqalvomax = (220-idade) * 0.85;
		return freqalvomin;
	}

}
