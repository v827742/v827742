package hibernate.relation.bidirectional.MTO_OTM;

import org.hibernate.Session;

public class Test {
	
	public static void main(String[] args) {
		
		Department dmt=new Department();
		dmt.setDid(2);
		dmt.setName("HR");
		
		Employee emp1=new Employee();
		emp1.setEmpid(103);
		emp1.setName("Ankush");
		emp1.setDesignation("Generalist");
		
		emp1.setDept(dmt);
		
		Employee emp2=new Employee();
		emp2.setEmpid(104);
		emp2.setName("Santosh");
		emp2.setDesignation("Specialist");
		
		emp2.setDept(dmt);
		
		dmt.getSemp().add(emp1);
		dmt.getSemp().add(emp2);
		
		Session s=HibernateUtil.getSessionFactory().openSession();
		
		s.save(dmt);
		s.beginTransaction().commit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
