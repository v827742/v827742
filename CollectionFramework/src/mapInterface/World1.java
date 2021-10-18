package mapInterface;

import java.util.*;

public class World1 
{
public static void main(String args[])
{

List mh=new ArrayList();
mh.add("pune");
mh.add("mumbai");

List mp=new ArrayList();
mp.add("indore");
mp.add("bhopal");

List state1=new ArrayList();
state1.add("city1");
state1.add("city2");

List state2=new ArrayList();
state2.add("city3");
state2.add("city4");

Map india=new HashMap();
india.put("maharashtra",mh);
india.put("madhyapradesh",mp);


Map japan=new HashMap();
japan.put("tokyo",state1);
japan.put("hiroshima",state2);

Map  world=new HashMap();
world.put("country1",india);
world.put("country2",japan);

Set keys=world.keySet();
System.out.println(keys);


Iterator itr=keys.iterator();
while(itr.hasNext())
{

String s=(String)itr.next();
System.out.println(s);

Map ma=(Map)world.get(s);
//System.out.println(ma);

Set key1=ma.keySet();
//System.out.println(key1);


Iterator itr1=key1.iterator();
while(itr1.hasNext())
{
   String l=(String)itr1.next();
System.out.println(l);

List l1=(List)ma.get(l);
System.out.println(l1);
Iterator itr2=l1.iterator();
while(itr2.hasNext())
{
	String city=(String)itr2.next();
	System.out.println(city);
}

}
}


}

}

















