import dotenv.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexao {
	private Connection connection;
	
	public Connection conectar() {
		Dotenv dotenv = Dotenv.load();
		try {
		Class.forName(dotenv.get("driver"));
		connection = DriverManager.getConnection(dotenv.get("conexao"),dotenv.get("host"),dotenv.get("senha"));
		}
		catch(ClassNotFoundException e) {
			System.out.println("Erro ao carregar o driver de conexão\n"+e);
		} catch (SQLException e) {
			System.out.println("Erro ao conectar com o banco de dados\n"+e);
		}
		return connection;
}
}
