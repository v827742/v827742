package SynchronizationT;

public class TestCls {
	public static void main(String[] args) {
		
	
	
	HolloCls h=new HolloCls();
	
	MyThreadCls t1=new MyThreadCls(h,"java");
	MyThreadCls t2=new MyThreadCls(h,"classes");

	HolloCls h1=new HolloCls();
	MyThreadCls t3=new MyThreadCls(h1,"cjc");
	MyThreadCls t4=new MyThreadCls(h1,"pune");
	
	t1.start();
	t2.start();
	t3.start();
	t4.start();

}
}