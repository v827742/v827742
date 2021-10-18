package mapInterface;

import java.util.*;

public class Demomap {
	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<>();
		
		m.put(5,"java");
		m.put(10,"python");
		m.put(15,"Spring");

		     Set<Integer> keys=m.keySet();
		     System.out.println(keys);
		     
		     for(int key:keys)
		     {
		    	 System.out.println(key);
		    	 
		    	 String val=m.get(key);
		    	 System.out.println(val);
		    	 
		     }
		
	}

}
