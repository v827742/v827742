package many_to_one_to_many;

import org.hibernate.Session;

import many_to_one.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		
	Department dpt=new Department();
	dpt.setDep_id(1113);
	dpt.setDep_name("IT");
	
	/*Department dpt1=new Department();
	dpt1.setDep_id(1114);
	dpt1.setDep_name("HR");*/
	
	
     Employee em=new Employee();
     em.setEmp_id(14);
     em.setEmp_name("suraj");
     em.setEmp_desig("Developer");
     
     Employee em1=new Employee();
     em1.setEmp_id(15);
     em1.setEmp_name("sonu");
     em1.setEmp_desig("generalist");
     
     em.setEmp(dpt);
     
    // em1.setEmp(dpt1);
     
     
     dpt.getEmployee().add(em);
     dpt.getEmployee().add(em1);
     
     
     
     Session s=HibernateUtil.getsessionFactory().openSession();
     s.save(dpt);
    // s.save(dpt1);
     
     s.beginTransaction().commit();
     
     
}
}