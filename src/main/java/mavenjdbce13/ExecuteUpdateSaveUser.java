package mavenjdbce13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteUpdateSaveUser {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		1.Load and Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
//		2.Establish the Connection
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbce13", "root", "root");
//		3.Create a Statement
		Statement statement=connection.createStatement();
//		4.Execute a query
		int value=statement.executeUpdate("insert into user values(3,'fahar','AP')");
//		5.Close the Connection
		connection.close();
		System.out.println(value);
		
		System.out.println("Data inserted successfully");
	}
}
