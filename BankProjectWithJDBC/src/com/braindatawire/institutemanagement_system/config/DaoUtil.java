package com.braindatawire.institutemanagement_system.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DaoUtil {
      static Connection con=null;
	public static Connection getConnection() 
	{
	
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankpoject","root","root");
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	
	
	
	
	return con;
}
}