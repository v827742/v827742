package superandthis_keywords;

public class Pmt extends Cmt{
	
	public void m1()
	{
	super.m3();
		System.out.println(" pmt--m1");
		
	}
	
	public void m2()
	{
		this.m1();
		System.out.println("pmt----m2");
		
	}

}
