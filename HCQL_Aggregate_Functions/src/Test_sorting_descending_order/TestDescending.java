package Test_sorting_descending_order;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import aggregate_fun_Max.Employee;
import aggregate_fun_Max.HibernateUtil;

public class TestDescending {
	public static void main(String[] args) {
		Session s=HibernateUtil.getsessionFactory().openSession();
		CriteriaBuilder cb=s.getCriteriaBuilder();
		CriteriaQuery<Employee> cq=cb.createQuery(Employee.class);
		Root<Employee>rt=cq.from(Employee.class);
		
		cq.orderBy(cb.desc(rt.get("empid")));
		
		List<Employee> list=s.createQuery(cq).getResultList();
		
		for(Employee e:list)
		{
			System.out.println(e.getEmpid());
			System.out.println(e.getName());
			System.out.println(e.getAddr());
			System.out.println(e.getDegignation());
			System.out.println(e.getSalary());
			System.out.println(e.getDept().getDid());
			System.out.println(e.getDept().getDname());
		
		}
		
	}

}
