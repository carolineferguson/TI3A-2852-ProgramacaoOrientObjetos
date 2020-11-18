import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SpotifyDAO {
  private Connection connection;
  private PreparedStatement ps;
  private String sql;
  private ResultSet rs;
  
  
  public void inserir(Musica musica) {
	  sql = "INSERT INTO musica(idspotify,nome,idalbum,nomealbum) VALUES(?,?,?,?)";
	  connection = new Conexao().conectar();
	  try {
		  ps = connection.prepareStatement(sql);
		  ps.setString(1, musica.getIdspotify());
		  ps.setString(2,musica.getNome());
		  ps.setString(3,musica.getIdalbum());
		  ps.setString(4,musica.getNomealbum());
		  ps.execute();
	  }
	  catch(SQLException e){
		  System.out.println("Erro ao inserir dados no nanco\n"+e);
	  }
  }
  
  public ArrayList<Musica> listar(){
	  ArrayList<Musica> lista = new ArrayList<Musica>();
	  sql = "SELECT * from musica";
	  connection = new Conexao().conectar();
	  try {
		  ps = connection.prepareStatement(sql);
		  rs = ps.executeQuery();
		  while(rs.next()) {
			  lista.add(new Musica(rs.getString("idspotify"),rs.getString("nome"),rs.getString("idalbum"),rs.getString("nomealbum")));
		  }
	  }
	  catch(SQLException e) {
		  System.out.println("Erro ao listar os dados"+e);
	  }
	  return lista;
  }
}
