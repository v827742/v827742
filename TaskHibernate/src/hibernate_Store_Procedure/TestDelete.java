package hibernate_Store_Procedure;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestDelete {
	public static void main(String[] args) {
		
		Session s=HibernateUtil.getsessionFactory().openSession();
		
		StoredProcedureQuery spq=s.createStoredProcedureQuery("delete_stu");
		
		Transaction tx=s.beginTransaction();
		
		spq.registerStoredProcedureParameter("rno", Integer.class, ParameterMode.IN);
		
		spq.setParameter("rno", 4);
		
		spq.execute();
		
		tx.commit();
	}

}
