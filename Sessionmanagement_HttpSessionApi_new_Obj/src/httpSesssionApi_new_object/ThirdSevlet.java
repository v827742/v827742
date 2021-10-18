package httpSesssionApi_new_object;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/third")
public class ThirdSevlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String tdata = request.getParameter("t3");
        System.out.println("third servlet");
		HttpSession session = request.getSession(false);
		if (session == null) {
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);

		} else {
			session.setAttribute("td", tdata);
			System.out.println(session);
			RequestDispatcher rd = request.getRequestDispatcher("Display.jsp");
			rd.forward(request, response);
		}
	}
}
