package name_queies_practice;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class TestSelect {
	public static void main(String[] args) {
		
		
		Session s=HibernateUtil.getsessionfactory().openSession();
		
		Query<Department> dquery=s.createNamedQuery("all_Dept");
		
		List<Department>list=dquery.getResultList();
		for(Department dpt:list)
		{
			System.out.println(dpt.getDid());
			System.out.println(dpt.getDname());
			System.out.println(dpt.getAddr());
		}
		
		dquery=s.createNamedQuery("one_dept");
		dquery.setParameter("id", 2);
		Department dpt=dquery.getSingleResult();
		System.out.println(dpt.getDid());
		System.out.println(dpt.getDname());
		System.out.println(dpt.getAddr());
			
		}
		
	}


