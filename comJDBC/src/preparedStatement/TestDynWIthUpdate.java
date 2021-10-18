package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;



public class TestDynWIthUpdate {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			System.out.println("Enter Student Id");
			int no=s.nextInt();
			System.out.println("Enter Name for update");
			String name=s.next();
			System.out.println("Enter Address for update");
			String addr=s.next();
			
			String sql="update student set name=?,address=? where idStudent=? ";
			
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setString(1,name);
			ps.setString(2,addr);
			ps.setInt(3, no);
			
			ps.executeUpdate();
			System.out.println("update Successfully");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
