package narrowing__c0ncept;

public class Narrow {
	
	public void m1(Object o)
	{
		System.out.println("m1----Object");
	}
	public void m1(String s)
	{
		System.out.println("m1-----String");
	}
	public void m1(Narrow n)
	{
		System.out.println("gssssss");
	}

}
