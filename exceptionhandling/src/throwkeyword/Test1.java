package throwkeyword;

public class Test1 {
	public void m1(int age)
	{
		System.out.println("m1-----Start");
		if(age<0)
		{
			ArithmeticException e=new ArithmeticException("Age-Problem");
			throw e;
		}
		System.out.println("m1-----End");
	}
public static void main(String[] args) {
	System.out.println("main-----Start");
	Test1 t=new Test1();
	
		try{
			t.m1(-5);
			}
		catch(ArithmeticException e)
		{
			System.out.println("catch block "+e.getMessage());
	}
}
}
