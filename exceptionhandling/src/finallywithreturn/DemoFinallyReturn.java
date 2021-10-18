package finallywithreturn;

public class DemoFinallyReturn {
	public int m1()
	{
		System.out.println("m1----start");
		int x=10;
	
	try{
		System.out.println("try------start");
		return x;
	}
	finally{
		System.out.println("finally block");
	}
}
public static void main(String[] args) {
	System.out.println("star-----main");
	DemoFinallyReturn d=new DemoFinallyReturn();
	int d1=d.m1();
	System.out.println(d1);
}


}
