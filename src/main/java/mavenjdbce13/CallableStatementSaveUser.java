package mavenjdbce13;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableStatementSaveUser {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbce13","root","root");
	CallableStatement callableStatement=connection.prepareCall("call insertUser(900,'arpit','newyork')");
	callableStatement.execute();
	connection.close();
	System.out.println("data inserted successfully with CS");
}
}
