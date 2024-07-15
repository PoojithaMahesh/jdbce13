package mavenjdbce13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class PreparedStatementselectUser {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter id to be selected");
		int id = scanner.nextInt();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbce13", "root", "root");
		PreparedStatement preparedStatement = connection.prepareStatement("Select * from User where id=?");
		preparedStatement.setInt(1, id);
		
		ResultSet resultSet=preparedStatement.executeQuery();
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString("name"));
			System.out.println(resultSet.getString(3));
		}
		System.out.println("Data selected successfully");
	}
}
