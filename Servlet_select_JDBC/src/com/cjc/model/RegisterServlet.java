package com.cjc.model;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class RegisterServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	Connection con=DaoUtil.getconnection();
	List<Register> list=new ArrayList<Register>();
	
	try {
	
 
	
		Statement ps = con.createStatement();
		String sql="select * from register";
	    
		ResultSet rs=ps.executeQuery(sql);
		while(rs.next())
		{
			Register rtr=new Register();
			
			rtr.setUserid(rs.getString(1));
			rtr.setPass(rs.getString(2));
			rtr.setName(rs.getString(3));
			rtr.setAddr(rs.getString(4));
			rtr.setEmail(rs.getString(5));
			
			list.add(rtr);
			
			request.setAttribute("data", list);
			
	
			}
		ps.close();
		con.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
	rd.forward(request, response);

		
	}

}
