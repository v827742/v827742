package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestUpdt {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");	
			
  String s="update student set  address=? where idStudent=?";
  
         PreparedStatement ps=con.prepareStatement(s);
         ps.setInt(2, 3);
         ps.setString(1, "Surat");
        
        
         
       int i=ps.executeUpdate();
        System.out.println(i+"records updated");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
