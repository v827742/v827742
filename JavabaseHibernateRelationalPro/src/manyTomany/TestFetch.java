package manyTomany;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;

import many_to_man_bidirectional.Course;

public class TestFetch {
	public static void main(String[] args) {
		
	
	Session s=HibernateUtil.getsessionFactory().openSession();
	
	Student stu=s.get(Student.class, 1);
	System.out.println(stu.getRollno());
    System.out.println(stu.getSname());
    System.out.println(stu.getAddr());
    Set<Course> crs=stu.getScourse();
    Iterator<Course> itr=crs.iterator();
    while(itr.hasNext())
    {
    	Course c=itr.next();
    	System.out.println(c.getCid());
    	System.out.println(c.getName());
    }
	}
}
