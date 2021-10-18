package manyTomany.cfbs;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

public class HibernateUtil {
	
	private static StandardServiceRegistry reg;
	private static SessionFactory sf;
	
	public static SessionFactory getSessionFactory()
	{
		if(sf==null)
		{
			Map<String,Object> map=new HashMap<>();
			map.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
		    map.put(Environment.URL , "jdbc:mysql://localhost:3306/mtm_insti_pro");
		    map.put(Environment.USER , "root");
		    map.put(Environment.PASS , "root");
		    map.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
		    map.put(Environment.HBM2DDL_AUTO, "update");
		    map.put(Environment.SHOW_SQL, "true");
		    
		    reg=new StandardServiceRegistryBuilder().applySettings(map).build();
		    MetadataSources mds=new MetadataSources(reg);
		    mds.addAnnotatedClass(Course.class);
		    mds.addAnnotatedClass(Faculty.class);
		    mds.addAnnotatedClass(Batch.class);
		    mds.addAnnotatedClass(Student.class);
		    Metadata md=mds.getMetadataBuilder().build();
		    sf=md.getSessionFactoryBuilder().build();
		    
		    
		    
		}
		 return sf;   
	}

}
