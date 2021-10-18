package com.cjc.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
@WebFilter(urlPatterns="*.do")
public class MyFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain fc)
			throws IOException, ServletException {
		
		HttpServletRequest hrRequest=(HttpServletRequest)request;
		
		HttpSession session=hrRequest.getSession(false);
		if(session==null)
		{
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.forward(hrRequest, response);
		}
		else{
			fc.doFilter(hrRequest, response);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
