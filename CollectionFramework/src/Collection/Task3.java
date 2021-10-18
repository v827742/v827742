package Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Task3 {
	
	
	public static void main(String args[])
	{

	List<Float> l=new ArrayList<Float>();
	l.add(11f);
	l.add(12.34f);
	l.add(13.34f);
	l.add(14.8f);
	l.add(15.8f);
	l.add(15f);


	Iterator<Float> itr=l.iterator();
	while(itr.hasNext())
	{
	 Float f=(Float)itr.next();
	System.out.println(f);
	}
	}
	}

