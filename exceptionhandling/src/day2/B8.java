package day2;

public class B8 {
	public void m4()
	{
		System.out.println("m4----start");
		A8 a=new A8();
		a.m3();
		System.out.println("m4------end");
	}
public void m5()
{
	System.out.println("m5--------start");
	m4();
	System.out.println("m5---------end");
}
}
