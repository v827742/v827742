package com.cjc.jdbc_conn;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/reg")
public class RegisterServlet extends  HttpServlet{
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		
		String uid=request.getParameter("uid");
		String pass=request.getParameter("pass");
		String name=request.getParameter("name");
		String addr=request.getParameter("adr");
		String email=request.getParameter("email");
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcservlet","root","root");
		
	
	
	String sql="insert into register values(?,?,?,?,?)";	
	
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, uid);
			ps.setString(2, pass);
			ps.setString(3, name);
			ps.setString(4, addr);
			ps.setString(5, email);
			
			ps.executeUpdate();
			
			con.close();
			ps.close();
			

			
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd=request.getRequestDispatcher("success.html");
		rd.forward(request, response);
		
	}
	
	

	

}
