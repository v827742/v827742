package com.braindatawire.institutemanagement_system.serviceImpl;


import java.util.Scanner;

import org.hibernate.Session;

import com.braindatawire.institutemanagement_system.config.HibernateUtil;
import com.braindatawire.institutemanagementsystem.model.Batch;
import com.braindatawire.institutemanagementsystem.model.Course;
import com.braindatawire.institutemanagementsystem.model.Faculty;
import com.braindatawire.institutemanagementsystem.model.Student;
import com.braindatawire.institutemanagementsystem.service.ServiceI;

public class Operation implements ServiceI{
	 Session s=HibernateUtil.getsessionFactory().openSession();
	Scanner sc=new Scanner(System.in);
	@Override
	public void addCourse() {
	
		
		Course c=new Course();
		System.out.println("---------------------------------------------");
		Session s=HibernateUtil.getsessionFactory().openSession();
		System.out.println("ENTER COURSE ID:");
		int id=sc.nextInt();
		c.setCid(id);
		System.out.println("ENTER COURSE NAME:");
		String name=sc.next();
		c.setCname(name);
		
		s.save(c);
		s.beginTransaction().commit();
		System.out.println("successfully inserted");
		System.out.println("---------------------------------------------");
		}
	
	
	@Override
	public void viewCourse() {
		System.out.println("---------------------------------------------");
		Session s=HibernateUtil.getsessionFactory().openSession();
		System.out.println("Enter Course Id");
		int cid=sc.nextInt();
		
		Course crs=s.get(Course.class, cid);
		System.out.println("COURSE ID: "+crs.getCid());
		System.out.println("COURSE NAME: "+crs.getCname());
		System.out.println("---------------------------------------------");
	}

	@Override
	public void addFaculty() {
		System.out.println("---------------------------------------------");
		Faculty f=new Faculty();
		 System.out.println("ENETR FACULTY ID:");
		 int fid=sc.nextInt();
		 System.out.println("ENTER FACULTY NAME:");
		 String fname=sc.next();
		 f.setFid(fid);
		 f.setFname(fname);
		 System.out.println("Enter which course Assign for faculty:-");
			int cid=sc.nextInt();
			Course crs=s.get(Course.class, cid);
			 f.setCourse(crs);
			 System.out.println("---------------------------------------------");
		 s.save(f);
		 s.beginTransaction().commit();
		 System.out.println("successfully inserted");
		 System.out.println("---------------------------------------------");
			
			}
			
		
		
		 
		

	@Override
	public void viewFaculty() {
		System.out.println("---------------------------------------------");
		System.out.println("Enetr Facylty Id");
		int fid=sc.nextInt();
		System.out.println("---------------------------------------------");
		Faculty flt=s.get(Faculty.class, fid);
		System.out.println("FACULTY ID :"+flt.getFid());
		System.out.println("FACULTY NAME :"+flt.getFname());
		System.out.println("COURSE ID: "+flt.getCourse().getCid());
		System.out.println("COURSE NAME: "+flt.getCourse().getCname());
		System.out.println("---------------------------------------------");
	}

	@Override
	public void addBatch() {
		
	     Batch b=new Batch();
	     System.out.println("---------------------------------------------");
		System.out.println("ENTER BATCH ID:");
		int bid=sc.nextInt();
		b.setBid(bid);
		System.out.println("ENTER BATCH NAME");
		String name=sc.next();
		b.setBname(name);
		System.out.println("Enetr which Facylty  Assign for Batch:-");
		int fid=sc.nextInt();
	
		Faculty flt=s.get(Faculty.class, fid);
		b.setFaculty(flt);
		System.out.println("---------------------------------------------");
		s.save(b);
		s.beginTransaction().commit();
		
		System.out.println("successfully inserted");
		System.out.println("---------------------------------------------");
	}



	@Override
	public void viewBatch() {
		System.out.println("---------------------------------------------");
		System.out.println("Enter Batch Id");
		int bid=sc.nextInt();
	
		Batch bt=s.get(Batch.class, bid);
		System.out.println("---------------------------------------------");
		System.out.println("BATCH ID: "+bt.getBid());
		System.out.println("BATCH NAME: "+bt.getBname());
        System.out.println("FACULTY ID :"+bt.getFaculty().getFid());
        System.out.println("FACULTY NAME :"+bt.getFaculty().getFname());
        System.out.println("COURSE ID: "+bt.getFaculty().getCourse().getCid());
        System.out.println("COURSE NAME: "+bt.getFaculty().getCourse().getCname());	
        System.out.println("---------------------------------------------");
		
	}

	@Override
	public void addStudent() 
	{
		Session s1=HibernateUtil.getsessionFactory().openSession();
		Student s=new Student();
		
		System.out.println("---------------------------------------------");
		System.out.println("ENTER STUDENT ID:");
		int sid=sc.nextInt();
		s.setSid(sid);
		System.out.println("ENTER STUDENT NAME");
		String sname=sc.next();
		s.setSname(sname);
		
		System.out.println("Enter which batch Assign for student:-");
         int bid=sc.nextInt();
         Batch bt=s1.get(Batch.class, bid);
         s.setBatch(bt);
         System.out.println("---------------------------------------------");
 		s.setBatch(bt);
 		s1.save(s);
 		s1.beginTransaction().commit();
         
 		System.out.println("successfully inserted");
		
 		System.out.println("---------------------------------------------");
		
		}

	@Override
	public void viewStudent() {
		Session s=HibernateUtil.getsessionFactory().openSession();
		System.out.println("----------------------------------------------------");
		System.out.println("Enter Student Id");
		int sid=sc.nextInt();
	    System.out.println("------------------------------------------------------");
		Student stu=s.get(Student.class, sid);
		System.out.println("STUDENT ID: "+stu.getSid());
		System.out.println("STUDENT NAME: "+stu.getSname());
		System.out.println("BATCH ID: "+stu.getBatch().getBid());
        System.out.println("BATCH NAME: "+stu.getBatch().getBname());
        System.out.println("FACULTY ID :"+stu.getBatch().getFaculty().getFid());
        System.out.println("FACULTY NAME :"+stu.getBatch().getFaculty().getFname());
        System.out.println("COURSE ID: "+stu.getBatch().getFaculty().getCourse().getCid());
        System.out.println("COURSE NAME: "+stu.getBatch().getFaculty().getCourse().getCname());
		System.out.println("---------------------------------------------");
	}

}



