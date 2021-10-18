package comcjccjc;

public class loan 
{
	public static void main(String args[])
	{
		BajajFinance b=new BajajFinance("neel there","personal loan",100000,15);
		
		BajajFinance b1=new BajajFinance("ashish wabhitkar","home loan",200000,15);
		
		BajajFinance b2=new BajajFinance("rakesh chaukhe","car loan",300000,14);
		
		BajajFinance b3=new BajajFinance("shivraj gobhekar","crop loan",50000,14);
		
		System.out.println(b.name);
		System.out.println(b.loantype);
		System.out.println(b.amount);
		System.out.println(b.intrest);
		
		
		System.out.println(b1.name);
		System.out.println(b1.loantype);
		System.out.println(b1.amount);
		System.out.println(b1.intrest);
		
		
		System.out.println(b2.name);
		System.out.println(b2.loantype);
		System.out.println(b2.amount);
		System.out.println(b2.intrest);
		
		
		System.out.println(b3.name);
		System.out.println(b3.loantype);
		System.out.println(b3.amount);
		System.out.println(b3.intrest);
		
		
		
		
	}

}
