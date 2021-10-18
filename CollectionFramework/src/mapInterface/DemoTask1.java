package mapInterface;

import java.util.*;

public class DemoTask1 {
	public static void main(String[] args) {
		
	
	Map<Integer,String> m=new HashMap<>();
	m.put(1,"abc");
	m.put(2,"pqr");
	m.put(3,"xyz");
	
	System.out.println(m);
	
	Set<Integer> keys=m.keySet();
	System.out.println(keys);
	
	Iterator<Integer> itr=keys.iterator();
	while(itr.hasNext())
	{
		int x=itr.next();
		System.out.println(x);
		
		String s=m.get(x);
		System.out.println(s);
		
	}
	System.out.println("  ");
	System.out.println("by using each loop");
	
	for(int key:keys)
	{
		System.out.println(key);
		String val=m.get(key);
		System.out.println(val);
	}
	
}

}

