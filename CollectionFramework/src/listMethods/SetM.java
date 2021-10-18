package listMethods;

import java.util.*;


public class SetM {
	
	public static void main(String[] args) {
		
	
	List list=new ArrayList();
	list.add("abc");
	list.add("pqr");
	list.add("xyz");
	list.add("aaa");
	list.add("tsp");
	
	list.set(2, "cjc");
	list.set(3, "java");
	
	System.out.println(list);
	
	System.out.println(list.size());
	
	List list1=new ArrayList();
	list1.add("abc");
	list1.add("pqr");
	list1.add("xyz");
	list1.add("aaa");
	list1.add("tsp");
	//list1.add(list);
	list1.addAll(list);
	
	System.out.println(list1);
	

}
}