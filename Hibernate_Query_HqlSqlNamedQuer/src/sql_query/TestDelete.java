package sql_query;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class TestDelete {
	
	public static void main(String[] args) {
		Session s=HibernateUtil.getsessionfactory().openSession();
		
		Transaction tx=s.beginTransaction();
		Query<Student> query=s.createNativeQuery("delete from Student where rollno=:rno",Student.class);
		
		query.setParameter("rno", 3);
		
		query.executeUpdate();
		tx.commit();
		
	}

}
