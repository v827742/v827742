package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of student:-");
	    int n=sc.nextInt();
	    for(int i=0;i<n;i++)
	    {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
		
		//String sql="create table student1(rollno INT(3),name char(100),address char(200))";
		    
		    System.out.println("enter roll no:-");
		    int rno=sc.nextInt();
		    System.out.println("enter name:-");
		    String name=sc.next();
		    System.out.println("enter address:-");
		    String addr=sc.next();
		    
		    
		    String sql="insert into student1 values("+rno+",'"+name+"','"+addr+"')";
		    
		Statement smt=con.createStatement();
		
		smt.execute(sql);
		    
		con.close();
		smt.close();
		
		
		    
		    }
		
		}

}
