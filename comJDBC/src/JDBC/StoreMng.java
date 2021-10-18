package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StoreMng {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test1","root","root");

//String s="create table autostore(PART_NO int,PART_NAME varchar(100),RATE double,AVILABLE_PART int)";
System.out.println("ENTER NO OF PARTS ADD INTO THE STORE TABLE");
int n=sc.nextInt();
for(int i=0;i<=n;i++)
{
	System.out.println("ENTER PART NO:");
	int pno=sc.nextInt();
	System.out.println("ENTER PART NAME:");
	String pname=sc.next();
	System.out.println("ENTER PART RATE:");
	double rate=sc.nextDouble();
	System.out.println("Enter availabele parts");
	int avbl=sc.nextInt();
	
	

String s="insert into autostore values("+pno+",'"+pname+"',"+rate+","+avbl+")";
System.out.println(s);
Statement smt=con.createStatement();

	smt.execute(s);
	smt.close();
}
	con.close();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
