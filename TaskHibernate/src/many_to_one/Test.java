package many_to_one;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		
		User u=new User();
		u.setUserid(1001);
		u.setName("Ashish");
		u.setMono(8411090881l);
		u.setAddr("Nagpur");
		
		
		Vehicle veh=new Vehicle();
		veh.setVehicleId(7846);
		veh.setVname("Renault Duster");
		veh.setIssuedate("25/01/2021");
		
		veh.setUser(u);
		
		Vehicle veh1=new Vehicle();
		veh1.setVehicleId(7847);
		veh1.setVname("AUDI007");
		veh1.setIssuedate("25/01/2021");
		veh1.setUser(u);
		
		Session s=HibernateUtil.getsessionFactory().openSession();
		
	   s.save(veh);
	   s.save(veh1);
	   
	   s.beginTransaction().commit();
	   s.close();
	
	}
}
