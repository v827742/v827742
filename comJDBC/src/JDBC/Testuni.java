package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Testuni {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test1","root","root");
	
	String sql="select* from college";
	
	Statement s=con.createStatement();
	
	ResultSet rs=s.executeQuery(sql);
	
	while(rs.next())
	{
			
		System.out.println("  ");
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getInt(3));
		System.out.println(rs.getString(4));
		System.out.println(rs.getString(5));
		
	}
	
	
	}

}
