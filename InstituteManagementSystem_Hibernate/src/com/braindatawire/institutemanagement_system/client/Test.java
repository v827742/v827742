package com.braindatawire.institutemanagement_system.client;

import java.util.Scanner;

import com.braindatawire.institutemanagement_system.serviceImpl.Operation;
import com.braindatawire.institutemanagementsystem.service.ServiceI;

public class Test {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	ServiceI si=new Operation();
	
	while(true){
	System.out.println("**********INSTITUTE-MANAGEMENT-SYSTEM***********");
	System.out.println( "PRESS-1 FOR ADD COURSE "+"  "+"PRESS-2 FOR VIEW COURSE");
	System.out.println( "PRESS-3 FOR ADD FACULTY"+"  "+"PRESS-4 FOR VIEW FACULTY");
	System.out.println( "PRESS-5 FOR ADD BATCH  "+"  "+"PRESS-6 FOR VIEW BATCH");
	System.out.println( "PRESS-7 FOR ADD STUDENT"+"  "+"PRESS-8 FOR VIEW STUDENT");
	System.out.println(  "PRESS-9 FOR EXIT");
	
	System.out.println("----------------ENTER YOUR CHOICE-------------------");
   int no=sc.nextInt();
   switch(no)
   {
   case 1:
	   si.addCourse();
	   break;
   case 2:
	   si.viewCourse();
	   break;
   case 3:
	   si.addFaculty();
	   break;
   case 4:
	   si.viewFaculty();
	   break;
   case 5:
	   si.addBatch();
	   break;
   case 6:
	   si.viewBatch();
	   break;
   case 7:
	   si.addStudent();
	   break;
   case 8:
	   si.viewStudent();
	   break;
   case 9:
	   System.out.println("Exit");
	   break;
	   default:
		   System.out.println("please enter valid number");
		   break;
		   
   }
}
}
}