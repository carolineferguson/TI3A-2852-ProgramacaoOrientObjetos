package Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Conexao.Conexao;


public class ClienteDAO {
	 private Connection connection;
	  private PreparedStatement ps;
	  private String sql;
	  private ResultSet rs;
	  
	  
	  public void inserir(Cliente cliente) {
		  sql = "INSERT INTO java_cliente(nome,email,senha,cpf_cnpj,tipoDeCliente) VALUES(?,?,?,?,?)";
		  connection = new Conexao().conectar();
		  try {
			  ps = connection.prepareStatement(sql);
			  
			  ps.setString(1,cliente.getNome());
			  ps.setString(2,cliente.getEmail());
			  ps.setString(3,cliente.getSenha());
			  if(cliente instanceof Pessoa_Fisica) {
				 ps.setString(4,((Pessoa_Fisica) cliente).getCpf());
				 ps.setString(5,"PF");
			  }
			  if (cliente instanceof Pessoa_Juridica) {
				  ps.setString(4,((Pessoa_Juridica) cliente).getCnpj());
				  ps.setString(5, "PJ");
			  }
			  ps.execute();
		  }
		  catch(SQLException e){
			  System.out.println("Erro ao inserir dados no nanco\n"+e);
		  }
	  }
	  
	  public ArrayList<Cliente> listar(){
		  ArrayList<Cliente> lista = new ArrayList<Cliente>();
		  sql = "SELECT * from java_cliente";
		  connection = new Conexao().conectar();
		  try {
			  ps = connection.prepareStatement(sql);
			  rs = ps.executeQuery();
			  while(rs.next()) {
				  if(rs.getString("tipoDeCliente").equalsIgnoreCase("PF"))
					  lista.add(new Pessoa_Fisica(rs.getString("nome"),rs.getString("email"),rs.getString("senha"),rs.getString("cpf_cnpj")));
				  if(rs.getString("tipoDeCliente").equalsIgnoreCase("PJ"))
					  lista.add(new Pessoa_Juridica(rs.getString("nome"),rs.getString("email"),rs.getString("senha"),rs.getString("cpf_cnpj")));
			  }
		  }
		  catch(SQLException e) {
			  System.out.println("Erro ao listar os dados"+e);
		  }
		  return lista;
	  }
	  
	
	  
	  


}
