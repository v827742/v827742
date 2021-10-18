package day1;

public class A {
	public static void main(String[] args) {
		System.out.println("main---Start");
		
		A a=null;
		
		try{
		System.out.println(a.toString());
		}
        catch(RuntimeException e)
		{
        	System.out.println("ashish");
		}
		
		System.out.println("main ------End");
	}

}
