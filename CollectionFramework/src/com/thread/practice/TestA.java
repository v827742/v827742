package com.thread.practice;

public class TestA {

	public static void main(String args[])
	{
		B b=new B();
		b.setName("first");
		b.start();
		
		B b1=new B();
		b1.setName("Second");
		b1.start();
		
		
		
	}
	
	
	
	
}
