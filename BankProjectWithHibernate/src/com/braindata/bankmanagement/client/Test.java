package com.braindata.bankmanagement.client;


import java.util.Scanner;


import com.braindata.bankmanagement.service.Rbi;
import com.braindata.bankmanagement.serviceImpl.Sbi;


public class Test {
	public static void main(String[] args) {
		Rbi bank=new Sbi();
		Scanner sc = new Scanner(System.in);
		
       while(true)
       {
    	   System.out.println("click 1 for create Account");
    	   System.out.println("click 2 for display all details");
    	   System.out.println("click 3 for Diposite money");
    	   System.out.println("click 4 for Withdrawal Money");
    	   System.out.println("click 5 for check  Account Balance");
    	   System.out.println("Click 6 for Exit ");
    	   System.out.println("Enter Number ");
    	   	
    	    int z=sc.nextInt();
    	  
	   
    	

    	    switch(z)
	    {
    	 
	    case 1:
	    
	    	bank.createAccount();
	    	break;
	    case 2:
	    	//System.out.println("Account All Details");
	    	bank.displayAllDetails();
	    	break;
	    case 3:
	    	//System.out.println("Account All Details");
	    	bank.depositeMoney();
	    	break;
	    case 4:
	    	//System.out.println("withdrawal money");
	    	bank.withdrawal();
	    	break;
	    case 5:
	    	//System.out.println("balance check");
	    	bank.balanceCheck();
	    	break;
	    
	    case 6:
	    
	    	System.out.println("Exit");
	    	System.exit(0);
	    	
	    	break;
	    	default:
	    		System.out.println("no data fount");
	    		break;
	    }
    	 
       }
    	 
    	 
	    } 
   	 
}


       




