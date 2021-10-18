package SynchronizationT;

public class Hello {
	
	public void display(String msg)
	{
		synchronized(this){
		System.out.println("[");
		System.out.println(msg);
		System.out.println("]");
	}

}
}
