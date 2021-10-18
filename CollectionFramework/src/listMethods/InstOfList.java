package listMethods;

import java.util.*;

public class InstOfList {
	public static void main(String[] args) {
		
		List list=new ArrayList();
		
		list.add("abc");
		list.add("xyz");
		list.add("xuv");
		list.add(30);
		list.add(20);
		list.add(60);
		
		System.out.println(list);
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			Object o=itr.next();
		
			
			if(o instanceof String)
			{
				String s=(String)o;
				System.out.println(s);
			}
			else if(o instanceof Integer)
			{
				int i=(int)o;
				System.out.println(i);
			}
		}
	}

}
