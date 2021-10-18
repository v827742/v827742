package mapInterface;


import java.util.*;

public class World1G
{
public static void main(String args[])
{

List<String> mh=new ArrayList<String>();
mh.add("pune");
mh.add("mumbai");

List<String> mp=new ArrayList<String>();
mp.add("indore");
mp.add("bhopal");

List<String> state1=new ArrayList<String>();
state1.add("city1");
state1.add("city2");

List<String> state2=new ArrayList<String>();
state2.add("city3");
state2.add("city4");

Map<String, List<String>> india=new HashMap<>();
india.put("maharashtra",mh);
india.put("madhyapradesh",mp);


Map<String, List<String>> japan=new HashMap<>();
japan.put("tokyo",state1);
japan.put("hiroshima",state2);

Map<String, Map<String, List<String>>>  world=new HashMap<>();
world.put("country1",india);
world.put("country2",japan);

Set<String> keys=world.keySet();
System.out.println(keys);


Iterator<String> itr=keys.iterator();
while(itr.hasNext())
{

String s=itr.next();
System.out.println(s);

Map<String, List<String>> ma=world.get(s);
//System.out.println(ma);

Set<String> key1=ma.keySet();
//System.out.println(key1);


Iterator<String> itr1=key1.iterator();
while(itr1.hasNext())
{
   String l=(String)itr1.next();
System.out.println(l);

List<String> l1=ma.get(l);
//System.out.println(l1);
Iterator<String> itr2=l1.iterator();
while(itr2.hasNext())
{
	String city=itr2.next();
	System.out.println(city);
}

}
System.out.println("     ");
System.out.println("by using for each loop");

for(String key:keys)
{
	System.out.println(key);
	
	Map<String,List<String>> m=world.get(key);
	
	Set<String>se=m.keySet();
	for(String state:se)
	{
		List<String> list=m.get(state);	
		for(String city:list)
		{
			System.out.println(city);
		}
}

}


}

}}


















