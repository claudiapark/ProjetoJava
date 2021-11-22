package model;
import java.sql.Connection;
import java.sql.DriverManager;


public class DAO {
	private static String connectionString = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String user = "system";
	private static String password = "oracle";

	public static Connection getConnection() throws Exception {
		return DriverManager.getConnection(connectionString, user, password);
	}
	
	
}
