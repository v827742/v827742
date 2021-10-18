package get_method;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cjc.Daoutil.DaoUtil;
@WebServlet(urlPatterns="/reg")
public class ServletReg extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		String uname=request.getParameter("uid");
		String pass=request.getParameter("pass");
		String name=request.getParameter("name");
		String addr=request.getParameter("adr");
		String email=request.getParameter("email");
		
		
		Connection con=DaoUtil.getconnection();
		String query="insert into student values(?,?,?,?,?)";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(query);
		
		ps.setString(1,  uname);
		ps.setString(2,  pass);
		ps.setString(3,  name);
		ps.setString(4,  addr);
		ps.setString(5,  email);
		
		ps.executeUpdate();
		
		ps.close();
		con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher rd=request.getRequestDispatcher("rsuccess.jsp");
		rd.forward(request, response);
	

}
}