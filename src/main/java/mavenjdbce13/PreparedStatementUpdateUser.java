package mavenjdbce13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementUpdateUser {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter id to be updated");
		int id = scanner.nextInt();
		System.out.println("Please enter name ");
		String name = scanner.next();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbce13", "root", "root");
		PreparedStatement preparedStatement = connection.prepareStatement("update user set name=? where id=?");
		preparedStatement.setInt(2, id);
		preparedStatement.setString(1, name);
		preparedStatement.execute();
		System.out.println("Data updated successfully");
	}
}
