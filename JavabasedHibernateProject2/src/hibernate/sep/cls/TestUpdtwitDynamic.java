package hibernate.sep.cls;

import java.util.Scanner;

import org.hibernate.Session;

public class TestUpdtwitDynamic {
	public static void main(String[] args) {
		
	
	
	Session s=HibernateUtil.getsessionfactory().openSession();
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no of Student details:");
	int no=sc.nextInt();
	for(int i=1;i<=no;i++)
	{
	System.out.println("Enter Your Rollno:");
	int rno=sc.nextInt();
	System.out.println("Enter your Name:");
	String name=sc.next();
	System.out.println("Enter your Address:");
	String addr=sc.next();
	
	Student stu=s.get(Student.class, rno);
	
	stu.setName(name);
	stu.setAddr(addr);
	
	s.update(stu);
	s.beginTransaction().commit();
	
	}
	}
}
