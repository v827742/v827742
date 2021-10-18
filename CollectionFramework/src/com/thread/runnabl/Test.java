package com.thread.runnabl;

public class Test {

	public static void main(String[] args) {
		MyRunnable mr=new MyRunnable();
		Thread t1=new Thread(mr);
		t1.start();
		for(int i=0;i<100;i++)
		{
			System.out.println("main------");
		}
	}
}
