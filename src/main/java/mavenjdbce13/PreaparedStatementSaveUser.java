package mavenjdbce13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreaparedStatementSaveUser {
public static void main(String[] args) throws Exception {
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please enter id");
	int id=scanner.nextInt();
	System.out.println("Please enter your name");
	String name=scanner.next();
	System.out.println("please enter your address");
	String address=scanner.next();
	
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbce13","root","root");
	
	PreparedStatement preparedStatement=connection.prepareStatement("insert into user values(?,?,?)");
	
	preparedStatement.setInt(1, id);
	preparedStatement.setString(2, name);
	preparedStatement.setString(3, address);
	
	preparedStatement.execute();
	
	connection.close();
	System.out.println("Data inserted successfully with PreparedStatement");
	
	
	
}
}
