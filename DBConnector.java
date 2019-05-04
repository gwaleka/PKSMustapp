package app.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	Connection conn;
	public DBConnector() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Nie zarestrowano klasy sterownika!");
		}
	}
	public Connection connInit(){
		String url = "jdbc:mysql://localhost:3306/usersjdbc";
		String user = "root";
		String pass = "root1337";
		try {
			conn = DriverManager.getConnection(url, user, pass);
			//conn.setAutoCommit(false);
		} catch (SQLException e) {
			System.out.println("Nie moge polaczyc sie z baza danych");
		}
		return conn;
	}
}
