package Collection;

import java.util.*;

public class TestStu {
	public static void main(String[] args) {
		
	
	Student s1=new Student();
	 s1.setRollno(1);
	s1.setName("Ashish");
	
	Student s2=new Student();
	
	s2.setRollno(2);
	s2.setName("Rakesh");
	
Student s3=new Student();
	
	s3.setRollno(3);
	s3.setName("The Rock");
	
	
	
	
	List liststu=new ArrayList();
	liststu.add(s1);
	liststu.add(s2);
	liststu.add(s3);
	
	Iterator itr=liststu.iterator();
	
	while(itr.hasNext())
	{
		Student stu=(Student)itr.next();
	
				System.out.println(stu.getRollno());
			
			
		System.out.println(stu.getName());
		
	
		
	}
	


}
}