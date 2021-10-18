
package Task16421;

import java.util.*;
import java.util.Scanner;

public class TestStudent {
	
	public void m1() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of student you want ");
		int x=sc.nextInt();
		System.out.println("you have select="+x);
		List Stu=new ArrayList();
		for(int i=0;i<x;i++)
		{
			Student1 s=new Student1();
			System.out.println("enter University="+i);
			String s2=sc.next();
			System.out.println("enter Student College="+i);
			String s1=sc.next();
			
			System.out.println("enter Student Id="+i);
			int x1=sc.nextInt();
			s.setRollno(x1);
			
			System.out.println("enter Student Name="+i);
			String x2=sc.next();
			s.setName(x2);
			
			System.out.println("enter Student Address="+i);
			String x3=sc.next();
			s.setAddr(x3);
			
			Stu.add(s);
			
			
			List College=new ArrayList();
			College.add(Stu);
			
			List SGBAU=new ArrayList();
			SGBAU.add(College);
			
			
			Iterator itr=SGBAU.iterator();
			
			while(itr.hasNext())
			{
				List l=(List)itr.next();
				
				Iterator itr1=l.iterator();
				while(itr1.hasNext())
				{
					List l1=(List)itr1.next();
					
					Iterator itr2=l1.iterator();
					while(itr2.hasNext())
					{
					Student1 ss=(Student1)itr2.next();
					
					
					
					
					System.out.println(ss.getRollno());
					System.out.println(ss.getName());
					System.out.println(ss.getAddr());
                     System.out.println(s2);
					
					System.out.println(s1);
					
				}
			}
			}
		}
		
		
	}
	public static void main(String[] args) {
		
		TestStudent t=new TestStudent();
		t.m1();
		
	}

}
