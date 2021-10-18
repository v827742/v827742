package com.thread.practice;
//singel thread
public class NumberG {
	int start;
	int end;
	
	public  NumberG(int start,int end)
	{
		this.start=start;
		this.end=end;
		
	}
	public void display()
	{
		for(int i=start; i<end;i++)
		{
			System.out.println(i);
			i++;
		    }
		}
}
