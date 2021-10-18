package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws SQLException {
	
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
			
	//String sql="create table Student3(rollno int,name varchar(25),address varchar(25),CONSTRAINT PK PRIMARY KEY(rollno))"; 
	   
	   
	String sql="insert into student3 values(200,'ramesh','yavatmal')";
	//String sql1="insert into student values(1,'mahesh','Nagpur')";
	
Statement smt=con.createStatement();
		
		smt.execute(sql);
		//smt.execute(sql1);
		
		//System.out.println("Table create Successfully");
		System.out.println("data inserted Successfully");
		con.close();
		smt.close();
		
		
		
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
