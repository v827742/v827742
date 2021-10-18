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
@WebServlet(urlPatterns="/delete")
public class DeleteServlet extends HttpServlet{

	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
		String userid=request.getParameter("userid");
	    System.out.println(userid);
	   
	    ServiceImpl si=new ServiceImpl();
	    si.deleteEmployee(userid);
	    List<Employee> list=si.getAllEmployee();
	    
	    request.setAttribute("data", list);
	    RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
		rd.forward(request, response);

	}
}
