package SynchronizationT;

public class TestSMH {
public static void main(String[] args) {
	
	Hello1 h=new Hello1();
	
  MyThreadMS t1=new MyThreadMS(h,"Java");
  MyThreadMS t2=new MyThreadMS(h,"Classes");
  
  t1.start();
  t2.start();
  Hello1 h1=new Hello1();
  MyThreadMS t3=new MyThreadMS(h1,"cjc");
  MyThreadMS t4=new MyThreadMS(h1,"pune");
  
  t3.start();
  t4.start();
  
  
	
}
}
