package hibernate_Store_Procedure;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestInsert {
	public static void main(String[] args) {
		
Session s=HibernateUtil.getsessionFactory().openSession();
		
		StoredProcedureQuery spq=s.createStoredProcedureQuery("insert_stu");
		Transaction tx=s.beginTransaction();
		spq.registerStoredProcedureParameter("rollno", Integer.class, ParameterMode.IN);
		spq.registerStoredProcedureParameter("name", String.class, ParameterMode.IN);
		spq.registerStoredProcedureParameter("addr", String.class, ParameterMode.IN);
		
		spq.setParameter("rollno", 6);
		spq.setParameter("name", "roshan");
		spq.setParameter("addr", "Pune");
		
		spq.execute();
		tx.commit();
		
	}

}
