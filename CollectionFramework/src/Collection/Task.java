package Collection;


import java.util.*;

public class Task {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(5);
		l.add(17);
		l.add(50);
		l.add(5);
		l.add("abc");
		int x=(int)l.get(0);
		System.out.println(x);
		String s=(String)l.get(4);
		System.out.println(s);
		
		
	}

}
