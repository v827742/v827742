package Com.cjc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test {
	
	public static void main(String[] args) {
		
		StandardServiceRegistry reg=new StandardServiceRegistryBuilder().configure().build();
		MetadataSources mds=new MetadataSources(reg);
		Metadata md=mds.getMetadataBuilder().build();
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		Session s=sf.openSession();
		Student stu=new Student();
		
		stu.setId(1);
		stu.setName("pankaj");
		stu.setAddr("pune");
		stu.setAge(25);
		
		s.save(stu);
		
		s.beginTransaction().commit();
		
		
		
	}

}
