package mavenjdbce13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class LoadAndRegisterTheDriverConcept {
public static void main(String[] args) throws Exception {
//	1.Load and Register the Driver
//	a.Load the Driver::
	Driver driver=new Driver();
//	b.Register the Driver::
	DriverManager.registerDriver(driver);
	
//	2.Establish the Connection
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbce13", "root", "root");
//	3.Create a Statement
	Statement statement=connection.createStatement();
//	4.Execute a query
	statement.execute("insert into user values(20,'chaithanya','AP')");
//	5.Close the Connection
	connection.close();
	
	System.out.println("Data inserted successfully with Loading and Registering the Driver explicitily");
	
	
	
}
}
