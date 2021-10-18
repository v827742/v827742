package day2;

public class A8 {
	public void m1()
	{
		System.out.println("m1--------A8-----start"); 
		int a=10/0;
		System.out.println("m1-------A8----End");
	}
public void m2()
{
	System.out.println("m2-------A8----Start");
	m1();
	System.out.println("m2-------A8----End");
}
public void m3()
{
	System.out.println("m3-----Start");
	m2();
	System.out.println("m3-------end");
}
}
