package annotation_hibernate_pro;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class TestEmp {

	public static void main(String[] args) {
		
		StandardServiceRegistry reg=new StandardServiceRegistryBuilder().configure().build();
		MetadataSources mds=new MetadataSources(reg);
		Metadata md=mds.getMetadataBuilder().build();
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		Session s=sf.openSession();
		
		Employee emp=new Employee();
		emp.setEmp_Id(11);
		emp.setEmp_Address("navi Mumbai");
		emp.setEmp_designation("Developer");
		emp.setEmp_Email("rkumar90@gmail.com");
		emp.setEmp_Salary(60000.10);
		emp.setEmp_name("Ravish_Kumar");
		
		s.save(emp);
		s.beginTransaction().commit();
		
		
	}
}
