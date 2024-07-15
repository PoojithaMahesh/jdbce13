package mavenjdbce13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class PreparedStatementDeleteUser {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter id to be deleted");
		int id = scanner.nextInt();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbce13", "root", "root");
		PreparedStatement preparedStatement = connection.prepareStatement("delete from user where id=?");
		preparedStatement.setInt(1, id);
		
		preparedStatement.execute();
		
		System.out.println("Data deleted successfully");
	}
}
