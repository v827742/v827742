package finalkeyword;

public class Avariable {
	
	final int a=10;
	
	public void m1()
	{
		a=20;
		
	}
public static void main(String[] args) {
	
	Avariable a=new Avariable();
	
	a.m1();
}
}
