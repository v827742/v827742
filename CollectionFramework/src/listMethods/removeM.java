package listMethods;

import java.util.ArrayList;
import java.util.List;

public class removeM {
public static void main(String[] args) {
	

	List list=new ArrayList();
	list.add("abc");
	list.add("pqr");
	list.add("xyz");
	list.add("aaa");
	list.add("tsp");
	
	//list.remove(3);
	list.removeAll(list);
	System.out.println(list);
	
}
}