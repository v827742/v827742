package manyTomany;

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
	
	stu.getScourse().add(c1);
	stu.getScourse().add(c2);
	
	Session sess=HibernateUtil.getsessionFactory().openSession();
	
	sess.save(stu);
	sess.beginTransaction().commit();
	
}
}
