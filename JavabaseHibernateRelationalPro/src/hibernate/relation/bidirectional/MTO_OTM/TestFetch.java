package hibernate.relation.bidirectional.MTO_OTM;

import org.hibernate.Session;

public class TestFetch {
	
	public static void main(String[] args) {
		
		Session s=HibernateUtil.getSessionFactory().openSession();
		Employee emp=s.get(Employee.class, 104);
		System.out.println(emp.getEmpid());
		System.out.println(emp.getName());
		System.out.println(emp.getDesignation());
		System.out.println(emp.getDept().getDid());
		System.out.println(emp.getDept().getName());
		
	
		
		
		
		
		
		
	}

}
