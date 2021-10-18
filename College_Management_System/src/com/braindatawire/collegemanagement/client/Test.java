package com.braindatawire.collegemanagement.client;

import java.util.Scanner;

import com.braindatawire.collegemanagement.service.Cjc;
import com.braindatawire.collegemanagement.serviceImpl.Karvenagar;

public class Test {
	
	public static void main( String[] args) {
		Cjc kar=new Karvenagar();
		
		
				while(true)
		{
					Scanner sc=new Scanner(System.in);
					
					System.out.println("****COLLEGE****MANAGEMENT****SYSTEM****");
					System.out.println("enter 1 for Add course details");
					System.out.println("enter 2 for view Course details");
					System.out.println("enter 3 for Add Faculty details");
					System.out.println("enter 4 for view View Faculty details");
					System.out.println("enter 5 for Add Batch details");
					System.out.println("enter 6 for view Batch details");
					System.out.println("enter 7 for Add Student details");
					System.out.println("enter 8 for view Student details");
					System.out.println("enter 9 for Exits");
					System.out.println("*************************************");
					System.out.println("ENTER WHAT YOU WANT");


					int ch=sc.nextInt();

		switch(ch)
		{
		case 1:
		
			kar.addCourse();
			break;
		
		case 2:
		
			kar.viewCourse();
			break;
		
		case 3:
		
			kar.addFaculty();
			break;
		
		case 4:
		
			kar.viewFaculty();
			break;
		case 5:
			kar.addBatch();
			break;
		case 6:
			kar.viewBatch();
			break;
		case 7:
			kar.addStudent();
			break;
		case 8:
			kar.viewStudent();
			break;
		case 9:
		
			System.exit(0);
			break;
		default:
		
			System.out.println("please enter correct input no");
		
			
			
		}
		
		
		
			
	}

}}
