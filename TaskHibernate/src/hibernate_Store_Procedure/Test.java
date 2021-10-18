package hibernate_Store_Procedure;

import org.hibernate.Session;

public class Test {
public static void main(String[] args) {
	Session s=HibernateUtil.getsessionFactory().openSession();
	
	Student stu=new Student();
	stu.setName("shivraj");
	stu.setAddr("akurdi");
	
	Phone p1=new Phone();
	p1.setPhoneno("8789658589");
	p1.setStudent(stu);
	
	Phone p2=new Phone();
	p2.setPhoneno("8852145698");
	p2.setStudent(stu);
	
	Phone p3=new Phone();
	p3.setPhoneno("8652145698");
	p3.setStudent(stu);
	
	Phone p4=new Phone();
	p4.setPhoneno("8752145698");
	p4.setStudent(stu);
	
	stu.getSphone().add(p1);
	stu.getSphone().add(p2);
	stu.getSphone().add(p3);
	stu.getSphone().add(p4);
	
	s.save(stu);
	s.beginTransaction().commit();
}
}
