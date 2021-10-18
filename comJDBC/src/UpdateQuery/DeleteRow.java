package UpdateQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRow {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankpoject","root","root");
		
		Statement smt=con.createStatement();
		
		String dlt="delete from accountno where AccountNo=4294967295";
		
		smt.execute(dlt);
		
		con.close();
		smt.close();
	
	
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
