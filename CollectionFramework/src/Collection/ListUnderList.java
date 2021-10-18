package Collection;

import java.util.*;

public class ListUnderList {
	public static void main(String[] args) {
		
		
		List mh=new ArrayList();
		mh.add("pune");
		mh.add("Nagpur");
		
		List mp=new ArrayList();
		mp.add("bhopal");
		mp.add("rajgarh");
		
		List jh=new ArrayList();
		jh.add("ranchi");
		jh.add("lohardaga");
		jh.add("bokaro");
		
		
		List india= new ArrayList();
		india.add(mh);
		india.add(mp);
		india.add(jh);
		
		System.out.println(india);
		
		Iterator itr=india.iterator();
		//System.out.println(itr);
		while(itr.hasNext())
		{
			List i=(List)itr.next();
			
			System.out.println(i);
			
			Iterator itr1=i.iterator();
			
			//System.out.println(itr1);
			
			while(itr1.hasNext())
			{
				String s=(String)itr1.next();
				System.out.println(s);
			}
				
			}
		}
		
		
		
		

}
