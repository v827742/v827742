package com.thread.practice;
//multithread
public class NumberGG extends Thread{
	int start,end;
	
	public NumberGG(int start,int end)
	{
		this.start=start;
		this.end=end;
	}
	public void run()
	{
		for(int i=start;i<end;i++)
		{
			System.out.println(i+" "+currentThread().getName());
			i++;
			
			try {
				sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
