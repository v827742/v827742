package throwkeyword;

import java.util.Scanner;

public class ScannerA {
	public void div(int a,int b)
	{
		
		if(b==0){
			
			
		throw new CustomException("Not Use input Value of b Is Zero");
	       }
		else{
			int c=a/b;
			System.out.println(c);
	}
	
	}

	public static void main(String[] args) {
	while(true){
		ScannerA s=new ScannerA();
			Scanner sc=new Scanner(System.in);
			System.out.println("enter 1st number a");
			int a=sc.nextInt();
			System.out.println("enter 2st number  b");
			
			int b=sc.nextInt();
			
		
	        try
	        {
	        	s.div(a,b);                                                                                                                                                 
	        }
	        catch(CustomException e){
	        	System.out.println(e.getMessage());
	        }
		
	}
	}
	}
