package db;
//Usando singleton para instanciar a conexão de um banco de dados utilizando JDBC.
import java.sql.Connection;
import java.sql.DriverManager;
public class DB{
	static Connection conn = null;
	public static Connection getInstanceDB() { //getInstance()
		try {
			if (conn == null) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection("url", "user", "pass");
				if(conn!=null)
					System.out.println("Conexão bem sucedida com o banco de dados!");	
			}
		}
		catch(Exception e) {
			throw new IllegalArgumentException("Conexão não estabelecida: Possíveis problemas: URL, User, Password");
		}return conn;
	}
	public static Connection closeConnection() {
		try{
			 if(conn != null) {
				 conn.close();
			 }
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}