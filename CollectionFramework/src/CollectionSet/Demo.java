package CollectionSet;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet(new MyComparator());
		
		t.add("A");
		t.add("B");
		t.add("C");
		t.add("D");
		
		System.out.println(t);
		
		for(String b:t)
		{
			System.out.println(b);
		}
		
	}
}
