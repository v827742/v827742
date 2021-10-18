package hibernate_criteriabuilder_1.java;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestDelete {
	
	public static void main(String[] args) {
		
		Session s=HibernateUtil.getsessionFactory().openSession();
		
		CriteriaBuilder builder=s.getCriteriaBuilder();
		Transaction tx=s.beginTransaction();
		CriteriaDelete<VehicleInfo> delete=builder.createCriteriaDelete(VehicleInfo.class);
		
		Root<VehicleInfo>root=delete.from(VehicleInfo.class);
		
		delete.where(builder.equal(root.get("v_id"), 2));
		
		s.createQuery(delete).executeUpdate();
		
		tx.commit();
		
		
	}

}
