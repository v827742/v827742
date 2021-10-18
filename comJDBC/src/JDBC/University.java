package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class University {
public static void main(String[] args) throws SQLException {
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test1","root","root");
		
		//String sql="create table college(clgid int,clgname varchar(25), address varchar(25)";
		
		String sql="insert into college values(1269,'MMIT',1111,'PUNE UNIVERSITY','PUNE')";
		
		Statement smt=con.createStatement();
		
		//smt.execute(sql);
		smt.execute(sql);
		/*smt.execute(sql1);
		smt.execute(sql2);
		smt.execute(sql3);
		smt.execute(sql4);
		smt.execute(sql5);
		smt.execute(sql6);
		smt.execute(sql7);*/
		
		System.out.println("data inserted successfully");
		
		con.close();
		smt.close();
		
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
	
}
}
