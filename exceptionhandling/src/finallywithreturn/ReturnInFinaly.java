package finallywithreturn;

public class ReturnInFinaly {

	
	public int m1()
	{
		System.out.println("start------m1");
		int a=10;
		try{
			System.out.println("Start ------try");
			
		      return a;
		      
		}
		finally{
		 a=50;
			System.out.println("finally    start");
			return a;
			
		}
	}
	public static void main(String[] args) {
		System.out.println("start     mains");
		ReturnInFinaly r=new ReturnInFinaly();
	int s=r.m1();
	System.out.println(s);
		
	}
}
