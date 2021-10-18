package hibernate.sep.cls;

import org.hibernate.Session;

public class TestUpdt {
public static void main(String[] args) {
	Session s=HibernateUtil.getsessionfactory().openSession();
	
	
	Student stu=s.get(Student.class, 1);
	
	stu.setName("Pravin");
	stu.setAddr("Nagpur");
	s.beginTransaction();
	s.update(stu);
	
	s.getTransaction().commit();
}
}
