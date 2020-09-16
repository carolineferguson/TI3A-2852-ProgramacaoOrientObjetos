package ex2;

public class teste {

	public static void main(String[] args) {
		System.out.println(somar(2,3));
		System.out.println(somar(2,3,4,5));
		System.out.println(somar(5,6,7,8));

	}
	
	public static int somar(int ... x) {
		int aux = 0;
		for(int i : x) {
			aux += i;
		}
		return aux;
	}

}
