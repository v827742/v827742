package oneTomany;

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		
	
	Session s=HibernateUtil.getSessionFactory().openSession();
	
	Doctor dr=new Doctor();
	dr.setD_id(123);
	dr.setD_name("Ashish");
	
	
	Patient pt=new Patient();
	pt.setBed_id(1);
	pt.setP_name("Avinash");
    pt.setP_addr("Karvenager");
    pt.setDr(dr);
    
    Patient pt1=new Patient();
	pt1.setBed_id(2);
	pt1.setP_name("Suraj");
    pt1.setP_addr("Akurdi");
    pt1.setDr(dr);
    
    dr.getDp().add(pt);
    dr.getDp().add(pt1);
    
    s.save(dr);
    
    s.beginTransaction().commit();
}
}
