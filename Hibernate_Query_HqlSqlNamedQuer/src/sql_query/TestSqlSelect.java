package sql_query;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class TestSqlSelect {
	
	public static void main(String[] args) {
		
		Session s=HibernateUtil.getsessionfactory().openSession();
		
		Query<Student> query=s.createNativeQuery("select * from Student",Student.class);
		
		List<Student> list=query.getResultList();
		for(Student stu:list)
		{
			System.out.println(stu.getRollno());
			System.out.println(stu.getName());
			System.out.println(stu.getAddr());
			
		}
		Query query1=s.createNativeQuery("select * from Student where rollno=:rno",Student.class);
		
		query1.setParameter("rno", 4);
		
		Student stu=(Student) query1.getSingleResult();
		
		System.out.println(stu.getRollno());
		System.out.println(stu.getName());
		System.out.println(stu.getAddr());
		
	}

}
