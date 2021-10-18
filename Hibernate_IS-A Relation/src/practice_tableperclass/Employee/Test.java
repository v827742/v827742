package practice_tableperclass.Employee;

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		
		RegularEmployee re=new RegularEmployee();
		re.seteId(1);
		re.seteName("Ashish");
		re.setSalary(30000);
        re.setBonus(5000);
        
        ContractEmployee ce=new ContractEmployee();
        ce.seteId(2);
        ce.seteName("Pankaj");
        ce.setContractduration("3 year");		
        ce.setPayperhour(1500.00f);		
        
        Employee emp=new Employee();
        emp.seteId(10);
        emp.seteName("Santosh");
        
        Session s=HibernateUtil.getsessionFactory().openSession();
        s.save(re);
        s.save(ce);
        s.save(emp);
        s.beginTransaction().commit();
		
	}

}
