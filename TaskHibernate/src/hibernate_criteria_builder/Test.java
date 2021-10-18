package hibernate_criteria_builder;

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		
	
	Session s=HibernateUtil.getsessionFactory().openSession();
	
	Department dpt=new Department();
	dpt.setDname("IT");
	
	Employee e1=new Employee();
	e1.setName("Ashish");
	e1.setAddr("Pune");
	e1.setDegignation("Developer");
	e1.setDept(dpt);
	
	Employee e2=new Employee();
	e2.setName("Akshay");
	e2.setAddr("nagpur");
	e2.setDegignation("developer");
	e2.setDept(dpt);
	
	
	dpt.getDemp().add(e1);
	dpt.getDemp().add(e2);
	
	s.save(dpt);
	
	s.beginTransaction().commit();
	

}
}
