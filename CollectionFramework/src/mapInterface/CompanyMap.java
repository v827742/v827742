package mapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CompanyMap {

	public  Map designation()
	{
		Map team=new HashMap();
		Map developer=new HashMap();
		
		EmloyeeMap e=new EmloyeeMap();
		e.setEid(1);
        e.setEname("Ashish");
         e.setEsalary(25000.00);
         
         EmloyeeMap e1=new EmloyeeMap();
 		e1.setEid(2);
         e1.setEname("pankaj");
          e1.setEsalary(35000.00);
          
          Map tester=new HashMap();
          EmloyeeMap e2=new EmloyeeMap();
  		e2.setEid(1);
          e2.setEname("Ashish");
           e2.setEsalary(25000.00);
           
           EmloyeeMap e3=new EmloyeeMap();
   		e3.setEid(2);
           e3.setEname("pankaj");
            e3.setEsalary(35000.00);
            
            developer.put("developer of infosys",e);
            developer.put("developer of tcs",e1);
            tester.put("Tester of infosys", e2);
            tester.put("Tester of tcs", e3);
            
            team.put("developer", developer);
            team.put("tester", tester);
            
          
         return team;
	}
	public static void main(String[] args) {
		
		CompanyMap c=new CompanyMap();
		Map data=c.designation();
		
		Set keys=data.keySet();
		
		System.out.println(keys);
		
		Iterator itr=keys.iterator();
		while(itr.hasNext())
		{
			String s=(String)itr.next();
			System.out.println(s);
			
			Map m=(Map)data.get(s);
			System.out.println(m);
			
			Set keys1=m.keySet();
			System.out.println(keys1);
			Iterator itr1=keys1.iterator();
			while(itr1.hasNext())
			{
				String s1=(String)itr1.next();
				EmloyeeMap em=(EmloyeeMap)m.get(s1);
				
				
				System.out.println(em.getEid());
				System.out.println(em.getEname());
				System.out.println(em.getEsalary());
			}
			 
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
