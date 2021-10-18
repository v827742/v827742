package Collection;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(5);
		l.add(17);
		l.add(50);
		l.add(5);
		l.add(10);
		
		
		
		Iterator itr=l.iterator();
		
		while(itr.hasNext())
		{
			int x=(int)itr.next();
			System.out.println(x);
		}
		
	}

}
