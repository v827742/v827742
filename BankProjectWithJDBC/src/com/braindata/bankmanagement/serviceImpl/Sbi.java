package com.braindata.bankmanagement.serviceImpl;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.regex.*;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.service.Rbi;
import com.braindatawire.institutemanagement_system.config.DaoUtil;

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
		
		
		Connection con=DaoUtil.getConnection();
		try{
			Statement st=con.createStatement();
			
			String sql="insert into xyzbank values("+a.getAccNo()+",'"+a.getName()+"','"+a.getMobNo()+"'"
					+ ",'"+a.getAdharNo()+"','"+a.getGender()+"','"+a.getAge()+"','"+a.getBalance()+"')";
			
		st.execute(sql);
		st.close();
		con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
			
}
	

		
	
	public void displayAllDetails()
	{
		Scanner s=new Scanner(System.in);
		
		try{
		System.out.println(" For account details Please enter your acount number");
		
		 int accno=s.nextInt();
	    Connection con=DaoUtil.getConnection();
	    Statement smt=con.createStatement();
	    
	    String sql="select * from xyzbank where AccountNo='"+accno+"'  ";
		ResultSet rs=smt.executeQuery(sql);
		while(rs.next())
		{
		if(rs.getInt(1)==accno) 
		{
			
		System.out.println("Display account details");
		System.out.println("A/c No:"+rs.getInt(1));
		System.out.println("Holder name:"+rs.getString(2));
		System.out.println("mobile no:"+rs.getLong(3));
		System.out.println("Adhar no:"+rs.getString(4));
		System.out.println("Age:"+rs.getString(5));
		System.out.println("gender:"+rs.getInt(6));
		System.out.println("Balance:"+rs.getDouble(7));
	}
else {
			
			System.out.println("**** data not found****enter correct number or create account");
			//System.out.println("please create account first");
			displayAllDetails();
		}
		
		
		
		}	
		}
	catch(InputMismatchException | SQLException e)
	{
		System.out.println(e.getMessage());
		
		System.out.println("Alphabets not support please enter Adhar number in number format");
		displayAllDetails();
	}
	}
	
	
	
	
	
	public void depositeMoney()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter deposite amount multiple of 500/-");
		double v1=s1.nextDouble();
		if(v1>=500)
		{
		
		Connection con=DaoUtil.getConnection();
		
		System.out.println(" enter Account no");
		int Accno=sc.nextInt();
			try {
				 
				Statement smt=con.createStatement();
				String s="select * from xyzbank where AccountNo="+Accno+"";
 				
				ResultSet rs=smt.executeQuery(s);
				while(rs.next())
				{
					if(Accno==rs.getInt(1))
					{
					System.out.println("Account Number: "+rs.getInt(1));
					System.out.println("Available Balance: "+rs.getDouble(7));
					break;
					}
					
					}
				Statement smt1=con.createStatement();
				double d=v1+rs.getDouble(7);
				String sql="update xyzbank set balance="+d+" where AccountNo="+Accno+"";
				smt1.executeUpdate(sql);
				System.out.println("current balance: "+d);
				smt1.close();
				smt.close();
				con.close();
				
			} catch (SQLException e1) {
			
				e1.printStackTrace();
			}
			}
		else
		{
			System.out.println("please deposite more than 500/-");
		     depositeMoney();
		     }
		
	}
	
	
	
	
	public void withdrawal()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter withdrawal cash");
		double Amt=s1.nextDouble();
	
		if(Amt>=500&&Amt<=25000) { 
	 if(Amt>=500)
		{
		
		System.out.println(" enter Account no");
		int Accno=sc.nextInt();
			try {
				 Connection con=DaoUtil.getConnection();
					Statement smt=con.createStatement();
					String s="select * from xyzbank where AccountNo="+Accno+"";
	 				
					ResultSet rs=smt.executeQuery(s);
					while(rs.next())
					{
						if(Accno==rs.getInt(1))
						{
						System.out.println("Account No: "+rs.getInt(1));
						System.out.println("current balance: " +rs.getDouble(7));
					
					Double updtbal=rs.getDouble(7)-Amt;
					System.out.println("Remaing balance: "+updtbal);
					
					break;
					}
					
					}
				Statement smt1=con.createStatement();
				double d=rs.getDouble(7)-Amt;
				String sql="update xyzbank set balance="+d+" where AccountNo="+Accno+"";
				smt1.executeUpdate(sql);
				smt1.close();
				smt.close();
				con.close();
				
			} catch (SQLException e1) {
			
				e1.printStackTrace();
			}
		
		
		
		
		
		
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
	Scanner sc=new Scanner(System.in);	
		System.out.println("Enetr account no for balance details");
		int accno=sc.nextInt();
		
		Connection co=DaoUtil.getConnection();
		try {
			Statement smt=co.createStatement();
			String sql="select * from xyzbank where AccountNo="+accno+" ";
			ResultSet rs=smt.executeQuery(sql);
			while(rs.next())
			{
				if(accno==rs.getInt(1))
				{
				System.out.println("Account Number: "+rs.getInt(1));
				System.out.println("Available Balance: "+rs.getDouble(7));
			
				break;
			}
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}


