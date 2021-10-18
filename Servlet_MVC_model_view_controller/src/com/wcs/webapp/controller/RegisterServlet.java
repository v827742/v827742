package com.wcs.webapp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.wcs.webapp.DaoImpl.DaoImpl;
import com.wcs.webapp.model.Employee;
import com.wcs.webapp.serviceImpl.ServiceImpl;
@WebServlet(urlPatterns="/reg")
public class RegisterServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
    @Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String uid=request.getParameter("uid");
		String pass=request.getParameter("pass");
		String name=request.getParameter("name");
		String addr=request.getParameter("adr");
		String email=request.getParameter("email");
		
		Employee emp=new Employee();
		emp.setUserid(uid);
		emp.setPass(pass);
		emp.setName(name);
		emp.setAddr(addr);
		emp.setEmail(email);
		
		ServiceImpl di=new ServiceImpl();
		di.saveEmloyee(emp);
		
		List<Employee> list=di.getAllEmployee();
		request.setAttribute("data", list);
		RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
		rd.forward(request, response);
		}

}
