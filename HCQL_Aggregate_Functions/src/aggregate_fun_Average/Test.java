package aggregate_fun_Average;

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		
	
	Session s=HibernateUtil.getsessionFactory().openSession();
	
	Department dpt=new Department();
	dpt.setDid(10);
	dpt.setDname("IT");
	
	Department dpt1=new Department();
	dpt1.setDid(11);
	dpt1.setDname("Hr");
	
	
	Employee e1=new Employee();
	e1.setEmpid(1);
	e1.setName("Ashish");
	e1.setAddr("Pune");
	e1.setDegignation("Developer");
	e1.setSalary(25000);
	e1.setDept(dpt);
	
	Employee e2=new Employee();
	e2.setEmpid(2);
	e2.setName("Akshay");
	e2.setAddr("nagpur");
	e2.setDegignation("developer");
	e2.setSalary(30000);
	e2.setDept(dpt);
	
	Employee e3=new Employee();
	e3.setEmpid(3);
	e3.setName("Swapnil");
	e3.setAddr("pune");
	e3.setDegignation("generalist");
	e3.setSalary(50000);
	e3.setDept(dpt1);
	
	Employee e4=new Employee();
	e4.setEmpid(4);
	e4.setName("Rakesh");
	e4.setAddr("nashik");
	e4.setDegignation(" senier Generalist");
	e4.setSalary(70000);
	e4.setDept(dpt1);
	
	
	
	
	
	dpt.getDemp().add(e1);
	dpt.getDemp().add(e2);
	dpt1.getDemp().add(e3);
	dpt1.getDemp().add(e4);
	
	s.save(dpt);
	s.save(dpt1);
	
	s.beginTransaction().commit();
	

}
}
