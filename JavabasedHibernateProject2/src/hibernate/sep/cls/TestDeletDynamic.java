package hibernate.sep.cls;

import java.util.Scanner;

import org.hibernate.Session;

public class TestDeletDynamic {
public static void main(String[] args) {
	

	Session s=HibernateUtil.getsessionfactory().openSession();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Student Rollno you want to delete from table:");
	int no=sc.nextInt();
	
	Student stu=s.get(Student.class, no);
	s.beginTransaction();
	s.delete(stu);
	s.getTransaction().commit();
}
}