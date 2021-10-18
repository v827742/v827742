package day2;


public class A4 {
	public void m1()throws ClassNotFoundException
	{
		System.out.println("m1----start");
		B4 b=new B4();
		b.m2();
		System.out.println("m1-------end");
	}
public static void main(String[] args) {
	System.out.println("main----start");
	A3 a=new A3();
	
	
	try {
		System.out.println("try    block");
		a.m1();
	} 
	catch (ClassNotFoundException e) {
		System.out.println("catch     Block ");
		System.out.println(e.toString());
	}
	System.out.println("main end");
	}
	
}
