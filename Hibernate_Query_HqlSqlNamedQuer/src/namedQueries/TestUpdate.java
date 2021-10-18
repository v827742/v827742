package namedQueries;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class TestUpdate {
	public static void main(String[] args) {
		
		Session s=HibernateUtil.getsessionfactory().openSession();
		
		Transaction tx=s.beginTransaction();
		Query<Student> query=s.createNamedQuery("update_stu");
		
		query.setParameter("id", 4);
		
		query.setParameter("nm", "dipak");
		
		query.executeUpdate();
		tx.commit();
	}

}
