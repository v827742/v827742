package CollectionSet;

import java.util.*;

public class Test {
	
	public static void main(String[] args) {
		
		Set<Employee> sset=new TreeSet<>();
		
		Employee e=new Employee();
		e.setEmid(123);
		e.setEmname("Ashish");
		e.setEmsalary(25000.0);
		
		Employee e2=new Employee();
		e2.setEmid(124);
		e2.setEmname("Pankaj");
		e2.setEmsalary(20000.0);
		
		Employee e3=new Employee();
		e3.setEmid(125);
		e3.setEmname("Ashish");
		e3.setEmsalary(25000.0);
		
		sset.add(e);
		sset.add(e2);
		sset.add(e3);
		
		
		for(Employee ee:sset)
		{
		 System.out.println(ee.getEmid());
		 System.out.println(ee.getEmname());
		 System.out.println(ee.getEmsalary());
		}
		
		
		
	}

}
