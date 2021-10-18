package looptask5421;

public class trianglepattern {
	public static void main(String[] args) {
		
		
		
		for(int a=5;a>=1;a--)
		{
			for(int b=1;b<=a;b++)
			{
				System.out.print(" ");
			}
			for(int c=5;c>=a;c--)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
     
	System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	
	
	for(int i=5;i>=1;i--)
	{      
		int g=1;
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(int k=5;k>=i;k--)
		{
			System.out.print(g+" ");
			g++;
		}
		System.out.println();
		
	}
	
System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	
	
	for(int i=5;i>=1;i--)
	{      
		char g='A';
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(int k=5;k>=i;k--)
		{
			System.out.print(g+" ");
			g++;
		}
		System.out.println();
		
	}
	
	
System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	
      
	for(int i=1;i<=5;i++)
	{      
		
		
		for(int j=5;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print(i+" ");
			
		}
		System.out.println();
	
	}
	
	
	
	System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	
	
	
	for(char i='A';i<='E';i++)
	{      
		
		for(char j='E';j>=i;j--)
			{
			System.out.print(" " );
		}
		for(char k='A';k<=i;k++)
		{
			System.out.print(i+" ");
			
		}
		System.out.println();
	
	}
	
	
	for(int i=1;i<=9;i++)
	{      
		
		for(int j=9;j>=i;j--)
			{
			System.out.print(" " );
		}
		
		for(int k=1;k<=i;k++)
		{     
			System.out.print(k+" ");
			
		}
		System.out.println();
	
	}
	
	
	
	
	
	}
	
	
	

}
