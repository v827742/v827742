package mapInterface;

import java.util.*;

public class DemoMap1 {

	public static void main(String[] args) {
	  
		Map<String,String> m=new HashMap<>();
		m.put("aa", "abc");
		m.put("bb", "pqr");
		m.put("cc", "xyz");
		
		System.out.println(m);
		
		Set<String> keys=m.keySet();
		System.out.println(keys);
		
		Iterator<String> key=keys.iterator();
		
		while(key.hasNext())
		{
			String s=key.next();
			System.out.println(s);
			String val=m.get(s);
			System.out.println(val);
		}
		
		System.out.println("  ");
		System.out.println("by using for each loop");
		for(String k:keys)
		{
			System.out.println(k);
			String val=m.get(k);
			System.out.println(val);
		}
	}
}
