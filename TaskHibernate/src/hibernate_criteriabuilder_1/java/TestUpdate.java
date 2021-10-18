package hibernate_criteriabuilder_1.java;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.Transaction;



public class TestUpdate {
	public static void main(String[] args) {
		
	
	
	Session s=HibernateUtil.getsessionFactory().openSession();
	
	CriteriaBuilder cb=s.getCriteriaBuilder();
	Transaction tx=s.beginTransaction();
	CriteriaUpdate<VehicleInfo> update=cb.createCriteriaUpdate(VehicleInfo.class);
	
	Root<VehicleInfo> root=update.from(VehicleInfo.class);
	
	update.set(root.get("vname"), "Innova");
	update.set(root.get("reg_no"), "Mh-33-SP-2006");
	update.where(cb.equal(root.get("v_id"), 1));
	
	s.createQuery(update).executeUpdate();
	tx.commit();

}
}