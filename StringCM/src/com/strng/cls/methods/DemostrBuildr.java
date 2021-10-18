package com.strng.cls.methods;

public class DemostrBuildr {
	public static void main(String[] args) {
		
		
		StringBuilder sb=new StringBuilder("corejava");
		StringBuilder sb1=new StringBuilder("cjc");
		sb.append("Classes");
		System.out.println(sb);
		
		sb.delete(0,4 );
		System.out.println(sb);
	sb.append('v');
		System.out.println(sb);
		sb.append("Str");
		System.out.println(sb);
		sb.append(sb1);
		System.out.println(sb);
		
		sb.append(20.02);
		System.out.println(sb);
		
		//System.out.println(sb.substring(0,5));
		System.out.println(sb.substring(4, 6));
		
		System.out.println(sb.toString());
		
		System.out.println(sb1.capacity());
		System.out.println(sb.charAt(5));
		System.out.println(sb.indexOf("sv"));
		System.out.println(sb.indexOf("Cla"));
		System.out.println(sb.indexOf("Cla", 1));
		System.out.println(sb.lastIndexOf("Str", 17));
		System.out.println(sb.delete(0, 4));
		System.out.println(sb.insert(0, "Abc"));
		System.out.println(sb.reverse());
		
		
	}

}
