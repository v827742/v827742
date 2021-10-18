package UpdateQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeletDynamic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.jdbc.Driver");
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		
		Statement smt=con.createStatement();
		System.out.println("Enter Student id for delete");
		int id=sc.nextInt();
		
		String dlt="delete from student where idStudent="+id+"";
		
		smt.execute(dlt);
		
		con.close();
		smt.close();
	
	
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
		
		
		
	}

}
