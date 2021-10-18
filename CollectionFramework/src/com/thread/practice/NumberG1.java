package com.thread.practice;

public class NumberG1 implements Runnable{

	int st;
	int end;
	
	public NumberG1(int st,int end)
	{
		this.st=st;
		this.end=end;
	}
		
	public void run()
		{
			for(int i=st;i<end;i++)
			{
				System.out.println(i);
				i++;
			
		}
	}

public static void main(String[] args) {
	
 NumberG1 odd=new NumberG1(1,100);
 
 odd.run();
 NumberG1 even=new NumberG1(2,100);
 even.run();
}
}
