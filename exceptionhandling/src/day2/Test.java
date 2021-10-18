package day2;

public class Test {
public static void main(String[] args) {
	System.out.println("main        start");
	C8 c=new C8();
	try
	{
		System.out.println("Try---block");
		c.m6();
		
	}
	catch(ArithmeticException e)
	{
		System.out.println("catch-----block-----Executed");
	}
	System.out.println("main end");
}
}
