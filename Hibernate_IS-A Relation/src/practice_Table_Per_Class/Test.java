package practice_Table_Per_Class;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		v.setId(10);
		v.setName("Pulser");
		v.setLicenceno("lic45478");
		
		
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
		s.save(v);
		s.beginTransaction().commit();
		
	}
}
