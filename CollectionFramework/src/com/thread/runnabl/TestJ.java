package com.thread.runnabl;

public class TestJ {

public static void main(String[] args) throws InterruptedException {
	MyRunnable mr=new MyRunnable();
	Thread t1=new Thread(mr);
	
	for(int i=0;i<5;i++)
		System.out.println("main-------start");
	
	t1.start();
	t1.join(1000,5000);
	
	for(int i=0;i<5;i++)
		
		System.out.println("main-------end");
}
}
