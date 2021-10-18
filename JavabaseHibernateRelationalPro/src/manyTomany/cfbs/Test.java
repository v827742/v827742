package manyTomany.cfbs;

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		
		Course c=new Course();
		c.setCid(101);
		c.setCname("Java");
		
		Course c1=new Course();
		c1.setCid(102);
		c1.setCname("Python");
		
		Faculty f=new Faculty();
		f.setFid(1);
		f.setFname("Ashish");
		f.getScrs().add(c);
		f.getScrs().add(c1);
		
		Faculty f1=new Faculty();
		f1.setFid(2);
		f1.setFname("Suraj");
		
		Batch b=new Batch();
		b.setBid(132);
		b.setBnamd("Core java");
		Batch b1=new Batch();
		b1.setBid(133);
		b1.setBnamd("core Python");
		
		b1.getFlt().add(f);
		b.getFlt().add(f1);
		
		Student s=new Student();
		s.setSid(10);
		s.setSname("pankaj");
		Student s1=new Student();
		s1.setSid(11);
		s1.setSname("Jaya");
		
		s.getBatch().add(b);
		s.getBatch().add(b1);
		
		
		Session ss=HibernateUtil.getSessionFactory().openSession();
		ss.save(s);
		ss.save(s1);
		ss.beginTransaction().commit();
		
		
		
		
		
	}

}
