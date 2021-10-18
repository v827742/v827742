package hibernate.sep.cls;

import java.util.Scanner;

import org.hibernate.Session;

public class TestDynamic {
	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		Session s=HibernateUtil.getsessionfactory().openSession();
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
		Student stu=new Student();
		stu.setRollno(rno);
		stu.setName(name);
		stu.setAddr(addr);
		
		
		s.save(stu);
		s.beginTransaction().commit();
		}
	}

}
