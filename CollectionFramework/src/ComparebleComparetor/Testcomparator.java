package ComparebleComparetor;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Testcomparator {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Set<Student> sset1=null;
		System.out.println("----select---\n"+
		                      "1.roll no Sort\n"+
				               "2. name sort\n");
		
		
		int ch=sc.nextInt();
		if(ch==1)
		{
			sset1=new TreeSet<>(new RollnoSort());
			
		}
		else
			if(ch==2)
			{
				sset1=new  TreeSet<>(new NameSort());
			}
		
		Student s1=new Student();
		s1.setRollno(2);
		s1.setName("ccc");
		
		Student s2=new Student();
		s2.setRollno(1);
		s2.setName("bbb");
		
		Student s3=new Student();
		s3.setRollno(3);
		s3.setName("aaa");
		
	
		sset1.add(s1);
		sset1.add(s2);
		sset1.add(s3);
		
		
				for(Student stu:sset1)
				{
					System.out.println(stu.getRollno());
					System.out.println(stu.getName());
				}
			
		
		
		
		
		}
		
		
		
	}


