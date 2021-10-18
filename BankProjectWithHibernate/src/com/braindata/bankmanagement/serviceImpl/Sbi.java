package com.braindata.bankmanagement.serviceImpl;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.regex.*;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.model.Sbibank;
import com.braindata.bankmanagement.service.Rbi;
import com.braindatawire.institutemanagement_system.config.HibernateUtil;


public class Sbi implements Rbi{

	Account a=new Account();
	
	Scanner s=new Scanner(System.in);
	
	public void createAccount()
	{
		Session ss=HibernateUtil.getsessionFactory().openSession();
		Account a=new Account();
		//Scanner s=new Scanner(System.in);
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
		String y=s.next();
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
		Sbibank sbi=new Sbibank();
		sbi.setIfsc_code(1717);
		sbi.setBname("STATE BANK OF INDIA");
		sbi.setBranchname("AKURDI PUNE");
		
		a.setSb(sbi);
		ss.save(a);
		ss.beginTransaction().commit();
		}
			else
			{
				System.out.println("insuficient fund please deposite greater than 500");
				createAccount();
			
			}
		
		
		
			
			
}
	

		
	
	public void displayAllDetails()
	{
		//Scanner s=new Scanner(System.in);
		  Session ss=HibernateUtil.getsessionFactory().openSession();
		  System.out.println("Enter Account no");
		  String ac=s.next();
		  Account sbi=ss.get(Account.class, ac);
		 
		     // Account acc=ss.get(Account.class, sbi.getIfsc_code());

	 System.out.println("ACCOUNT NO: "+sbi.getAccNo());
	 System.out.println("ACCOUNT HOLDER NAME: "+sbi.getName());
	 System.out.println(" ADHAR-NO: "+sbi.getAdharNo());
	 System.out.println(" MOBILE NO: "+sbi.getMobNo());
	 System.out.println(" AGE : "+sbi.getAge());
	 System.out.println("GENDER : "+sbi.getGender());
	 System.out.println("BALANCE: "+sbi.getBalance());
	 System.out.println(sbi.getSb().getIfsc_code());
	 System.out.println(sbi.getSb().getBname());
	 System.out.println(sbi.getSb().getBranchname());
	}
	
	
	
	
	
	public void depositeMoney()
	{
	
		System.out.println("enter deposite amount multiple of 500/-");
		double v1=s.nextDouble();
		
		if(v1>=500)
		{
		
		Session ss=HibernateUtil.getsessionFactory().openSession();
		System.out.println(" enter Account no");
		String Accno=s.next();
		double b=0;
		 Account sbi=ss.get(Account.class,Accno );
		   b=sbi.getBalance();
			
					if(Accno==sbi.getAccNo())
					{
					
			
				double d=v1+b;
			
				
				System.out.println("current balance: "+d);
				sbi.setBalance(d);
				ss.update(sbi);
				ss.beginTransaction().commit();
			
			}
		else
		{
			System.out.println("please deposite more than 500/-");
		     depositeMoney();
		     }
		
	}
	
	}
	
	
	public void withdrawal()
	{
	
		System.out.println("enter withdrawal cash");
		double Amt=s.nextDouble();
		
		if(Amt>=500&&Amt<=25000) { 
	 if(Amt>=500)
		{
		 Session ss=HibernateUtil.getsessionFactory().openSession();

		System.out.println(" enter Account no");
		String Accno=s.next();
		 Account sbi=ss.get(Account.class, Accno );
		 double bal=sbi.getBalance();
						
		 if(Accno==sbi.getAccNo())
						{
						
					Double updtbal=bal-Amt;
					System.out.println("Remaing balance: "+updtbal);
					sbi.setBalance(updtbal);
					ss.update(sbi);
					ss.beginTransaction().commit();
		}
   else {
	    System.out.println("**insuficient fund or please maintain 500/-***");
	         }}
	 
	else{
		System.out.println(" Withrawal limit is only 25000/-per day."); 
	}
	}
		
	}

	public void balanceCheck()
	{

		System.out.println("Enetr account no for balance details");
		String accno=s.next();
		 
		Session ss=HibernateUtil.getsessionFactory().openSession();
		Account sbi=ss.get(Account.class, accno );
		
				if(accno==sbi.getAccNo())
				{
				System.out.println("Account Balance: "+sbi.getBalance());
				
				
			}
			}
		
		
		
		
		
		
		
	}




