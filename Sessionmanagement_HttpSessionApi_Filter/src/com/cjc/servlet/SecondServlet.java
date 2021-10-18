package com.cjc.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(urlPatterns="/second.do")
public class SecondServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("second----servlet");
		String sdata=request.getParameter("t2");
		
		HttpSession session=request.getSession(false);
		
		session.setAttribute("sd", sdata);
		RequestDispatcher rd=request.getRequestDispatcher("third.jsp");
		rd.forward(request, response);
		
	}

}
