package hibernate_criteria_builder;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

public class TestFetchBothSI {
	
	public static void main(String[] args) {
		
		
		Session s=HibernateUtil.getsessionFactory().openSession();
		
		CriteriaBuilder builder=s.getCriteriaBuilder();
		
		CriteriaQuery<Object[]> cquery=builder.createQuery(Object[].class);
		
		Root<Employee> root=cquery.from(Employee.class);
		
		cquery.multiselect(root.get("empid"),root.get("name"),root.get("addr"));
		
		List<Object[]> list=s.createQuery(cquery).getResultList();
		
		for(Object[] obj: list)
		{
			System.out.println(obj[0]);
			System.out.println(obj[1]);
			System.out.println(obj[2]);
		}
	}

}
