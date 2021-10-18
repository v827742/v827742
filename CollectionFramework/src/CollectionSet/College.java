package CollectionSet;

import java.util.*;

public class College {
public  Set  m1()
{
	Set fe=new HashSet();
	Student stu=new Student();
	stu.setRollno(2);
	stu.setName("Ashish");
	
	Student stu2=new Student();
	stu2.setRollno(12);
	stu2.setName("Shubham");
	
	
	Student stu1=new Student();
	stu1.setRollno(1);
	stu1.setName("Shivraj");
	
	
	
	fe.add(stu);
	fe.add(stu1);
	fe.add(stu2);
	
	return fe;
	
}
}
