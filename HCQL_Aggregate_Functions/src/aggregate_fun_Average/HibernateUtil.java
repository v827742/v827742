package aggregate_fun_Average;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.internal.StandardServiceRegistryImpl;
import org.hibernate.cfg.Environment;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	private static StandardServiceRegistry reg;
	
	private static SessionFactory sf;
	
	public static SessionFactory getsessionFactory()
	{
		if(sf==null)
		{
			
			Map<String, Object> m=new HashMap<>();
			m.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
			m.put(Environment.URL, "jdbc:mysql://localhost:3306/test_aggfun");
			m.put(Environment.USER, "root");
			m.put(Environment.PASS, "root");
			m.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
			m.put(Environment.HBM2DDL_AUTO,"update");
			m.put(Environment.SHOW_SQL, "true");
			
			reg=new StandardServiceRegistryBuilder().applySettings(m).build();
			
			MetadataSources mds=new MetadataSources(reg);
			mds.addAnnotatedClass(Employee.class);
			mds.addAnnotatedClass(Department.class);
			Metadata md=mds.getMetadataBuilder().build();
			sf=md.getSessionFactoryBuilder().build();
				
				
			}
			return sf;
			
		}
	}
	
	
	
	

