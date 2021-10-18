package practice_single_table;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		
		TwoWheeler tw=new TwoWheeler();
		tw.setId(111);
		tw.setName("Honda Shine");
		tw.setLicenceno("Lic100014");
		tw.setSteeringType("Short Handle");
		
		
		FourWheeler fw=new FourWheeler();
		fw.setId(222);
		fw.setName("Renaul duster");
		fw.setLicenceno("Lic200021");
		fw.setSteering("Round Wheel");
		
		
		Session s=HibernateUtil.getsessionFactory().openSession();
		
		s.save(tw);
		s.save(fw);
		s.beginTransaction().commit();
		
	}
}
