package com.jdbc.trywithresources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TryCatchFinaly {
	
	public static void main(String[] args) {
		
		Connection con=null;
		Statement smt=null;
		ResultSet rs=null;
			try{
			Class.forName("com.mysql.jdbc.Driver");
			
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			
			String sql="select * from student";
			
			 smt=con.createStatement();
			
			 rs=smt.executeQuery(sql);
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
			}
	
			
			}
			catch(ClassNotFoundException  | SQLException e)
			{
				System.out.println(e.getMessage());
			}
			finally
			{
				if(rs!=null)
				{
					try{
						rs.close();
					}
					catch(SQLException e)
					{
						System.out.println(e.getMessage());
					}
				}
				if(con!=null)
				{
					try{
						con.close();
					}
					catch(SQLException e)
					{
						System.out.println(e.getMessage());
					}
				}
				if(smt!=null)
				{
					try{
						smt.close();
					}
					catch(SQLException e)
					{
						System.out.println(e.getMessage());
					}
				}
			}
			
			

			
			
		
	}

}
