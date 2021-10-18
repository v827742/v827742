package hibernate_hql_query;

import org.hibernate.Session;

public class Test {
public static void main(String[] args) {
	
	Session s=HibernateUtil.getsessionfactory().openSession();
	Student stu=new Student();
	stu.setRollno(3);
	stu.setName("Sunil");
	stu.setAddr("mumbai");
	
	s.save(stu);
	s.beginTransaction().commit();
	
	
	
	
	
}
}
