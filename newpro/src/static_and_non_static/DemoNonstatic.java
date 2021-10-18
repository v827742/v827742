package static_and_non_static;

public class DemoNonstatic {
	
	{
		System.out.println("1 st non Static block");
	}
	{
		System.out.println("2 st non Static block");
	}
	{
		System.out.println("3 st non Static block");
	}
	
	public DemoNonstatic()
	{
		System.out.println("execute constructor");
	}
	
	public static void main(String[] args) {
		
		DemoNonstatic dn=new DemoNonstatic();
		
		DemoNonstatic dn1=new DemoNonstatic();
		
	}

}
