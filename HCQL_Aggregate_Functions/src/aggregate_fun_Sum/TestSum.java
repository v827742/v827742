package aggregate_fun_Sum;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import aggregate_fun_Average.Employee;
import aggregate_fun_Average.HibernateUtil;

public class TestSum {
	public static void main(String[] args) {
		
	
	Session s=HibernateUtil.getsessionFactory().openSession();
	
	CriteriaBuilder cb=s.getCriteriaBuilder();
	CriteriaQuery<Double> query=cb.createQuery(Double.class);
	Root<Employee> root=query.from(Employee.class);
	query.multiselect(cb.sum(root.get("salary")));
	
	List<Double> list=s.createQuery(query).getResultList();
	
	for(Double d:list)
		
	{
		System.out.println(d);
	}
	}
}
