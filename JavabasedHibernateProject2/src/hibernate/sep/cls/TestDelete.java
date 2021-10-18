package hibernate.sep.cls;

import org.hibernate.Session;

public class TestDelete {
	public static void main(String[] args) {
		
	
	Session s=HibernateUtil.getsessionfactory().openSession();
	
	Student stu=s.get(Student.class, 1);
	
	s.beginTransaction();
	s.delete(stu);
	s.getTransaction().commit();
	}
}
