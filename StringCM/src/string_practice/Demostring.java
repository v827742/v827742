package string_practice;

public class Demostring {
	
	public static void main(String[] args) {
		
		String s=new String("cjc");
		String s1=new String("pune");
		
		String s2="  CJC  ";
		
	//	System.out.println(s==s1);
//		System.out.println(s.equals(s1));
//		System.out.println(s);
//		System.out.println(s1);
//		System.out.println(s2);
//		
		System.out.println(s.concat(" "+ s1));	
		System.out.println(s.equals(s1));
		
		System.out.println(s.replaceAll(s, s1));
		
		System.out.println(s2.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.charAt(2));
		
		System.out.println(s.hashCode());
		
		System.out.println(s.length());
		System.out.println(s2.trim());
		
		System.out.println(s.indexOf('j'));
		
		System.out.println(s.lastIndexOf('c'));
		
		
	
		
		
		
		
	}

}
