package com.braindatawire.DaoUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoUtil {

	static Connection con=null;
	public static Connection getconnection()
	{
		
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
	  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crudpro","root","root");
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return con;
	
}
}