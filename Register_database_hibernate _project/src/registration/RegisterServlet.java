package registration;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import Register.Register;
import hibernateUtil.HibernateUti;



@WebServlet(urlPatterns="/reg")
public class RegisterServlet extends HttpServlet{
	

	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		String userId = request.getParameter("uid");
        String password = request.getParameter("pass");
        String name = request.getParameter("name");
        String address = request.getParameter("adr");
        String email = request.getParameter("email");
 
        Register rtr=new Register();
        rtr.setUserId(userId);
        rtr.setPassword(password);
        rtr.setName(name);
        rtr.setAddress(address);
        rtr.setEmail(email);
        
        Session s=HibernateUti.getsessionFactory().openSession();
        
        s.save(rtr);
        s.beginTransaction().commit();
        
        RequestDispatcher rd=request.getRequestDispatcher("success.html");
        rd.forward(request, response);
        
		}

}
