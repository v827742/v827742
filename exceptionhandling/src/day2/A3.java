package day2;

public class A3 {
public void m1()throws ClassNotFoundException
{
	System.out.println("m1----Start");
	B3 b=new B3();
	b.m2();
	System.out.println("m1----end");
}
public static void main(String[] args)throws ClassNotFoundException
{
	System.out.println("main----start");
	A3 a=new A3();
	  a.m1();
	  System.out.println("main---end");
}

}
