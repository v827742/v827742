package com.braindata.bankmanagement.serviceImpl;
import java.util.InputMismatchException;
import java.util.regex.*;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.service.Rbi;

public class Sbi implements Rbi{

	Account a=new Account();
	Scanner s1=new Scanner(System.in);
	
	public void createAccount()
	{
		Scanner s=new Scanner(System.in);
		
		
		
	    System.out.println("enter account opening amount");
		double damt=s.nextInt();
		
		
		
		if(damt>=500) {
			
			while(true){
		System.out.println("create Acccount");
		
		
		System.out.println("enter Account Number");
		String t=s.next();
		boolean pattern= t.matches("[1-9][0-9]{1,15}");
		
		if(pattern==true){
		 a.setAccNo(t);
		 break;
		}
		
		else
		{
			System.out.println("enter valid no");
			
		}
		}
		
		
		
		while(true)
		{
		System.out.println("Enter Name");
		String y=s1.next();
		boolean pattern1= y.matches("[A-Z]{1}[a-z]{1,30}");
		if(pattern1==true)
		{
			a.setName(y);
			break;
		}
		else{
			System.out.println("please enter valid name");
		}
		}
		
	
		
	
		while(true){
		
		System.out.println("enter Mobile no");
		String l=s.next();
		boolean pattern3=l.matches("[7-9][0-9]{9}");
		if(pattern3==true)
		{
		a.setMobNo(l);
		break;
		}
		else{
			System.out.println("please enter valid mobile no");
		}
		}
		
		while(true){
		
		System.out.println("enter Age");
		int age=s.nextInt();
		
		if(age>=0&&age<101)
		{
			//System.out.println("please enter valid age in between 1-100 old ");
			a.setAge(age);
			break;
		}
		else{
			System.out.println("please enter valid age in between 1-100 old ");
		}
		}
		
		
		
		while(true){
		
		System.out.println("enter gender");
		String d=s.next();
		boolean pattern2=d.matches("[m]{1}[a]{1}[l]{1}[e]{1}");
		boolean pattern6=d.matches("[f]{1}[e]{1}[m]{1}[a]{1}[l]{1}[e]{1}");
		if( pattern6==true || pattern2==true)
		{
		a.setGender(d);
		break;
		}
		else{
			System.out.println("please enter gender male or female");
		}
		}
		
	
		
		
		while(true){
		
		System.out.println("enter adhar no");
		String l1=s.next();
		boolean pattern4=l1.matches("[1-9]{1}[0-9]{11}");
		if(pattern4==true)
		{
		a.setAdharNo(l1);
		break;
		}
		else{
			System.out.println("please enter correct adharno");
		}
		
		}
		
	
		
		System.out.println("Balance: "+damt);
		System.out.println("Create account Successfuly");
		a.setBalance(damt);
		
		
		
		

	}
			else
			{
				System.out.println("insuficient fund please deposite greater than 500");
				createAccount();
			
			}
	
}
		
	
	public void displayAllDetails()
	{
		Scanner s=new Scanner(System.in);
		
		try{
		System.out.println("Please enter your adhar number");
		String s1=s.next();
		  String  s2=a.getAdharNo();
		
		
		if(s2.equals(s1)) {
			
		System.out.println("Display account details");
		System.out.println("A/c No:"+a.getAccNo());
		System.out.println("Holder name:"+a.getName());
		System.out.println("mobile no:"+a.getMobNo());
		System.out.println("Adhar no:"+a.getAdharNo());
		System.out.println("Age:"+a.getAge());
		System.out.println("gender:"+a.getGender());
		System.out.println("Balance:"+a.getBalance());
	}
		else {
			
			System.out.println("**** data not found****enter correct number or create account");
			//System.out.println("please create account first");
			displayAllDetails();
		
			System.out.println("please crreate Account first");
		}
		
	
	while(true){
		System.out.println("Edit any details click 1 and confirm click 2");
		System.out.println("press 3 for receipt");
		int w=s.nextInt();
		switch(w) {
		case 1:
			System.out.println("Edit Acccount Details");
			System.out.println("enter Account Number");
			int t=s.nextInt();
			System.out.println("Enter Name");
			String y=s.nextLine();
		
			System.out.println("enter Mobile no");
			String l=s.next();
			System.out.println("enter Age");
			int a1=s.nextInt();
			System.out.println("enter gender");
			String d=s.next();
			System.out.println("enter adhar no");
			
				
		
		case 2:
			System.out.println("create account successfully");
	//	}
		//break;
		
		case 3:
			System.out.println("please take a receipt");
			break;
			}
		break;

	}
		}
	catch(InputMismatchException e)
	{
		System.out.println("Alphabets not support please enter Adhar number in number format");
		displayAllDetails();
	}
	}
	
	
	
	
	
	public void depositeMoney()
	{
		
		System.out.println("enter deposite amount multiple of 500/-");
		double v1=s1.nextDouble();
		if(v1>=500)
		{
		System.out.println("old Balance");
		double d1=a.getBalance();
		System.out.println(d1);
		double Bal=v1+d1;
		System.out.println("Current Balance:"+Bal);
		a.setBalance(Bal);
		System.out.println("deposite Money successful ");
		}
		else
		{
			System.out.println("please deposite more than 500/-");
		     depositeMoney();
		     }
		
		
	
	}
	public void withdrawal()
	{
		
		System.out.println("enter withdrawal cash");
		double Amt=s1.nextDouble();
	
		
	System.out.println("old balance");
	double z=a.getBalance();
	System.out.println(z);
		double z2=z-Amt;
	
		if(Amt>=500&&Amt<=25000) { 
	 if(z2>=500)
		{
		System.out.println("Current Balance:"+z2);
		System.out.println(" withdrawal cash Successful");
		a.setBalance(z2);
		}
   else {
	    System.out.println("**insuficient fund or please maintain 500/-***");
	         }}
	 
	else{
		System.out.println(" Withrawal limit is only 25000/-per day."); 
	}
	}
		
	

	public void balanceCheck()
	{
		System.out.println("Available balance");
		double check=a.getBalance();
		System.out.println(check);
		
	}

}


