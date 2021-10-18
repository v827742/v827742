package hibernate.relation.bidir.cfbs;

import org.hibernate.Session;

public class TestFetch {
	public static void main(String[] args) {
		
	
	Session s=HibernateUtil.getsessionFactory().openSession();
	 
	Student c=s.get(Student.class, 123);
	System.out.println("Student Id: "+c.getSid());
	System.out.println("Student Name: "+c.getSname());
	System.out.println("Batch Id: "+c.getBatch().getBid());
	System.out.println("Batch Name: "+c.getBatch().getBname());
	System.out.println("Faculty ID: "+c.getBatch().getFaculty().getFid());
	System.out.println("Faculty Name: "+c.getBatch().getFaculty().getFname());
	System.out.println("Course ID: "+c.getBatch().getFaculty().getCrs().getCid());
	System.out.println("Course Name: "+c.getBatch().getFaculty().getCrs().getCname());
	
}
}