package SynchronizationT;

public class MyThreadMS extends Thread{
	
	Hello1 h;
	String msg;
	
	public  MyThreadMS(Hello1 h,String msg)
	{
		this.h=h;
		this.msg=msg;
		
	}
		public void run()
		{
			h.display(msg);
		}
	}

