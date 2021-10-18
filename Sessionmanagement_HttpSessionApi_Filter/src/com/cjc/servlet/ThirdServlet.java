package com.cjc.servlet;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/third.do")
public class ThirdServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tdata=request.getParameter("t3");
		System.out.println("third--servlet");
		
		request.setAttribute("td", tdata);
		RequestDispatcher rd=request.getRequestDispatcher("display.jsp");
		rd.forward(request, response);
	}
	
	
}
