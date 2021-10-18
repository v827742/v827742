package namedQueries;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class TestSelect {
	
	public static void main(String[] args) {
		
		
		Session s=HibernateUtil.getsessionfactory().openSession();
		
		Query<Student> query=s.createNamedQuery("all_Stu");
		
		List<Student> list=query.getResultList();
		
		for(Student stu:list)
		{
			System.out.println(stu.getRollno());
			System.out.println(stu.getName());
			System.out.println(stu.getAddr());
		}
		
		query= s.createNamedQuery("one_Stu");
		query.setParameter("rno", 1);
		Student st=query.getSingleResult();
		
	               
	            System.out.println(st.getRollno());
	            System.out.println(st.getName());
	            System.out.println(st.getAddr());
		
	}

	
	
		
	}


