package com.braindatawire.institutemanagement_system.client;

import java.util.Scanner;

import com.braindatawire.institutemanagement_system.serviceImpl.Operation;
import com.braindatawire.institutemanagementsystem.service.ServiceI;

public class Test {
	public static void main(String[] args) {
		
		                      ServiceI allm=new Operation();
		while(true)
		{
					Scanner sc=new Scanner(System.in);
					
					System.out.println("****INSTITUTE****MANAGEMENT****SYSTEM****");
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
		
			allm.addCourse();
			break;
		
		case 2:
		
			allm.viewCourse();
			break;
		
		case 3:
		
			allm.addFaculty();
			break;
		
		case 4:
		
			allm.viewFaculty();
			break;
		case 5:
			allm.addBatch();
			break;
		case 6:
			allm.viewBatch();
			break;
		case 7:
			allm.addStudent();
			break;
		case 8:
			allm.viewStudent();
			break;
		case 9:
		
			System.exit(0);
			break;
		default:
		
			System.out.println("please enter correct input no");
		
			
			
		}
			
		}
	}

}
