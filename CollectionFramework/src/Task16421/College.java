package Task16421;
import java.util.*;
import java.util.*;
public class College {
	public List m1()
	{
	
		Scanner sc=new Scanner(System.in);
		List l=new ArrayList();
		System.out.println("enter 1st Student rollno:");
		int x=sc.nextInt();
		
		System.out.println("enter 1st Student name:");
		String x1=sc.next();
		
		System.out.println("enter 2nd Student rollno:");
		int x2=sc.nextInt();
		
		
		
		System.out.println("enter 2nd Student name:");
		String x3=sc.next();
		
		
		Student s=new Student();
		s.setRollno(x);
		s.setName(x1);
		
		
		Student s1=new Student();
		s1.setRollno(x2);
		s1.setName(x3);
		
		l.add(s);
		l.add(s1);
		
		
		
		
		return l;
		
		
	}

}
