package Collection;


import java.util.*;

public class Task1 {
	public static void main(String[] args) {
		
		List l=new ArrayList();
		
		l.add("Ashish");
		l.add("Abc");
		l.add("CBZ");
		l.add("XYZ");
		l.add("Abc");
		l.add("Qpr");
		
		String s=(String)l.get(4);
		System.out.println(s);
	}

}
