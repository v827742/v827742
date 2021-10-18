package mapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoTask {
	public static void main(String[] args) {
		
	

	
	Map m=new HashMap();
	m.put(1, "abc");
	m.put(2, "pqr");
	m.put(3, "xyz");
	
	System.out.println(m);
	
	Set keys=m.keySet();
	System.out.println(keys);
	
	Iterator key=keys.iterator();
	
	while(key.hasNext())
	{
		
		int s=(int)key.next();
		System.out.println(s);
		String val=(String)m.get(s);
		System.out.println(val);
	}

}}
