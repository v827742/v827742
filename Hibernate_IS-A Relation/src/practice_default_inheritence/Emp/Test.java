package practice_default_inheritence.Emp;

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
        
        
        Session s=HibernateUtil.getsessionFactory().openSession();
        s.save(re);
        s.save(ce);
        s.beginTransaction().commit();
		
	}

}
