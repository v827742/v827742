package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test1get {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
	
	String sql="select* from student1";
	
	Statement smt=con.createStatement();
	
	
	ResultSet rs=smt.executeQuery(sql);
	
	while(rs.next())
	{ 
		
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getString(3));
		
	}
	
	
	
	
	}

}
