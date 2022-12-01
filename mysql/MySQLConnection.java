package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnection {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/product";
		String userName = "root";
		String password = "Temp1234";
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection connection = DriverManager.getConnection(url, userName, password);
			System.out.println("Connected to database");
			String query="insert into productinfo (id, productName, cost) value(2, ?, 3500)";
			Statement statement = connection.createStatement();
			statement.executeQuery(query);
		
			ResultSet resultSet = statement.executeQuery("select * from productinfo");
			while(resultSet.next()) {
			System.out.println(resultSet.getInt(1)+" : "+ resultSet.getString(2)+" : "+resultSet.getInt(3));
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		
		
	}

}
