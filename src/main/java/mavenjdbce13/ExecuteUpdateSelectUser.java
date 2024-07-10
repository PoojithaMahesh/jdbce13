package mavenjdbce13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExecuteUpdateSelectUser {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbce13","root","root");
		Statement statement=connection.createStatement();
		int value=statement.executeUpdate("Select * from User where id=1");
		System.out.println(value);
		connection.close();
		System.out.println("Data selected successfully");
	}
}
