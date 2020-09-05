package ex04;

public class Hora {
	int hora,minuto,segundo;
	public Hora (int hora,int minuto,int segundo){
		if (0<=hora && hora<=23){
			this.hora = hora;
		}
		if (0<=minuto && minuto<=59) {
			this.minuto = minuto;
		}
		if (0<=segundo && segundo<=59) {
			this.segundo = segundo;
		}
		
	}
	
	public String retornarHora() {
		return hora+":"+minuto+":"+segundo;
	}

}
