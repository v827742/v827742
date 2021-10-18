package ComparebleComparetor;

import java.util.Comparator;
import java.util.Scanner;
import java.util.*;

public class TestEm{
	
	
	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.setEmid(1);
		e.setEmname("Ashish");
		e.setEmsalary(20000.00);
		
		Employee e1=new Employee();
		e1.setEmid(2);
		e1.setEmname("Rakesh");
		e1.setEmsalary(30000.00);
		
		Employee e2=new Employee();
		e2.setEmid(3);
		e2.setEmname("prakash");
		e2.setEmsalary(40000.00);
		
		
		while(true){
				Set<Employee> sset=null;
				Scanner sc=new Scanner(System.in);

		
		System.out.println("----select----\n"+
				            "1) Employee id sort\n"+
				              "2)Employee name sort\n"+
				              "3)Employee salay sort\n");
		
		
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			sset=new TreeSet<>(new EmIdSort());
			break;
		case 2:
			sset=new TreeSet<>(new EmNameSort());
			break;
		case 3:
			sset=new TreeSet<>(new EmSalarySort());
			break;
		default:
				System.out.println("data not found please enter valid input ");
				break;
		}
	
		
		
		
		
		
		sset.add(e);
		sset.add(e1);
		sset.add(e2);
		
		
		Iterator<Employee> itr=sset.iterator();
		
		while(itr.hasNext())
		{
			Employee em=itr.next();
			System.out.println("   ");
			System.out.println("employee id:"+em.getEmid());
			System.out.println("employee name:"+em.getEmname());
			System.out.println("employee salary:"+em.getEmsalary());
			
		}
	}
	}
}
