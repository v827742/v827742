package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TcsEmp {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NO OF EMPLOYEE INTO THE TABLE");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		Class.forName("com.mysql.jdbc.Driver");
		
		
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test1","root","root");
     
System.out.println("ENTER EMPLOYEE ID:");
int emid=sc.nextInt();

System.out.println("ENTER EMPLOYEE NAME:");
String ename=sc.next();

System.out.println("ENTER EMPLOYEE DESIGNATION:");
String edesg=sc.next();

System.out.println("ENTER SALARY OF EMPLOYEE");
double esalary=sc.nextDouble();


System.out.println("ENTER EMPLOYEE ADDRESS:");
String eaddr=sc.next();


    
//String s="create table Employee(empid int,name varchar(50),designation varchar(100),esalary Double, emp_address varchar(100),CONSTRAINT P PRIMARY KEY(empid))";
String s="insert into employee values("+emid+", '"+ename+"','"+edesg+"',"+esalary+",'"+eaddr+"')";
System.out.println(s);
Statement smt=con.createStatement();

	smt.execute(s);
	
	con.close();
	smt.close();
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
