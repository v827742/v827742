package SynchronizationT;



public class HolloCls {

	public static synchronized void display(String msg)
	{
		//synchronized(HolloCls.class)
			
	  System.out.println("[");
	  
		  try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	  
		System.out.println(msg);
		System.out.println("]");
		
		
			
	
	
}


		
	}
