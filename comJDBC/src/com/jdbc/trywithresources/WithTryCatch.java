package com.jdbc.trywithresources;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
public class WithTryCatch {
public static void main(String[] args){
	try{
		
	
	Class.forName("com.mysql.jdbc.Driver");
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
	
	String sql="select * from student";
	
	Statement smt=con.createStatement();
	
	ResultSet rs=smt.executeQuery(sql);
	
	while(rs.next())
	{
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getString(3));
	}
	smt.close();
	con.close();
	
	}
	catch(ClassNotFoundException  | SQLException e)
	{
		System.out.println(e.getMessage());
	}
	
	

	
	
	
	
	
}	
}
