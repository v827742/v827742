package static_and_non_static;

public class Employee {
	
	int id;
	String name;
	static String Cname="TCS";
	
	Employee(int i,String nm)
	{
		id=i;
		name=nm;
		
	}
	void display()
	{
		System.out.println(id+" "+name+" "+Cname);
	}
	
}

	


