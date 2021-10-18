package set_get_attribute_;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cjc.pojo.Student;

@WebServlet(urlPatterns="/log")
public class LoginServlet extends HttpServlet{
	
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Student stu=new Student();
		stu.setRollno(1);
		stu.setName("ashish");
		stu.setAddr("karvenagar");
		
		Student stu1=new Student();
		stu1.setRollno(2);
		stu1.setName("suraj");
		stu1.setAddr("akurdi");
		
		List<Student> list=new ArrayList<Student>();
		list.add(stu);
		list.add(stu1);
		
		
		request.setAttribute("data" , list);
		RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
		rd.forward(request, response);
		
	}

}
