package many_to_man_bidirectional;

import org.hibernate.Session;

import many_to_man_bidirectional.Course;

public class Test {
public static void main(String[] args) {
	Course c1=new Course();
	c1.setCid(101);
	c1.setName("Java");
	
	Course c2=new Course();
	c2.setCid(102);
	c2.setName("Python");
	
	Student stu=new Student();
	stu.setRollno(1);
	stu.setSname("Rakesh");
	stu.setAddr("karvenagar");
	
	
	Student stu1=new Student();
	stu1.setRollno(2);
	stu1.setSname("Suraj");
	stu1.setAddr("Chandrapur");
	
	
	
	stu.getScourse().add(c1);
	stu.getScourse().add(c2);
	stu1.getScourse().add(c1);
	stu1.getScourse().add(c2);
	
	c1.getStud().add(stu);
	c1.getStud().add(stu1);
	c2.getStud().add(stu);
	c2.getStud().add(stu1);
	
	Session sess=HibernateUtil.getsessionFactory().openSession();
	
	sess.save(stu);
	sess.save(stu1);
	sess.save(c1);
	sess.save(c2);
	
	sess.beginTransaction().commit();
	
}
}
