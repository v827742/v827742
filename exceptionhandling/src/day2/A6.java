package day2;

public class A6 {
public void m1()
{
	System.out.println(" m1---A6---Start");
	B6 b=new B6();
	try
	{
		System.out.println("try----Start");
		b.m2();
		System.out.println("try---ends");
	}
	
	
	catch(ArithmeticException e)
	{
		System.out.println("catch   block Executed");
	}
	System.out.println("m1----A6---end");
}
public static void main(String[] args) {
	System.out.println("main----Start");
	A6 a=new A6();
	a.m1();
	System.out.println("main-----end");
}
}
