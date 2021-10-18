package hibernate.sep.cls;

import org.hibernate.Session;

public class TestGet {
	public static void main(String[] args) {
		Session s=HibernateUtil.getsessionfactory().openSession();
		
		Student stu=s.get(Student.class, 1);
		System.out.println(stu.getRollno());
		System.out.println(stu.getName());
		System.out.println(stu.getAddr());
		
	}

}
