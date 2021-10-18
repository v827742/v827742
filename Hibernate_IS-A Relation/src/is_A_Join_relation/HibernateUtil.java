package is_A_Join_relation;

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
	public static SessionFactory getsessionFactory()
	{
		if(sf==null)
		{
			Map<String,Object> m=new HashMap<>();
			m.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
			m.put(Environment.URL, "jdbc:mysql://localhost:3306/is_ajoin");


            m.put(Environment.USER, "root");
			m.put(Environment.PASS, "root");
			m.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
			m.put(Environment.HBM2DDL_AUTO, "update");
			m.put(Environment.SHOW_SQL, "true");
			
			
			reg=new StandardServiceRegistryBuilder().applySettings(m).build();
			 MetadataSources mds=new MetadataSources(reg);
			    mds.addAnnotatedClass(Karvenager.class);
			    mds.addAnnotatedClass(Akurdi.class);
			   
			    
			    Metadata md=mds.getMetadataBuilder().build();
			    sf=md.getSessionFactoryBuilder().build();
			    
			    
			    
			}
			 return sf;   

		}
	}

