package CollectionSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Demo1 {

	public static void main(String[] args) {
		
		TreeSet t=new TreeSet();
		t.add("A");
		t.add("Z");
		t.add("B");
		t.add("A");
		
		System.out.println(t);
		
		Iterator itr=t.iterator();
		while(itr.hasNext())
		{
			String s=(String)itr.next();
			System.out.println(s);
		}
		
	}
}
