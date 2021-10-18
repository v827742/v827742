package is_A_Join_relation;

import org.hibernate.Session;

public class Test {
	
public static void main(String[] args) {
	
	Karvenager kvg=new Karvenager();
	
	kvg.setId(1);
	kvg.setSname("XYZ");
	kvg.setCname("JAVA");
	kvg.setRegularbatch("B132");
	
	Akurdi ard=new Akurdi();
	ard.setId(2);
	ard.setSname("PQR");
	ard.setCname("Python");
	ard.setWeekendbatch("B22");
	
	Session s=HibernateUtil.getsessionFactory().openSession();
	s.save(kvg);
    s.save(ard);
    
    s.beginTransaction().commit();
	
}

}
