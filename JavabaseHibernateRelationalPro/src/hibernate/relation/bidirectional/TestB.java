package hibernate.relation.bidirectional;

import org.hibernate.Session;

public class TestB {
	public static void main(String[] args) {
		
	
	
	 AccountB ac=new AccountB();
	 ac.setAcno(25);
	 ac.setName("Megha");
	 ac.setAddr("Akurdi");
	 
	 
	 
	 AccountPlus1 acp=new AccountPlus1();
	 acp.setAcpid(4);
	 acp.setAmount(40000.00);
	 acp.setAc(ac);
	 ac.setAcp(acp);
	 Session s=HibernateUtil.getsessionFactory().openSession();
	 
	 s.save(ac);
	 s.save(acp);
	 s.beginTransaction().commit();
	}
}
