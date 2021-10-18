package mapInterface;



import java.util.*;
public class WorldMSLS
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

Set india=new HashSet();
india.add(mh);
india.add(mp);


Set japan=new HashSet();
japan.add(state1);
japan.add(state2);

Map  world=new HashMap();
world.put("india",india);
world.put("japan",japan);


Set keys=world.keySet();
System.out.println(keys);

Iterator itr=keys.iterator();
while(itr.hasNext())
{
String count=(String)itr.next();
System.out.println(count);
Set count1=(Set)world.get(count);

Iterator itr1=count1.iterator();
while(itr1.hasNext())
{

List state=(List)itr1.next();

Iterator itr2=state.iterator();
while(itr2.hasNext())
{
String city=(String)itr2.next();

System.out.println(city);
  }
}
 }
}
}




