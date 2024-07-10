package mavenjdbce13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ExecuteUpdateDeleteUser {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbce13","root","root");
	Statement statement=connection.createStatement();
	int value=statement.executeUpdate("delete from User where id=2");
	connection.close();
	System.out.println(value);
	System.out.println("Data deleted successfully");
}
}
