package SynchronizationT;

public class MyThreadCls extends Thread{
	
	HolloCls h;
	String msg;
	
	public MyThreadCls(HolloCls h,String msg)
	{
		this. h=h;
		this.msg=msg;
		
	}
	public void run()
	{
		h.display(msg);
	}
}
