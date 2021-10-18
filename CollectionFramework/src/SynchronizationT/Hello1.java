package SynchronizationT;

public class Hello1 {

	public synchronized void display(String msg)
	{
		
		System.out.println("[");
		System.out.println(msg);
		System.out.println("]");
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
}
