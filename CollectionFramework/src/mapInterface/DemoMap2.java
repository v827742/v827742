package mapInterface;

import java.util.*;

public class DemoMap2 {
	
	public static void main(String[] args) {
		
		Map m=new HashMap();
		m.put("aa", "abc");
		m.put("bb", "pqr");
		m.put("cc", "xyz");
		
		
		Set keys=m.keySet();
		System.out.println(keys);
		
		Iterator itr=keys.iterator();
		while(itr.hasNext())
		{
			String s=(String)itr.next();
			System.out.println(s);
			
			String val=(String)m.get(s);
			System.out.println(val);
			
		}
		
	}

}
