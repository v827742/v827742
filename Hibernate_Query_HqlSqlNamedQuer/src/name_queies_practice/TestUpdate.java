package name_queies_practice;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class TestUpdate {
	public static void main(String[] args) {
		
		
		Session s=HibernateUtil.getsessionfactory().openSession();
		
		Transaction tx=s.beginTransaction();
		
		Query<Department> query=s.createNamedQuery("update_query");
		
		query.setParameter("id", 2);
		query.setParameter("dnm", "Software");
		query.setParameter("adr", "Akurdi");
		
		query.executeUpdate();
		tx.commit();
		
		
		
	}

}
