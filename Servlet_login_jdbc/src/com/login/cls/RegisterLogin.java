package com.login.cls;

import java.io.IOException;
import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns="/log")
public class RegisterLogin extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con=DaoUtil.getconnection();
		List<Register> list=new ArrayList<>();
		
		String uname=request.getParameter("user");
		String pass=request.getParameter("pass");
		
		if(uname.equals("admin") && pass.equals("admin"))
		{
			
			try {
				Statement ps=con.createStatement();
				
				String sql="select * from register";
				
				ResultSet rs=ps.executeQuery(sql);
				
				while(rs.next())
				{
					
					Register rg=new Register();
					
					rg.setUserid(rs.getString(1));
					
					rg.setPass(rs.getString(2));
					
					rg.setName(rs.getString(3));
					
					rg.setAddr(rs.getString(4));
					
					rg.setEmail(rs.getString(5));
					
					list.add(rg);
					
					
				}
				request.setAttribute("data", list);
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
			rd.forward(request, response);
			
			
		}
		
		else {
			
		
		try{
			Statement ps=con.createStatement();
			
			String query="select * from register where userid='"+uname+"'&& password='"+pass+"' ";
			
			ResultSet rs=ps.executeQuery(query);
			while(rs.next())
			{
				
				Register rg=new Register();
				rg.setUserid(rs.getString(1));
				rg.setPass(rs.getString(2));
				rg.setName(rs.getString(3));
				rg.setAddr(rs.getString(4));
				rg.setEmail(rs.getString(5));
				list.add(rg);
				
				
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

}
