package single_table_Employee;

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		
	
	RegularEmployee rm=new RegularEmployee();
	rm.setId(10);
	rm.setCname("Ravi");
	rm.setSalary(30000);
    rm.setBonus(5000);
    
    
    ContarctEmployee ce=new ContarctEmployee();
    ce.setId(20);
    ce.setCname("Tarun");
    ce.setPay_per_hour(2000);
    ce.setContract_duration("3 year");
    
    
    Session s=HibernateUtil.getsessionFactory().openSession();
    s.save(rm);
    s.save(ce);
    s.beginTransaction().commit();
	
	
	}
}