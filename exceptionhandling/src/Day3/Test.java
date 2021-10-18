package Day3;

public class Test extends Task 
	{
	//first scenario for unchecked
	@Override
	public void m1()
	{
	System.out.println("m1----1st---Exception not throws");
	}
	//2nd scenario for unchecked
	@Override
	public void m3()throws ArithmeticException
	{
	System.out.println("m3---2st---Arithmetc");
	}
	//3rd scenario for unchecked
	@Override
	public void m5()throws ArithmeticException
	{
	System.out.println("m5---3st---Arithmetic");

	}
	 //4th scenario for unchecked
	@Override
	public void m7()throws  ArithmeticException
	{
	System.out.println("m7---4st---Arithmetic");

	}
	//5th scenario for unchecked
	@Override
	public void m9()throws Exception  //ArithmeticException 
	{
	System.out.println("m9---5st---Exception");
	}
	public static void main(String[] args) {
		Test t=new Test();
		t.m1();
		t.m3();
		t.m5();
		t.m7();
		t.m9();
	}
	
}
	






