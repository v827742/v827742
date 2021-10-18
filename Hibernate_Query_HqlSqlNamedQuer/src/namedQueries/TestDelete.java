package namedQueries;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class TestDelete {
	public static void main(String[] args) {
Session s=HibernateUtil.getsessionfactory().openSession();
		
		Transaction tx=s.beginTransaction();
		Query<Student> query=s.createNamedQuery("delete_stu");
		
		query.setParameter("idno", 4);
		
		
		
		query.executeUpdate();
		tx.commit();
	}

}
