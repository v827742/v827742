package Generic;
import java.util.*;
import java.util.*;


public  class ClassEx {
	
public static void main(String[] args) {
	



List<String> mh=new ArrayList<>();
mh.add("pune");
mh.add("mumbai");

List<String> jh=new ArrayList<>();
jh.add("ranchi");
jh.add("lohardaga");
jh.add("Bokaro");

Map<String,List<String>> india=new HashMap<>();
india.put("Maharashtra",mh);
india.put("Jharkhand",jh);

Set<String> keys=india.keySet();

System.out.println(keys);

for(String key:keys)
{
System.out.println(key);

List<String>List=india.get(key);

for(String city:List)
{

System.out.println(city);
}
}

Iterator<String>itr=keys.iterator();


while(itr.hasNext())
{
	String list=itr.next();
	System.out.println(list);
	
	List<String> list1=india.get(list);
	System.out.println(list1);
	Iterator <String>itr1=list1.iterator();
	while(itr1.hasNext())
	{
		String s=itr1.next();
		System.out.println(s);
	}
}
}
}



