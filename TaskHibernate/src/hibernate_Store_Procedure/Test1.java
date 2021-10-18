package hibernate_Store_Procedure;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;

public class Test1 {
	
	public static void main(String[] args) {
		
	Session	s=HibernateUtil.getsessionFactory().openSession();
	StoredProcedureQuery spq=s.createStoredProcedureQuery("phone_count");
	spq.registerStoredProcedureParameter("rno",Integer.class, ParameterMode.IN);
	spq.registerStoredProcedureParameter("pid", Integer.class, ParameterMode.OUT);

	spq.setParameter("rno", 1);

	spq.execute();
	
	System.out.println(spq.getOutputParameterValue("pid"));
	
	
	
		
		
		
		
		
		
	
	}

}
