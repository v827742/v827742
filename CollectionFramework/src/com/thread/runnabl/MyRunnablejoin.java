package com.thread.runnabl;

public class MyRunnablejoin implements Runnable{

	@Override
	public void run() {
	    
		for(int i=1;i<100;i++)
		{
			System.out.println("myrunnable---");
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	

}
