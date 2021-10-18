package Cont_thiskey;

public class B extends A{
	
	public B()
	{
		this(10);
		System.out.println("Constructor -----B");
		
	}
	public B(int i)
	{
		this("abc");
		System.out.println(" Constructor------B--Integere");
	}

     public B(String s) {
	
	System.out.println("Constructor-----B--String");
}	
}
