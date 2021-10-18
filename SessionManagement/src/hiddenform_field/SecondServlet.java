package hiddenform_field;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/second")
public class SecondServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String fdata=request.getParameter("t2");
		
		System.out.println(fdata);
		RequestDispatcher rd=request.getRequestDispatcher("third.jsp");
		rd.forward(request, response);
	
	}
}
