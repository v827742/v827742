package hibernate.relation.unidirectional;

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		
	
  Account ac=new Account();
  
  ac.setAcno(1111);
  ac.setName("Rakesh");
  ac.setAddr("Akurdi");
  
  
  AccountPlus acp=new AccountPlus();
  
  acp.setAcpid(1);
  acp.setAmount(200000);
  ac.setAcp(acp);
  
  Session s=HibernateUtil.getsessionFactory().openSession();
  
  s.save(ac);
  s.beginTransaction().commit();
	}
}
