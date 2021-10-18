package aggregate_function_min;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import aggregate_fun_Max.Employee;
import aggregate_fun_Max.HibernateUtil;

public class TestMin {
	
	public static void main(String[] args) {
		
		
		Session s=HibernateUtil.getsessionFactory().openSession();
		
		CriteriaBuilder cb=s.getCriteriaBuilder();
		
		CriteriaQuery<Double> cq=cb.createQuery(Double.class);
		
		Root<Employee> root=cq.from(Employee.class);
		
		cq.multiselect(cb.min(root.get("salary")));
		
		List<Double> list=s.createQuery(cq).getResultList();
		
		for(Double d:list)
		{
			System.out.println(d);
		}
	}

}
