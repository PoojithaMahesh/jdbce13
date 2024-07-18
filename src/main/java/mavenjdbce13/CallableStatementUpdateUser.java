package mavenjdbce13;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableStatementUpdateUser {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbce13","root","root");
		CallableStatement callableStatement=connection.prepareCall("call updateUser(900,'arpithsingh')");
		callableStatement.execute();
		connection.close();
		System.out.println("data updated successfully with CS");
	}
}
