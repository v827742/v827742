package static_and_non_static;

public class DemoStaticBlock {
	
	static
	{
		System.out.println("static block");
	}
    
	public static void main(String[] args) {
		
		System.out.println("main method");
	}
}
