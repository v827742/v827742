package post;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cjc.Daoutil.DaoUtil;

import get_method.Student;
@WebServlet(urlPatterns="/log")
public class ServletLog extends HttpServlet{
	
	
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		String uname=request.getParameter("user");
		String pass=request.getParameter("pass");
		Connection con=DaoUtil.getconnection();
		List<Student> list=new ArrayList<Student>();
		
		String sql="select * from student where userid='"+uname+"' && password='"+pass+"'";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					Student stu=new Student();
					stu.setUserid(rs.getString(1));
				    stu.setPass(rs.getString(2));
				    stu.setName(rs.getString(3));
				    stu.setAddr(rs.getString(4));
                    stu.setEmail(rs.getString(5));
                    
                    list.add(stu);
						
				}
				request.setAttribute("data", list);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
		rd.forward(request, response);
	}

}
