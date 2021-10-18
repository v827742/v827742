package mapInterface;
import java.util.*;
public class CollegeMap {
	
	public Map m1()
	{
		
	//without genric by using iterators
		
		
		Studentmap sm=new Studentmap();
		sm.setRollno(1);
		sm.setName("Ashish");
		
		Studentmap sm1=new Studentmap();
		sm1.setRollno(2);
		sm1.setName("Rakesh");
		
		List list=new ArrayList();
		list.add(sm);
		list.add(sm1);
		
		Map eng=new HashMap();
		eng.put(1, list);
		eng.put(2, list);
		
		return eng;
	}

	public static void main(String[] args) {
		
	CollegeMap c=new CollegeMap();
	Map k=c.m1();
	
	Set keys=k.keySet();
	System.out.println(keys);
	
Iterator itr=keys.iterator();
while(itr.hasNext())
{
	int x=(int)itr.next();
	
	System.out.println(x);
	
	List l=(List)k.get(x);
	System.out.println(l);
	Iterator itr1=l.iterator();
	while(itr1.hasNext())
	{
		Studentmap s=(Studentmap)itr1.next();
		System.out.println(s.getRollno());
		System.out.println(s.getName());
	}
	
	
	
		
	}
	
	
	}
}
