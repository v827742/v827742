package com.cjc.model;

import java.io.IOException;
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
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Student> l=new ArrayList<Student>();
		System.out.println("hello.....");
		Student stu1=new Student();
		stu1.setRollno(1);
		stu1.setName("Ashish");
		stu1.setAddr("Pune");
		
		Student stu2=new Student();
		stu2.setRollno(1);
		stu2.setName("Ashish");
		stu2.setAddr("Pune");
		
		l.add(stu1);
		l.add(stu2);
		
		request.setAttribute("data", l);
		
		RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
		rd.forward(request, response);
	}
}
