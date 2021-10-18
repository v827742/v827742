package day2;

public class A5 {
	public void m1()//throws NullPointerException
	{
		System.out.println("m1----start");
		B5 b=new B5();
		b.m2();
		System.out.println("m1-------end");
		
		
	}

	public static void main(String[] args) {
		System.out.println("main-------start");
		A5 a=new A5();
		try
		{
			System.out.println("try block start");
			a.m1();
			 System.out.println("try block end");
			 }
		catch(NullPointerException e)
		{
			System.out.println("catch block execute");
		}
		System.out.println("main-----end");

	}

}
