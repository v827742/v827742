package CollectionSet;

import java.util.Iterator;
import java.util.Set;

public class University {
	
	public static void main(String[] args) {
		
		College c=new College();
	Set se=c.m1();
	
	Iterator itr=se.iterator();
	while(itr.hasNext())
	{
		Student s=(Student)itr.next();
		System.out.println("student rollno="+s.getRollno());
		System.out.println("Student name="+s.getName());
	}
	}

}
