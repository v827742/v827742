package com.wcs.webapp.controller;



import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wcs.webapp.model.Employee;
import com.wcs.webapp.serviceImpl.ServiceImpl;
@WebServlet(urlPatterns="/edit")
public class EditServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String user=request.getParameter("userid");
	
	System.out.println(user);
	
	ServiceImpl si=new ServiceImpl();
			Employee emp=si.editEmployee(user);
	
		request.setAttribute("data", emp);
	RequestDispatcher rd=request.getRequestDispatcher("edit.jsp");
	rd.forward(request, response);
}
}
