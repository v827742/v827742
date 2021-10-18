package Generic;

import java.util.*;

public class Task {
	public static void main(String[] args) {
		
		
		
		List MH=new ArrayList();
		MH.add("pune");
		MH.add("mumbai");
		
		List Jh=new ArrayList();
		Jh.add("ranchi");
		Jh.add("lohadaga");
		
		List Washington=new ArrayList();
		Washington.add("pasco");
		Washington.add("yakima");
		
		List California=new ArrayList();
		California.add("yubs city");
		California.add("los angeles");
		
		List india=new ArrayList();
		india.add(MH);
		india.add(Jh);
		
		List USA=new ArrayList();
		india.add(Washington);
		india.add(California);
		
		
		List world=new ArrayList();
		world.add(india);
		world.add(USA);
		
		
		Iterator itr=world.iterator();
		while(itr.hasNext())
		{
			List l=(List)itr.next();
			
			Iterator itr1=l.iterator();
			
			while(itr1.hasNext())
			{
				List l1=(List)itr1.next();
				
				Iterator itr2=l1.iterator();
				
				while(itr2.hasNext())
				{
					String st=(String)itr2.next();
					System.out.println(st);
				}
				
				
				
				
				
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
