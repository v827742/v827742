package com.thread.runnabl;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer>{

	int st;
	int end;
	int s;
	public MyCallable(int st,int end)
	{
	this.st=st;
	this.end=end;
	}
	public Integer call() throws Exception
	{
		for(int i=st;i<end;i++)
		{
			s=s+i;
			System.out.println("callable:"+"***:"+i);
			i++;
		}
		
		
		return s;
	}

}
