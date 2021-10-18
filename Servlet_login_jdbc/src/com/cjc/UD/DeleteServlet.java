package com.cjc.UD;

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

import com.login.cls.DaoUtil;
import com.login.cls.Register;

@WebServlet(urlPatterns="/delete")
public class DeleteServlet extends HttpServlet{
	
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String userid=request.getParameter("userid");
	    System.out.println(userid);
	    
	    Connection con=DaoUtil.getconnection();
	    String sql="delete from register where userid='"+userid+"'";
	    try {
			Statement smt=con.createStatement();
			
			smt.execute(sql);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    List<Register> list=new ArrayList<Register>();
		  
	    String sql1="select * from register";
	    try {
			Statement smt1=con.createStatement();
			ResultSet rs=smt1.executeQuery(sql1);
			while(rs.next())
			{
				Register r=new Register();
				r.setUserid(rs.getString(1));
				r.setPass(rs.getString(2));
				r.setName(rs.getString(3));
				r.setAddr(rs.getString(4));
				r.setEmail(rs.getString(5));
				list.add(r);
				}
			
			request.setAttribute("data", list);
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
		rd.forward(request, response);

	}

}
