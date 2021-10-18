package com.wcs.webapp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wcs.webapp.model.Employee;
import com.wcs.webapp.serviceImpl.ServiceImpl;
@WebServlet(urlPatterns="/log")
public class LoginServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws 
	ServletException, IOException {
		
		
		String uname=request.getParameter("user");
		String pass=request.getParameter("pass");
		
		ServiceImpl si=new ServiceImpl();
		List<Employee> emp=si.loginEmployee(uname, pass);
		
		request.setAttribute("data", emp);
		RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
		rd.forward(request, response);
		
		
	}
	
}
