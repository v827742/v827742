package Task16421;
import java.util.*;
public class Details {
	
	public List setdetails()
	{
		
		List l=new ArrayList();
		
		Employee e=new Employee();
		
	     e.setEmpid(1);
	     e.setEmpname("Ashish");
	     e.setEmpdesig("Quality Engineer");
	     e.setEmpsalary(25000.00);
	     
	     l.add(e);
		
		return l;
	}


	public  void getdetails()
	{
		Details d =new Details();
		List e2=setdetails();
		
		Iterator itr=e2.iterator();
		
		while(itr.hasNext())
		{
			Employee e1=(Employee)itr.next();
			System.out.println(e1.getEmpid());
			System.out.println(e1.getEmpname());
			System.out.println(e1.getEmpdesig());
			System.out.println(e1.getEmpsalary());
			

		}
	
		
	}
}
