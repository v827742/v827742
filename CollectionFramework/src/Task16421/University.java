package Task16421;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class University  {
	public static void main(String[] args) {
		
		College c1=new College();
		 List data=c1.m1();
		
		
		Iterator itr=data.iterator();
		while(itr.hasNext())
		{
			Student s= (Student)itr.next();
			
			System.out.print(s.getRollno());
			System.out.print( s.getName());
		}
	}

}
