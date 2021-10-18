package com.thread.runnabl;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestC {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		MyCallable odd=new MyCallable(1,10);
		MyCallable even=new MyCallable(2,10);
		
		MyCallable odd1=new MyCallable(1,20);
		MyCallable even2=new MyCallable(2,20);
		
		
		ExecutorService executers=Executors.newFixedThreadPool(1); 
		
		Future fr1=executers.submit(odd);
		Future fr2=executers.submit(even);
		Future fr3=executers.submit(odd1);
		Future fr4=executers.submit(even2);
		
		
		System.out.println(fr1.get());
		System.out.println(fr2.get());
		
		System.out.println(fr3.get());
		System.out.println(fr4.get());
		
	}

}
