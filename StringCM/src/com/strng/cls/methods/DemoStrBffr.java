package com.strng.cls.methods;

public class DemoStrBffr {
	public static void main(String[] args) {
		
	
    StringBuffer s=new StringBuffer("abc");
    System.out.println(s.append("pqr"));
    
    System.out.println(s.substring(2));
   // System.out.println(s.capacity());
    
    System.out.println(s.charAt(5));
    
    System.out.println(s.indexOf("p"));
    System.out.println(s.indexOf("q", 0));
    
    System.out.println(s.lastIndexOf("c"));
    
    //System.out.println(s.delete(0, 4));
    
    //System.out.println(s.deleteCharAt(3));
    
    s.ensureCapacity(6);
    System.out.println(s);
    System.out.println(s.capacity());
    
    System.out.println(s.insert(2, 'd'));
    
    System.out.println(s.indexOf("bd"));
    
    System.out.println(s.indexOf("d", 1));
    System.out.println(s.reverse());
    
    
	}
}
