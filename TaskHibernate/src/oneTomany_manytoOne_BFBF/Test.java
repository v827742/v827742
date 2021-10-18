package oneTomany_manytoOne_BFBF;

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		
		Session s=HibernateUtil.getsessionFactory().openSession();
		Batch b=new Batch();
		b.setBatchid(101);
		b.setBatchno(132);
		b.setBname("core java");
		
		Faculty flt=new Faculty();
		flt.setFid(1);
		flt.setFname("Vishal sir");
		flt.setBatch(b);
		
		Faculty flt1=new Faculty();
		flt1.setFid(2);
		flt1.setFname("Vijay sir");
		flt1.setBatch(b);
		
		BackupFaculty bkf=new BackupFaculty();
		bkf.setBackupfid(1);
		bkf.setBname("Ajay sir");
		bkf.setBatch(b);
		
		BackupFaculty bkf1=new BackupFaculty();
		bkf1.setBackupfid(2);
		bkf1.setBname("Akshay sir");
		bkf1.setBatch(b);
		
		b.getF().add(flt);
		b.getF().add(flt1);
		
		b.getBckup().add(bkf);
		b.getBckup().add(bkf1);
		   
		
		s.save(b);
		
		
		s.beginTransaction().commit();
		
		
	}

}
