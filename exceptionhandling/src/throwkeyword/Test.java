package throwkeyword;

public class Test {
	public void m1()
	{
		System.out.println("m1----Start");
		int a=10/0;
		System.out.println("m1----End");
	}
	public static void main(String args[])
	{
		System.out.println("main ----Start");
		Test t=new Test();
		
		try{
		t.m1();
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch block");
		}
		
	}

}
