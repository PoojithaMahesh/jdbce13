package mavenjdbce13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementInsertMultipleUser {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbce13","root","root");
	PreparedStatement preparedStatement=connection.prepareStatement("insert into user values(?,?,?)");
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please enter the number of entries that you want to save");
	int values=scanner.nextInt();
	
	int i=0;
	while(values>i) {
		System.out.println("enter your id");
		int id=scanner.nextInt();
		System.out.println("enter your name");
		String name=scanner.next();
		System.out.println("enter your address");
		String address=scanner.next();
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, address);
		
		preparedStatement.execute();
		i++;
	}

	
	
	connection.close();
	System.out.println("Multiple data inserted successfully");
	
}
}
