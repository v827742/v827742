package com.thread.practice;

public class TestNumberGG {
	public static void main(String[] args) {
		
	
	
	NumberGG odd=new NumberGG(1,100);
	odd.setName("odd");
	NumberGG even=new NumberGG(2,100);
	even.setName("even");
	odd.start();
	even.start();
	
	
	}

}
