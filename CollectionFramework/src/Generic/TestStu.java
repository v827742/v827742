package Generic;

import java.util.*;



public class TestStu {

	public static void main(String[] args) {
		Set<Student> s= new TreeSet<>();
		
		Student s1=new Student();
		s1.setRollno(2);
		s1.setName("Ashish");
		
		Student s2=new Student();
		s2.setRollno(1);
        s2.setName("Rakesh");
        
        Student s3=new Student();
		s3.setRollno(3);
        s3.setName("prakash");
        
        s.add(s1);
        s.add(s2);
        s.add(s3);
        
		for(Student stu:s)
		{
			System.out.println("Student roll no="+stu.getRollno());
			System.out.println("Student roll no="+stu.getName());
		}
		
	}
}
