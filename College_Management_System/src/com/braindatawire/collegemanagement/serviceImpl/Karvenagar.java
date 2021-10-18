package com.braindatawire.collegemanagement.serviceImpl;
import com.braindatawire.collegemanagement.service.*;
import java.util.*;
import com.braindatawire.collegemanagement.model.*;
public class Karvenagar implements Cjc{
	
	
	List<Course> clist=new ArrayList<>();
	List<Faculty> flist=new ArrayList<>();
	List<Batch> blist=new ArrayList<>();
	List<Student> slist=new ArrayList<>();
  Scanner sc=new Scanner(System.in);
	
  public void addCourse()
	{
		 
		Course c=new Course();
		 while(true)
		 {
			 Scanner sc=new Scanner(System.in);
	try{
		
		System.out.println("pelase enter your course id1:");
		int id=sc.nextInt();
		c.setCid(id);
		break;
	}
	catch(Exception e)
	{
		System.out.println("please enter valid input");
	}}
	
		while(true)
		{
			 Scanner sc1=new Scanner(System.in);
		System.out.println("pelase enter your course name 1:");
		String cname=sc1.next();
		boolean pattern=cname.matches("[A-Z]{1}[a-z]{0,30}");
		if(pattern==true){
		c.setCname(cname);
	break;
		}
		
		else{
	             System.out.println(" Enter valid input,please Start from Capital letter");	
	}
		
		}
	clist.add(c);
	System.out.println("Course data added Successfully");
	System.out.println("   ");
	
	}
		
		

	
	
	public void viewCourse()
	{
		
		
		Iterator<Course> itr=clist.iterator();
		while(itr.hasNext())
		{
			Course cou=itr.next();
			System.out.println("Course id:"+" "+cou.getCid());
			System.out.println("Course name:"+" "+cou.getCname());
		
		
			
		}
		if(clist.isEmpty()){
			System.out.println("data not found!  please first add data of Course ");
			addCourse();
		}
		
	}
	@Override
	public void addFaculty()
	{
	  System.out.println("enter course id");
      int i=sc.nextInt();
      Iterator<Course> itr=clist.iterator();
		while(itr.hasNext())
		{
			Course cou=itr.next();
			System.out.println("Course id:"+" "+cou.getCid());
			//System.out.println("Course name:"+" "+cou.getCname());
		int ciid=cou.getCid();
		
			
		
	if(ciid==i)
	{
		Faculty f=new Faculty();
		while(true)
		{
			Scanner sc=new Scanner(System.in);
		
	try{
	System.out.println("please enter your faculty id 1:");
	int faid=sc.nextInt();
	f.setFid(faid);
	break;
	}
	catch(Exception e)
{
	System.out.println("please enter valid input");
}
	}
	while(true)
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("please enter your faculty name 1:");
	String fname=sc.next();
	boolean pattern=fname.matches("[A-Z][a-z]{0,20}");
	if(pattern==true){
	f.setFname(fname);
	break;
	}
	else{
		System.out.println("faculty name Should be start from alphabet letters");
	}
	}

   Iterator<Course> itr1=clist.iterator();
	while(itr1.hasNext())
	{
		Course cou1=itr1.next();
	f.setCourse(cou1);
	
	}
	
	flist.add(f);
	System.out.println("Faculty data Added successfully");
	System.out.println(" ");
	}
	else
	{
		System.out.println("enter valid course id");
		addFaculty();
		}
	}
	
	
	}
	
	@Override
	public void viewFaculty() {
		Iterator<Faculty> itr=flist.iterator();
		while(itr.hasNext())
		{
			Faculty fac=itr.next();
			
				System.out.println("Faculty id:"+" "+fac.getFid());
			System.out.println("Faculty name:"+" "+fac.getFname());
			System.out.println(" ");
			viewCourse();
			}   
		if(flist.isEmpty())
		{
			System.out.println("no data found ! Please add Faculty data first");
			addFaculty();
		}
			 if(clist.isEmpty())
			{
				 System.out.println("data not found ! please first Add data of coures");
			        addCourse();
			}
		}
		
		
	
	
	@Override
	public void addBatch() {
		
		System.out.println("Enter Course Id");
		int newcid=sc.nextInt();
		
		Iterator<Course> itr=clist.iterator();
		while(itr.hasNext())
		{
			Course cou=itr.next();
			System.out.println("Course id:"+" "+cou.getCid());
			//System.out.println("Course name:"+" "+cou.getCname());
		
		
			int cid1=cou.getCid();
			
			if(cid1==newcid)
			{
		
		Batch b=new Batch();
		while(true)
		{
			Scanner sc=new Scanner(System.in);
		
		try{
		System.out.println("enter your batch id");
		String bid=sc.next();
		boolean pattern1=bid.matches("[A-Z]{1}([0-9]{0,15})");
		if(pattern1==true)
		{
		b.setBid(bid);
		break;
		}
		else{
			System.out.println("please enetr first letter in capital ");
		}
		}
		catch(Exception e){
			System.out.println("please Enter valid input");
		}
		}
		while(true)
		{
			Scanner sc1=new Scanner(System.in);
		
		System.out.println("enter your batch name");
		String bname=sc1.next();
		boolean pattern=bname.matches("[A-Z]{1}[a-z]{0,15}");
		if(pattern==true)
		{
		b.setBname(bname);
		break;
		}
		else{
			System.out.println("First letter Should be Capital letter or letters enter less than 15");
		     
		}
		}
		
		
		Iterator<Faculty> itr3=flist.iterator();
		while(itr3.hasNext())
		{
			Faculty fac1=itr3.next();
			b.setFaculty(fac1);
		}
				
		blist.add(b);
		System.out.println("Batch data added successfully");
		System.out.println("  ");
		
		}
			else{
				System.out.println("invalid Courde Id! please Enter Correct Course Id");
			     addCourse();
			}
		}
	}
	
	@Override
	public void viewBatch() {
    Iterator<Batch>itr4=blist.iterator();
      while(itr4.hasNext())
      {
    	  Batch batch=itr4.next();
    	  System.out.println("Batch id is:"+" "+batch.getBid());
    	  System.out.println("Batch name is:"+" "+batch.getBname());
    	  System.out.println(" ");
    	   viewFaculty();
    	   
      }
      if(blist.isEmpty())
      {
    	  System.out.println("no data fount! please first Add Batch data");
    	  addBatch();
      }
      if(flist.isEmpty())
      {
    	  System.out.println("no data fount! please first Add Faculty data");
    	  addFaculty();
      }
      if(clist.isEmpty())
      {
    	  System.out.println("no data fount! please first Add Course data");
    	  addCourse();
      }
	}
	
	@Override
	public void addStudent() {
		
		System.out.println("Enter Course ID");
		int newcid=sc.nextInt();
		Iterator<Course> itr=clist.iterator();
		while(itr.hasNext())
		{
			Course cou=itr.next();
			System.out.println("Course id:"+" "+cou.getCid());
			//System.out.println("Course name:"+" "+cou.getCname());
		int oldcid=cou.getCid();
		
			if(oldcid==newcid)
			{
		Student st=new Student();
		while(true)
		{
			Scanner sc=new Scanner(System.in);
		try{
			
		System.out.println("please enter Student id:");
		int stu=sc.nextInt();
		st.setSid(stu);
		break;
		}
		catch(Exception e)
		{
			System.out.println("please enter valid input");
			addStudent();
		}
		}
		while(true)
		{
			Scanner sc1=new Scanner(System.in);
		System.out.println("please enter Student name:");
		String sname=sc1.next();
		boolean pattern=sname.matches("[A-za-z]{0,25}");
		if(pattern==true)
		{
		st.setSname(sname);
		break;
		}
		else{
			System.out.println("please enter only alphabets,numbers not supported");
		}
		}
		Iterator<Batch> itr5=blist.iterator();
		while(itr5.hasNext())
		{
			Batch stu1=itr5.next();
			st.setBatch(stu1);
		}
		
		slist.add(st);
		System.out.println("Student data added Successfully");
	}
			else{
				System.out.println("Missmatch Course id please eneter correct Id");
				addCourse();
			}
		}
			}
		
		
		
	
	@Override
	public void viewStudent() {
		
		
		Iterator<Student> itr6=slist.iterator();
		while(itr6.hasNext())
		{
			Student stud=itr6.next();
			System.out.println("Student id is:"+" "+stud.getSid());
			System.out.println("student name is:"+" "+stud.getSname());
			System.out.println(" ");
			viewBatch();
			
	}
		if(slist.isEmpty())
		{
			 System.out.println("no data found! please first Add Student data");
	    	  addStudent();
		}
		if(blist.isEmpty())
	      {
	    	  System.out.println("no data found! please first Add Batch data");
	    	  addBatch();
	      }
	      if(flist.isEmpty())
	      {
	    	  System.out.println("no data found! please first Add Faculty data");
	    	  addFaculty();
	      }
	      if(clist.isEmpty())
	      {
	    	  System.out.println("no data found! please first Add Course data");
	    	  addCourse();
	      }
	}
		

}
