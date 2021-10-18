package Collection;

import java.util.Scanner;
import java.util.*;
public class TestStu1 {

	public static void main(String args[])
	{

	Scanner sc=new Scanner(System.in);
	System.out.println("enter rollno for 1st student");
	int a=sc.nextInt();

	System.out.println("enter name for 1st student");
	String b=sc.next();

	System.out.println("enter Address for 1st student");
	String c=sc.next();


	Student1 s=new Student1();
	s.setRollno(a);
	s.setName(b);
	s.setAddr(c);
	
	System.out.println("enter rollno for 2st student");
	int a1=sc.nextInt();

	System.out.println("enter name for 2st student");
	String b1=sc.next();

	System.out.println("enter Address for 2st student");
	String c1=sc.next();
	
	Student1 s1=new Student1();
	s1.setRollno(a1);
	s1.setName(b1);
	s1.setAddr(c1);
	
	System.out.println("enter rollno for 3st student");
	int a2=sc.nextInt();

	System.out.println("enter name for 3st student");
	String b2=sc.next();

	System.out.println("enter Address for 3st student");
	String c2=sc.next();
	
	Student1 s2=new Student1();
	s2.setRollno(a2);
	s2.setName(b2);
	s2.setAddr(c2);
	


	List l=new ArrayList();
	l.add(s);
	l.add(s1);
	l.add(s2);
	
	
	Iterator itr=l.iterator();
	System.out.println("*****retrieve element*****"
			+ "");
	while(itr.hasNext())
	{
		Student1 ss=(Student1)itr.next();
		System.out.println(ss.getRollno());
	 System.out.println(ss.getName());
	 System.out.println(ss.getAddr());
		
	}

	}
}
