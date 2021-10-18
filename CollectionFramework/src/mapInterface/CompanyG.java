package mapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CompanyG {

	public  Map<String,Map<String,EmployeeG>> designation()
	{
		
		
		EmployeeG e=new EmployeeG();
		e.setEid(1);
        e.setEname("Ashish");
         e.setEsalary(25000.00);
         
         EmployeeG e1=new EmployeeG();
 		e1.setEid(2);
         e1.setEname("pankaj");
          e1.setEsalary(35000.00);
          
         
          EmployeeG e2=new EmployeeG();
  		e2.setEid(1);
          e2.setEname("Ashish");
           e2.setEsalary(25000.00);
           
           EmployeeG e3=new EmployeeG();
   		e3.setEid(2);
           e3.setEname("pankaj");
            e3.setEsalary(35000.00);
           
            Map<String,EmployeeG> developer=new HashMap<>();
    		
            developer.put("developer of infosys",e);
            developer.put("developer of tcs",e1);
           
            Map<String,EmployeeG> tester=new HashMap<>();
            tester.put("Tester of infosys", e2);
            tester.put("Tester of tcs", e3);
           
            Map<String,Map<String,EmployeeG>> team=new HashMap<>();
            team.put("developer", developer);
            team.put("tester", tester);
            
          
         return team;
	}
	public static void main(String[] args) {
		
		CompanyG cg=new CompanyG();
		Map<String,Map<String,EmployeeG>> data=cg.designation();
		
		Set<String> keys=data.keySet();
		System.out.println(keys);
		
		for(String key:keys)
		{
			System.out.println(key);
			Map<String,EmployeeG> m=data.get(key);
			Set<String> key1=m.keySet();
			for(String st:key1)
			{
				EmployeeG em=m.get(st);
				//System.out.println(em);
			
			System.out.println(em.getEid());
			System.out.println(em.getEname());
			System.out.println(em.getEsalary());
				
				}
			}
		System.out.println("   ");
		System.out.println("by using Iterator");
		
		Iterator<String> itr=keys.iterator();
		while(itr.hasNext())
		{
			String st=itr.next();
			System.out.println(st);
			Map<String,EmployeeG> es=data.get(st);
			
			Set<String> st1=es.keySet();
			
			Iterator<String> itr1=st1.iterator();
			while(itr1.hasNext())
			{
				String str=itr1.next();
				EmployeeG emp=es.get(str);
				
				System.out.println(emp.getEid());
				System.out.println(emp.getEname());
				System.out.println(emp.getEsalary());
				
			}
			
			
		}
		}
		
		
		
		
	}
