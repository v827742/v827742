package hibernate_criteria_builder;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import javassist.bytecode.Opcode;

public class TestFetchstring {
	
	public static void main(String[] args) {
		
		Session s=HibernateUtil.getsessionFactory().openSession();
		
		CriteriaBuilder builder=s.getCriteriaBuilder();
		
		CriteriaQuery<String > cquery=builder.createQuery(String.class);
		
		Root<Employee> root=cquery.from(Employee.class);
		
		cquery.select(root.get("name"));
		
		List<String> list= s.createQuery(cquery).getResultList();
		
		for(String nm:list)
		{
			System.out.println(nm);
		}
	}

}
