package day2;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class A {
	public void m1()throws FileNotFoundException
	{
		System.out.println("m1  STart");
		m2();
		
	}
	public void m2() throws FileNotFoundException
	{
		System.out.println("m2---start");
		m3();
		
	}
	public void m3()throws FileNotFoundException
	{
		System.out.println("m2---start");
		FileReader f=new FileReader("abc.java");
	}
	public static void main(String[] args) {
		A a=new A();
		
		try{
			a.m1();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("catch block");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}

}
