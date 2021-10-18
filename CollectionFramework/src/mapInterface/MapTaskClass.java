package mapInterface;
import java.util.*;
import java.util.*;

public class MapTaskClass {
	
	public static void main(String[] args) {

		
		
	List mh=new ArrayList();
	mh.add("pune");
	mh.add("mumbai");

	List jh=new ArrayList();
	jh.add("ranchi");
	jh.add("lohardaga");
	jh.add("Bokaro");

	Map<String,List<String>> india=new HashMap<>();
	india.put("Maharashtra",mh);
	india.put("Jharkhand",jh);

	Set keys=india.keySet();

	System.out.println(keys);
Iterator itr=keys.iterator();
while(itr.hasNext())
{
	String state=(String)itr.next();
	System.out.println("State:"+state);
	
	List l=(List)india.get(state);
	Iterator itr1=l.iterator();
	while(itr1.hasNext())
	{
  String s=(String)itr1.next();
  System.out.println("City:"+s);
	
}
}
}}