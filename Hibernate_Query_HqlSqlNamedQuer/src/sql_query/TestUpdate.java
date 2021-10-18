package sql_query;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class TestUpdate {
	
	public static void main(String[] args) {
		
		Session s=HibernateUtil.getsessionfactory().openSession();
		
		Transaction tx=s.beginTransaction();
		Query<Student> query=s.createNativeQuery("update Student set name=:nm where rollno=:rno",Student.class);
		
		query.setParameter("rno", 3);
		query.setParameter("nm", "Ashish");
		
		query.executeUpdate();
		
		tx.commit();
		
	}

}
