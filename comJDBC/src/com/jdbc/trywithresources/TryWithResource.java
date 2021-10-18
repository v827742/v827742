package com.jdbc.trywithresources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TryWithResource {
	
	public static void main(String[] args) {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
 try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
 		Statement smt=con.createStatement();
        ResultSet rs=smt.executeQuery("select * from student");)	
     {
		
	 while(rs.next())
	 {
		 System.out.println(rs.getInt(1));
		 System.out.println(rs.getString(2));
		 System.out.println(rs.getString(3));
	 }
     }
      catch(Exception e)
 {
    	e.printStackTrace();
 }
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
	
	}


