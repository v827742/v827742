package name_queies_practice;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class TestDelete {
	
public static void main(String[] args) {
	
	Session s=HibernateUtil.getsessionfactory().openSession();
	
	Transaction tx=s.beginTransaction();
	
	Query<Department> qr=s.createNamedQuery("delete_query");
	
	qr.setParameter("dpid", 2);
	
	qr.executeUpdate();
	
	tx.commit();
	
	
	
}

}
