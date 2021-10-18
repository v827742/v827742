package day2;

public class A7 {
	public void m1()
	{
		System.out.println("m1----A7---Start");
		B7 b=new B7();
		b.m2();
		System.out.println("m1----A7----End");
	}
public static void main(String[] args) {
	System.out.println("main      Start");
	 A7 a=new A7();
	 try
	 {
		 System.out.println("try    block    Start");
		 a.m1();
		 System.out.println("try    block    End");
	 }
	 catch(ArithmeticException e)
	 {
		 System.out.println("catch-------block");
	 }
	 
	 System.out.println("main     End");
}
}
