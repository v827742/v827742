package Learncoding;

public class B {
	int a=100;
	int b=150;
	
		public void sum()
		{
			int c=a+b;
			System.out.println(c);
		}
		public void sub()
		{
			int c=b-a;
			System.out.println(c);
		}
		
		public void mul()
		{
			int c=b*a;
			System.out.println(c);
		}
		public void div()
		{
			int c=b/a;
			System.out.println(c);
		}
			
		public static void main(String args [])	
		{
			B b=new B();
			b.sum();
			b.sub();
			b.mul();
			b.div();
			
		}
			
			
	}


