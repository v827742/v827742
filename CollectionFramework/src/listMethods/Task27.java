package listMethods;

import java.util.*;

public class Task27 {
	public static void main(String[] args) {
		
		List l=new ArrayList();
		l.add(34);
		l.add("abc");
		l.add('m');
		l.add("xyz");
		l.add('A');
		
		System.out.println(l);
		
		Iterator itr=l.iterator();
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
			else if(o instanceof Character)
			{
				char c=(char)o;
				System.out.println(c);
			}
		}
		
	}

}
