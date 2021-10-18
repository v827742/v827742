package throwkeyword;

public class VotingClass {
	public void voting( int age )throws PersonAgeException
	{    
		System.out.println("voting Start");
		if(age<=18)
		{
			 PersonAgeException e=new PersonAgeException("Not Eligible For Voting");
			 throw e;
		}
		else
		{
			System.out.println("Welcome to voting ");
		}
	}
public static void main(String[] args) {
	System.out.println("Start----main");
	VotingClass v=new VotingClass();
	
	  try{
		  System.out.println("try block Start");
	  v.voting(15);
	  System.out.println("try block end");
	  }
	  catch(PersonAgeException p)
	  {
		  System.out.println("you are"+p.getMessage());
	  }
	System.out.println("main end");
}
}
