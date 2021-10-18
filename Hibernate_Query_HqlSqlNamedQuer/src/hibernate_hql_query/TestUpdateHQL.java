package hibernate_hql_query;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class TestUpdateHQL {
	public static void main(String[] args) {
		
		Session s=HibernateUtil.getsessionfactory().openSession();
		
		Transaction tx=s.beginTransaction();
		
		Query<Student> query=s.createQuery("update from Student set name=:nm where rollno=:rno",Student.class);
		
		query.setParameter("rno", 5);
		query.setParameter("nm", "neel");
		
		query.executeUpdate();
		tx.commit();
		
	}

}
