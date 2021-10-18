package com.wcs.webapp.controller;

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



import com.sun.org.apache.bcel.internal.classfile.EnclosingMethod;
import com.wcs.webapp.model.Employee;
import com.wcs.webapp.serviceImpl.ServiceImpl;
@WebServlet(urlPatterns="/update")
public class UpdateServlet extends HttpServlet{

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        
		String uid = request.getParameter("userid");
		String pass = request.getParameter("pass");
		String name = request.getParameter("name");
		String addr = request.getParameter("Addr");
		String email = request.getParameter("email");
		System.out.println(addr);
		System.out.println(email);
		
	
        
		  
	    	Employee em=new Employee();
				em.setUserid(uid);
				em.setPass(pass);
				em.setName(name);
				em.setAddr(addr);
				em.setEmail(email);
			
				ServiceImpl si=new ServiceImpl();
				Employee emp=si.updateEmployee(em);
				
				List<Employee> list=si.getAllEmployee();
			
				
			request.setAttribute("data", list);
	
		RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
		rd.forward(request, response);

	}
	
	
}
