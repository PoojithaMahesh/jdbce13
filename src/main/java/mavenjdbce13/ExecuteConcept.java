package mavenjdbce13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ExecuteConcept {
public static void main(String[] args) throws Exception {
////	/	1.Load and Register the Driver
//	Class.forName("com.mysql.cj.jdbc.Driver");
////	2.Establish the Connection
//	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbce13", "root", "root");
////	3.Create a Statement
//	Statement statement=connection.createStatement();
////	4.Execute a query
//	boolean value=statement.execute("insert into user values(2,'chaithanya','AP')");
////	5.Close the Connection
//	connection.close();
//	System.out.println(value);
//	System.out.println("Data inserted successfully");
	
	
//	Update
	
//	Class.forName("com.mysql.cj.jdbc.Driver");
//	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbce13","root","root");
//	Statement statement=connection.createStatement();
//	boolean value=statement.execute("update user set name='chaithu' where id=2");
//	connection.close();
//	System.out.println(value);
//	System.out.println("Data Updated successfully");
	
	
	
//	Delete
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbce13","root","root");
	Statement statement=connection.createStatement();
	boolean value=statement.execute("delete from User where id=2");
	connection.close();
	System.out.println(value);
	System.out.println("Data deleted successfully");
	
	
	
	
	
	
	
}
}
