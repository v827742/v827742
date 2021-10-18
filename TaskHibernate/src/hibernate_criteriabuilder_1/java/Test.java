package hibernate_criteriabuilder_1.java;

import org.hibernate.Session;


public class Test {
	public static void main(String[] args) {
		
		Session s=HibernateUtil.getsessionFactory().openSession();
		
		Transport trans=new Transport();
		trans.setT_name("ABC Transport");
		trans.setEst_year("2000");
		
		
		VehicleInfo vif=new VehicleInfo();
		vif.setVname("AshokLayland");
		vif.setReg_no("MH-34-AC-2570");
		vif.setTport(trans);
		
		VehicleInfo vif1=new VehicleInfo();
		vif1.setVname("Scorpio");
		vif1.setReg_no("MH-34-AC-3366");
		vif1.setTport(trans);
		
		trans.getTvinfo().add(vif);
		trans.getTvinfo().add(vif1);
		
		
		s.save(trans);
		s.beginTransaction().commit();
		
	}

}
