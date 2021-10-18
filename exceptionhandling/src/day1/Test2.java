package day1;

public class Test2 {
	public static void main(String[] args) {
		try{
			System.out.println("try-----starts");
			double x=10/0;
			System.out.println("try---end");
		}
	    catch(ArithmeticException e){
	    	System.out.println("catch-------block");
	    }
		finally
		{
			System.out.println("finally---block");
		}
		System.out.println("main-----End");
	}

}
