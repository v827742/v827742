package hibernate_criteria_builder;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

public class FetchBothclass {
	
public static void main(String[] args) {
	
	Session s=HibernateUtil.getsessionFactory().openSession();
	CriteriaBuilder builder=s.getCriteriaBuilder();
	CriteriaQuery<Object[]> cquery=builder.createQuery(Object[].class);
	
	Root<Employee> rootemp=cquery.from(Employee.class);
	Root<Department> rootdpt=cquery.from(Department.class);
	
	cquery.multiselect(rootdpt,rootemp).where(builder.equal( rootdpt.get("did"),rootemp.get("dept")));
	
	List<Object[]> list=s.createQuery(cquery).getResultList();
	
	for(Object obj[]:list)
	{
	Employee emp=(Employee)obj[1];
		Department dpmt=(Department)obj[0];
		
		System.out.println(emp.getEmpid());
		System.out.println(emp.getName());
		System.out.println(emp.getAddr());
		System.out.println(emp.getDegignation());
		
		System.out.println(dpmt.getDid());
		System.out.println(dpmt.getDname());
		
	}
}

}
