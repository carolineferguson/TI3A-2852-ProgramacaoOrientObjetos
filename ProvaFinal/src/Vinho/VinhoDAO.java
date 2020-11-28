package Vinho;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Conexao.Conexao;

	public class VinhoDAO {

	  private Connection connection;
	  private PreparedStatement ps;
	  private String sql;
	  private ResultSet rs;
	  
	  
	  public void inserir(Vinho vinho) {
		  sql = "INSERT INTO java_vinho(id,cpf_cnpj,produto,casta,safra,pontuacao) VALUES(?,?,?,?,?,?)";
		  connection = new Conexao().conectar();
		  try {
			  ps = connection.prepareStatement(sql);
			  
			  ps.setInt(1,vinho.getId());
			  ps.setString(2,vinho.getCpf_cnpj());
			  ps.setString(3,vinho.getProduto());
			  ps.setString(4,vinho.getCasta());
			  ps.setInt(5,vinho.getSafra());
			  ps.setFloat(6,vinho.getPontuacao());
			  ps.execute();
		  }
		  catch(SQLException e){
			  System.out.println("Erro ao inserir dados no nanco\n"+e);
		  }
	  }
	  
	  public ArrayList<Vinho> listar(){
		  ArrayList<Vinho> lista = new ArrayList<Vinho>();
		  sql = "SELECT * from java_vinho";
		  connection = new Conexao().conectar();
		  try {
			  ps = connection.prepareStatement(sql);
			  rs = ps.executeQuery();
			  while(rs.next()) {
				  lista.add(new Vinho(rs.getInt("id"),rs.getString("cpf_cnpj"),rs.getString("produto"),rs.getString("casta"),rs.getInt("safra"),rs.getFloat("pontuacao")));
			  }
		  }
		  catch(SQLException e) {
			  System.out.println("Erro ao listar os dados"+e);
		  }
		  return lista;
	  }
	  
	  public ArrayList<Vinho> listarPont(){
		  ArrayList<Vinho> lista = new ArrayList<Vinho>();
		  sql = "SELECT * FROM  java_vinho ORDER BY pontuacao DESC";
		  connection = new Conexao().conectar();
		  try {
			  ps = connection.prepareStatement(sql);
			  rs = ps.executeQuery();
			  while(rs.next()) {
				  lista.add(new Vinho(rs.getInt("id"),rs.getString("cpf_cnpj"),rs.getString("produto"),rs.getString("casta"),rs.getInt("safra"),rs.getFloat("pontuacao")));
			  }
		  }
		  catch(SQLException e) {
			  System.out.println("Erro ao listar os dados"+e);
		  }
		  return lista;
	  }
	  

	  

	}


