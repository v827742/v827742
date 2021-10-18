package hibernate_Store_Procedure;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Testupdate {
	public static void main(String[] args) {
		
		Session s=HibernateUtil.getsessionFactory().openSession();
		
		StoredProcedureQuery spq=s.createStoredProcedureQuery("update_stu");
		Transaction tx=s.beginTransaction();
		spq.registerStoredProcedureParameter("rno", Integer.class, ParameterMode.IN);
		spq.registerStoredProcedureParameter("nm", String.class, ParameterMode.IN);
		spq.registerStoredProcedureParameter("adr", String.class, ParameterMode.IN);
		
		spq.setParameter("rno", 1);
		spq.setParameter("nm", "Pankaj");
		spq.setParameter("adr", "Surat");
		
		spq.executeUpdate();
		tx.commit();
		
	}

}
