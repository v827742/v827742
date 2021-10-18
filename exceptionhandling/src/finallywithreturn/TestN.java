package finallywithreturn;

import throwkeyword.NumberClass;
import throwkeyword.ZeroInputException;

public class TestN {
	public static void main(String[] args) {
		System.out.println("main------Start");
		NumberClass n=new NumberClass();
		
		try
		{
			System.out.println("try block start");
			n.getNumber(0);
			System.out.println("try block end");
		}
		catch(ZeroInputException z)
		{
			System.out.println(z.getMessage());
		}
		System.out.println("main    end");
	}

}
