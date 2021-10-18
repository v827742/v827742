package supper_this_variable;

public class Cvariable extends Pvariable{
	
	int y=10;
	
	public void m1()
	{
		int c=30;
		
		System.out.println(c);//30
		System.out.println(this.y);//10
		System.out.println(super.y);//20
	}
	

}
