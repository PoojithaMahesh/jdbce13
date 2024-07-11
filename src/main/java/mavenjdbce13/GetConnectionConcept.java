package mavenjdbce13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class GetConnectionConcept {
public static void main(String[] args) throws Exception {
//	1.Load and Register the Driver
	Class.forName("com.mysql.cj.jdbc.Driver");
//	2.Establish the Connection
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbce13?user=root&password=root");
//	3.Create a Statement
	Statement statement=connection.createStatement();
//	4.Execute a query
	statement.execute("insert into user values(200,'chaithanya','AP')");
//	5.Close the Connection
	connection.close();
	
	System.out.println("Data inserted successfully with the different getConnection concept");
}
}
