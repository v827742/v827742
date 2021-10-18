package hibernate.relation.bidir.cfbs;

import org.hibernate.Session;

public class Test {
	
	
	public static void main(String[] args) {
		Course crs=new Course();
		crs.setCid(1);
		crs.setCname("java");
		
		
		Faculty flt=new Faculty();
		flt.setFid(10);
		flt.setFname("Rakesh");
		flt.setCrs(crs);
		
		Batch btc=new Batch();
		btc.setBid(132);
		btc.setBname("corejava");
	    btc.setFlt(flt);
		
		Student stu=new Student();
		stu.setSid(123);
		stu.setSname("Pankaj");
	    stu.setBatch(btc);
		
		Session s=HibernateUtil.getsessionFactory().openSession();
		
		s.save(stu);
		s.beginTransaction().commit();
	}

}
