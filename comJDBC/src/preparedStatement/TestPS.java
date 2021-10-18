package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TestPS {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
	System.out.println("Enter no of Student details");
	int no=sc.nextInt();
	for(int i=0;i<=no;i++)
	{
			System.out.println("Enter Student ID:");
			int sno=sc.nextInt();
			System.out.println("Enter Student Name:");
			String sname=sc.next();
			System.out.println("Enter Student Address:");
			String addr=sc.next();
		String s="insert into student values(?,?,?)";
		
		PreparedStatement ps=con.prepareStatement(s);
		System.out.println(ps);
		ps.setInt(1, sno);
		ps.setString(2, sname);
		ps.setString(3, addr);
		
		ps.execute();
			
	}		
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
