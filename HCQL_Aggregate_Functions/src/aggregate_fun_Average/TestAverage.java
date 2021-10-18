package aggregate_fun_Average;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;



public class TestAverage {
	public static void main(String[] args) {
		
	
	Session s=HibernateUtil.getsessionFactory().openSession();
	
	CriteriaBuilder cb=s.getCriteriaBuilder();
	
	CriteriaQuery<Double> cquery=cb.createQuery(Double.class);
	
	Root<Employee> root=cquery.from(Employee.class);
	
	cquery.multiselect(cb.avg(root.get("salary")));
	
	
	List<Double> list=s.createQuery(cquery).getResultList();
	
	for(Double d: list)
	{
		System.out.println(d);
	}
           
}
}