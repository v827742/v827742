package registration;

import java.io.IOException;

import javax.persistence.Entity;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Entity
@WebServlet(urlPatterns="/reg")
public class RegisterServlet extends HttpServlet{
	
	
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userid=request.getParameter("uid");
		String pass=request.getParameter("pass");

		String name=request.getParameter("name");
		String addr=request.getParameter("adr");
		
		String email=request.getParameter("email");
		System.out.println(userid);
		System.out.println(pass);
		System.out.println(name);
		System.out.println(addr);
		System.out.println(email);
		
		
		
		RequestDispatcher rd=request.getRequestDispatcher("success.html");
		
		rd.forward(request, response);
		
		
		
	}

}
