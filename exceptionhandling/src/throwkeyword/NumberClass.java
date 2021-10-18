package throwkeyword;



public class NumberClass {
	
	public void getNumber(int i)throws ZeroInputException
	{
		
			
	
	
		System.out.println("getNumber ------Start");
	 if(i==0)
		{
			throw new  ZeroInputException("zero number input");
		} 
		System.out.println("getNumber     end");
		
	}
		
	}
	
