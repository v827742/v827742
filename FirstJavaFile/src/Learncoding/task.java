package Learncoding;

public class task {
public void sum()
{
	float x=20.2f;     //byte<short<int<long<float<double
	float y=20.8f;
	float z=x+y;
	System.out.println(z);
}
		public void sub()
		{
		
          int  i=80;
         long l=20;
         long  j=i-l;
         System.out.println(j);
         
  }
		public void mul()
		{
		double d=50.5;
		float f=40.5f;
		double v=d*f;
		System.out.println(v);
		}
		
		public void div()
		{
			long l=50;
			long l1=5;
			long z=l/l1;
			System.out.println(z);
		}
		
		public static void main(String args[])
		{
			task a=new task();
			a.sum();
			a.sub();
			a.mul();
			a.div();
		}
		


}
