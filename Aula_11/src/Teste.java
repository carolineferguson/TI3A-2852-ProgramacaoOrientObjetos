import java.util.ArrayList;

public class Teste {
	public static void main(String [] args) {
		SpotifyDAO dao = new SpotifyDAO();
		
		Musica ms = new Musica("6LxcPUqx6noURdA5qc4BAT","Motion Sickness","0AkAmg94XyiHODJaiGHh9O","Stranger in the Alps");
		Musica wr = new Musica("4ctEt5qumxA8RuzdeQagkk","Would You Rather","0AkAmg94XyiHODJaiGHh9O","Stranger in the Alps");
	    
		dao.inserir(ms);
		dao.inserir(wr);
		
		ArrayList<Musica> lista = dao.listar();
		for(Musica musica : lista) {
			System.out.println(musica.getNome()+" "+musica.getNomealbum());
		}
	}

}
