package name_queies_practice;

import org.hibernate.Session;

public class Test {
	
	public static void main(String[] args) {
		Session s=HibernateUtil.getsessionfactory().openSession();
		
		Department dpt=new Department();
		dpt.setDid(1);
		dpt.setDname("IT");
		dpt.setAddr("karvenager");
		
		Department dpt1=new Department();
		dpt1.setDid(2);
		dpt1.setDname("IT");
		dpt1.setAddr("karvenager");
		
		s.save(dpt);
		s.save(dpt1);
		
		
		s.beginTransaction().commit();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
