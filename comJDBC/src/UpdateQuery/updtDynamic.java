package UpdateQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class updtDynamic {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		try{
			
			
			Class.forName("com.mysql.jdbc.Driver");
			
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			
			Statement smt=con.createStatement();
			System.out.println("Enter new name:");
			String name=sc.next();
			System.out.println("Enter new Address:");
			String addr=sc.next();
			
			String updt="update student set name='"+name+"',address='"+addr+"' where idStudent=102";
			System.out.println(updt);
			smt.execute(updt);
			
			con.close();
			smt.close();
			}
			catch(ClassNotFoundException |SQLException e)
			{
				System.out.println(e.getMessage());
			}
			
		}

	}


