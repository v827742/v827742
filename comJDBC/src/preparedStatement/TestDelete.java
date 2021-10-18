package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.PreparedStatement;

public class TestDelete {
public static void main(String[] args) {
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");		
		
String s="delete from student where idStudent=?";

PreparedStatement rs=con.prepareStatement(s);

		rs.setInt(1, 712);
		
		rs.execute();
		
		
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
