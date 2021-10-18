package UpdateQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdtTable {
	public static void main(String[] args) {
		try{
			
		
		Class.forName("com.mysql.jdbc.Driver");
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		
		Statement smt=con.createStatement();
		
		String updt="update student set name='dinesh',address='nagpur' where idStudent=101";
		System.out.println(updt);
		smt.execute(updt);
		
		con.close();
		smt.close();
		}
		catch(ClassNotFoundException |SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
