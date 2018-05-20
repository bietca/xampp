package model.dao.admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectData {
	static String url = "jdbc:sqlserver://localhost:1433;databaseName=SE08";
	static String userName = "loc";
	static	String password = "loc";
	public static Connection connection;
	
	public static Connection getconnect(){
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("Ket noi thanh cong");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Ket noi loi");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Ket noi loi");
		}
		return connection;
	}
	
}
