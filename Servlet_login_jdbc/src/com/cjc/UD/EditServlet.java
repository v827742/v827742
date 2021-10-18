package com.cjc.UD;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.cls.DaoUtil;
import com.login.cls.Register;
@WebServlet(urlPatterns="/edit")
public class EditServlet extends HttpServlet{

	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       
		String user=request.getParameter("userid");
		
		System.out.println(user);
		
		Connection con=DaoUtil.getconnection();
		try {
			Statement smt=con.createStatement();
			
			String sql="select * from register where userid='"+user+"'";
			ResultSet rs=smt.executeQuery(sql);
			while(rs.next())
			{
				Register reg=new Register();
				reg.setUserid(rs.getString(1));
				reg.setPass(rs.getString(2));
				reg.setName(rs.getString(3));
				reg.setAddr(rs.getString(4));
				reg.setEmail(rs.getString(5));
				request.setAttribute("data", reg);
				
			}
				} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		RequestDispatcher rd=request.getRequestDispatcher("edit.jsp");
		rd.forward(request, response);
	}
	
}
