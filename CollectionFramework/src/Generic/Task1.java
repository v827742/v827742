package Generic;

import java.util.*;

public class Task1 {

		public static void main(String[] args) {
			
			
			
			List<String> MH=new ArrayList<>();
			MH.add("pune");
			MH.add("mumbai");
			
			List<String> Jh=new ArrayList<>();
			Jh.add("ranchi");
			Jh.add("lohadaga");
			
			List<String>  Washington=new ArrayList<>();
			Washington.add("pasco");
			Washington.add("yakima");
			
			List<String>  California=new ArrayList<>();
			California.add("yubs city");
			California.add("los angeles");
			
			List<List<String>> india=new ArrayList<>();
			india.add(MH);
			india.add(Jh);
			
			List<List<String>> USA=new ArrayList<>();
			india.add(Washington);
			india.add(California);
			
			
			List<List<List<String>>> world=new ArrayList<>();
			world.add(india);
			world.add(USA);
			
			
			Iterator<List<List<String>>> itr=world.iterator();
			while(itr.hasNext())
			{
				List<List<String>> l=itr.next();
				
				Iterator<List<String>> itr1=l.iterator();
				
				while(itr1.hasNext())
				{
					List<String> l1=itr1.next();
					
					Iterator<String> itr2=l1.iterator();
					
					while(itr2.hasNext())
					{
						String st=(String)itr2.next();
						System.out.println(st);
					}
					
					}
				}
			}
}



