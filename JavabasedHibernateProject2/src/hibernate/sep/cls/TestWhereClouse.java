package hibernate.sep.cls;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class TestWhereClouse {
public static void main(String[] args) {
	Session s=HibernateUtil.getsessionfactory().openSession();
	
	Query<Student> query=s.createQuery("from Student where rollno=:rno",Student.class);
	
	query.setParameter("rno", 3);
	
	List<Student> list=query.getResultList();
	for(Student stu: list)
	{
		System.out.println(stu.getRollno());
		System.out.println(stu.getName());
		System.out.println(stu.getAddr());
	}
}
}
