package oneTomany;

import org.hibernate.Session;

public class TesteEagerLoding {
	
	public static void main(String[] args) {
		
		Session s=HibernateUtil.getSessionFactory().openSession();
		
//		Patient pt=s.get(Patient.class, 1);
//		System.out.println(pt.getBed_id());
//		System.out.println(pt.getP_name());
//		System.out.println(pt.getP_addr());
//		System.out.println(pt.getDr().getD_id());
//		System.out.println(pt.getDr().getD_name());
//		
//		
		
		
	}

}
