package manyTomany.cfbs;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.hibernate.Session;

public class TestCFBS {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Session s=HibernateUtil.getSessionFactory().openSession();
		System.out.println("Enter Student ID for Display data");
		int sid=sc.nextInt();
		Student stu=s.get(Student.class, sid);
		System.out.println("Student ID: "+stu.getSid());
		System.out.println("Student NAme: "+stu.getSname());
		
		Set<Batch> b=stu.getBatch();
		Iterator<Batch> itr=b.iterator();
		while(itr.hasNext())
		{
			Batch btc=itr.next();
		
		System.out.println("Batch ID: "+btc.getBid());
		System.out.println("Batch Name: "+btc.getBnamd());
	
		Set<Faculty> f=btc.getFlt();
		Iterator<Faculty> itr1=f.iterator();
		while(itr1.hasNext())
		{
			Faculty ft=itr1.next();
			System.out.println("Faculty ID: "+ft.getFid());
			System.out.println("Faculty Name: "+ft.getFname());
			
			Set<Course> crs=ft.getScrs();
			Iterator<Course> itr2=crs.iterator();
			while(itr2.hasNext())
			{
				Course c=itr2.next();
				System.out.println("Course Id: "+c.getCid());
				System.out.println("Course Name: "+c.getCname());
			}
		
}
		}
		sc.close();
	}
}
