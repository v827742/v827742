package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TcsGetDet {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Class.forName("com.mysql.jdbc.Driver");
		
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test1","root","root");


String s="select * from employee";

Statement stm=con.createStatement();

ResultSet rs=stm.executeQuery(s);

while(rs.next())
{
	System.out.println(rs.getInt(1));
	System.out.println(rs.getString(2));
	System.out.println(rs.getString(3));
	System.out.println(rs.getDouble(4));
	System.out.println(rs.getString(5));
}

	}

}
