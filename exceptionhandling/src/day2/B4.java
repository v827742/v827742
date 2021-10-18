package day2;

public class B4 {
	public void m2()throws ClassNotFoundException 
	{
		System.out.println("m2-------start");
		Class.forName("A");
		System.out.println("m2-------end");
	}

}
