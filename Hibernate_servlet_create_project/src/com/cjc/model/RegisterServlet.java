package com.cjc.model;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.cjc.client.Student;
import com.cjc.hibernateutil.HibernateUtil;

@WebServlet(urlPatterns="/reg")
public class RegisterServlet extends HttpServlet {


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		String userid=req.getParameter("uid");
		String pass=req.getParameter("pass");
		String name=req.getParameter("name");
		String addr=req.getParameter("adr");
		String email=req.getParameter("email");
		
		Student stu=new Student();
		stu.setUserid(userid);
		stu.setPass(pass);
		stu.setName(name);
		stu.setAddr(addr);
		stu.setEmail(email);
		
		Session s=HibernateUtil.getsessionFactory().openSession();
		
		s.save(stu);
		s.beginTransaction().commit();
		
		
		RequestDispatcher rd=req.getRequestDispatcher("success.html");
		rd.forward(req, resp);
		
		
	}

}
