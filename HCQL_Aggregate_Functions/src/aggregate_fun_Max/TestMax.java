package aggregate_fun_Max;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

public class TestMax {
public static void main(String[] args) {
	

	Session s=HibernateUtil.getsessionFactory().openSession();
	CriteriaBuilder cb=s.getCriteriaBuilder();
   CriteriaQuery<Double>query=cb.createQuery(Double.class);
   Root<Employee> rt=query.from(Employee.class);
   query.multiselect(cb.max(rt.get("salary")));
   List<Double> list=s.createQuery(query).getResultList();
   
   for(Double d:list)
   {
	   System.out.println(d);
   }
	
}
}