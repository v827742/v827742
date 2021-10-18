package day1;

public class B {
	public static void main(String args[])
	{
		A a=null;
		System.out.println("main-----Start");
		try{
			System.out.println("try -----start");
			System.out.println(a.toString());
			System.out.println("Try--------------End");
		}
		catch(NullPointerException e){
			System.out.println("catch ------block");
		}
		System.out.println("main---end");
	}

}
