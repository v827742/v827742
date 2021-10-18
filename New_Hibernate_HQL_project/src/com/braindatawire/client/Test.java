package com.braindatawire.client;
import java.util.Scanner;


import com.braindatawire.serviceI.ServiceI;
import com.braindatawire.serviceimpl.ServiceImpl;



public class Test {
	
	public static void main(String[] args) {
                 
					ServiceI si=new ServiceImpl();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("*********CRUD-HIBERNATE-PROJECT**********");
		System.out.println("------------------------------");
		System.out.println("PRESS-1 FOR INSERT DATA");
		System.out.println("PRESS-2 FOR UPDATE DATA");
		System.out.println("PRESS-3 FOR DISPLAY DETAILS ");
		System.out.println("PRESS-4 FOR DELETE DATA");
		System.out.println("PRESS-5 FOR EXIT");
		System.out.println("------------------------------");
		
		int no=sc.nextInt();
		
		switch(no)
		{
		case 1:
			si.insertData();
			break;
		case 2:
			si.updateData();
			break;
		case 3:
			si.selectData();
			break;
		case 4:
			
			si.deleteData();
			break;
		case 5:
			System.out.println("Exit");
			System.exit(0);
			default:
					System.out.println("Please enetr valid input");
				
			
		}
		}
	}
	}


