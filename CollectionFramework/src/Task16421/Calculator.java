package Task16421;
import java.util.*;
public class Calculator {

	public int add()
	{
	   int a=10;
	   int b=20;
	   int c=a+b;
	   //System.out.println(c);
	   return c;
	}
	public int sub()
	{
	   int a=50;
	   int b=20;
	   int c=a-b;
	   //System.out.println(c);
	   return c;
	}
	public int mul()
	{
	   int a=10;
	   int b=20;
	   int c=a*b;
	   
	   return c;
	}
	public int div()
	{
	   int a=100;
	   int b=20;
	   int c=a/b;
	  
	   return c;
	}
	public static void main(String[] args) {
		List l=new ArrayList();
		Calculator c=new Calculator();
		int x=c.add();
		int y=c.sub();
		int q=c.mul();
		int p=c.div();
		
		
		l.add(x);
		l.add(y);
		l.add(q);
		l.add(p);
	
		
		Iterator itr=l.iterator();
		System.out.println("retrieve element");
		while(itr.hasNext())
		{
				int z=(int)itr.next();
				System.out.println(z);
			}
		}
	}

