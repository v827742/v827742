package callableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestCS {
	
	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");

		CallableStatement cs=con.prepareCall("{call insertStu(?,?,?)}");	
			System.out.println(cs);
			cs.setInt(1, 4);
			cs.setString(2, "sumit");
			cs.setString(3, "mumbai");
			
			cs.execute();
			System.out.println("inserted");
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}

}
