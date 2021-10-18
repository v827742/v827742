package hibernate_criteria_builder;



import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		
		Session s=HibernateUtil.getsessionFactory().openSession();
		
	CriteriaBuilder builder=s.getCriteriaBuilder();
	CriteriaQuery<Employee> cquery=builder.createQuery(Employee.class);
	
	Root<Employee> root=cquery.from(Employee.class);
	
	cquery.select(root);
	
	List<Employee> list= s.createQuery(cquery).getResultList();
	
		for(Employee emp: list)
		{
			System.out.println(" ");
			System.out.println("EMPLOYEE ID : : "+emp.getEmpid());
			System.out.println("EMPLOYEE NAME : : "+emp.getName());
			System.out.println("EMPLOYEE ADDRESS : : "+emp.getAddr());
			System.out.println("EMPLOYEE DESIGNATION : : "+emp.getDegignation());
			System.out.println("EMPLOYEE DEPARTMENT ID : : "+emp.getDept().getDid());
             System.out.println("EMPLOYEE DEPARTMENT NAME : :"+emp.getDept().getDname());
             
             System.out.println("  ");
		}
		
		//fetch list of data from databse Employee table.
		
		
	}

}
