package hibernate_hql_query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import org.hibernate.query.Query;

public class TestDeleteHQL {
	public static void main(String[] args) {
		
		Session s=HibernateUtil.getsessionfactory().openSession();
		
		Transaction tx=s.beginTransaction();
		
		Query<Student> query=s.createQuery("delete from Student where rollno=:rno");
		
		query.setParameter("rno", 4);
		
		query.executeUpdate();
		
		tx.commit();
		
	}

}
