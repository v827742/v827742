package com.braindatawire.institutemanagement_system.serviceImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.braindatawire.institutemanagement_system.config.DaoUtil;
import com.braindatawire.institutemanagementsystem.model.Batch;
import com.braindatawire.institutemanagementsystem.model.Course;
import com.braindatawire.institutemanagementsystem.model.Faculty;
import com.braindatawire.institutemanagementsystem.model.Student;
import com.braindatawire.institutemanagementsystem.service.ServiceI;

public class Operation implements ServiceI{
	
	Scanner sc=new Scanner(System.in);
	@Override
	public void addCourse() {
	
		
		Course c=new Course();
		Connection con=DaoUtil.getConnection();
		System.out.println("ENTER COURSE ID:");
		int id=sc.nextInt();
		c.setCid(id);
		System.out.println("ENTER COURSE NAME:");
		String name=sc.next();
		c.setCname(name);
		
		String sql="insert into course values("+c.getCid()+",'"+c.getCname()+"')";
		
		System.out.println("successfully inserted:"+sql);
		  try {
				Statement	smt = con.createStatement();
				smt.execute(sql);
				smt.close();
				con.close();
		  
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		}
	
	
	@Override
	public void viewCourse() {
	
		Connection con=DaoUtil.getConnection();
		
		String sql="select * from course";
		
		Statement smt;
		try {
			smt = con.createStatement();
			ResultSet rs=smt.executeQuery(sql);
             while(rs.next())
             {
            	 System.out.println("course id:"+rs.getInt(1));
            	 System.out.println("course name:"+rs.getString(2));
             }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

	@Override
	public void addFaculty() {
	
		Faculty f=new Faculty();
		try {
		 Connection con=DaoUtil.getConnection();
		 System.out.println("ENETR FACULTY ID:");
		 int fid=sc.nextInt();
		 System.out.println("ENTER FACULTY NAME:");
		 String fname=sc.next();
		 f.setFid(fid);
		 f.setFname(fname);
		 
		 System.out.println("Enter which Course Assign for faculty:-");
		 int id=sc.nextInt();
		 
		 String s="select * from course where idcourse="+id+"";
		  
		 Statement  smt1 = con.createStatement();
			 ResultSet r=smt1.executeQuery(s);
			while(r.next())
			{	
		           if(id==r.getInt(1))
		           {
		 String sql="insert into faculty values("+f.getFid()+",'"+f.getFname()+"',"+r.getInt(1)+",'"+r.getString(2)+"')";
			
			Statement smt=con.createStatement();
			smt.execute(sql);
			//smt.close();
			break;
		
			}
		           else{
		        	   System.out.println("invalid input please check course id ");
		        	   break;
		           }
	
			}
			
			
			
			//con.close();
			
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
		
		
		 
		}

	@Override
	public void viewFaculty() {
		Connection con=DaoUtil.getConnection();
		
		String s="select * from faculty";
		try {
			Statement smt=con.createStatement();
			
			ResultSet rs=smt.executeQuery(s);
			while(rs.next())
			{
				System.out.println("Faculty id:"+rs.getInt(1));
				System.out.println("Faculty Name:"+rs.getString(2));
				System.out.println("course ID:"+rs.getInt(3));
				System.out.println("course Name:"+rs.getString(4));
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void addBatch() {
		
	     Batch b=new Batch();
		Connection con=DaoUtil.getConnection();
		try {
		System.out.println("ENTER BATCH ID:");
		int bid=sc.nextInt();
		b.setBid(bid);
		System.out.println("ENTER BATCH NAME");
		String name=sc.next();
		b.setBname(name);
		
		
		System.out.println("Enter which faculty Assign for Batch:-");
		 int id=sc.nextInt();
		 
		String s="select *from faculty where idfaculty="+id+" ";
		Statement smt1=con.createStatement();
		
		ResultSet r=smt1.executeQuery(s);
		while(r.next())
		{
			 if(id==r.getInt(1))
	           {
	String sql="insert into batch values("+b.getBid()+",'"+b.getBname()+"',"+r.getInt(1)+",'"+r.getString(2)+"',"+r.getInt(3)+",'"+r.getString(4)+"')";
	
	
		Statement smt=con.createStatement();
		smt.execute(sql);
		break;
		
		}
			 else{
	        	   System.out.println("invalid input please check faculty id ");
	        	   break;
	           }
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
		
	}



	@Override
	public void viewBatch() {
	
		Connection con=DaoUtil.getConnection();
		
		String s="select * from batch";
		
		Statement smt;
		try {
			smt = con.createStatement();
			ResultSet rs=smt.executeQuery(s);
			
			while(rs.next())
			{
				System.out.println("Batch Id"+rs.getInt(1));
				System.out.println("Batch name"+rs.getString(2));
				System.out.println("Faculty id:"+rs.getInt(3));
				System.out.println("Faculty Name:"+rs.getString(4));
				System.out.println("course ID:"+rs.getInt(5));
				System.out.println("course Name:"+rs.getString(6));
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	@Override
	public void addStudent() {
		Student s=new Student();
		Connection con=DaoUtil.getConnection();
		try {
		System.out.println("ENTER STUDENT ID:");
		int sid=sc.nextInt();
		s.setSid(sid);
		System.out.println("ENTER STUDENT NAME");
		String sname=sc.next();
		s.setSname(sname);
		
		System.out.println("Enter which batch Assign for student:-");
         int id=sc.nextInt();

		String s1="select *from batch  where idbatch="+id+"";
		Statement smt1=con.createStatement();
		
		ResultSet r=smt1.executeQuery(s1);
		while(r.next())
		{
		         if(id==r.getInt(1))
		         {
String sql="insert into student values("+s.getSid()+",'"+s.getSname()+"',"+r.getInt(1)+",'"+r.getString(2)+"',"+r.getInt(3)+",'"+r.getString(4)+"',"+r.getInt(5)+",'"+r.getString(6)+"')";
		System.out.println("insert successfully:"+sql);
		
		
			Statement smt=con.createStatement();
			smt.execute(sql);
			//smt.close();
		}
		         else{
		 			System.out.println("invalid id please check batch id");
		 		}
			//con.close();
		}
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
	}

	@Override
	public void viewStudent() {
		
		Connection con=DaoUtil.getConnection();
	    String s="select *from student";
	    
	    try {
			Statement smt=con.createStatement();
			
			ResultSet rs=smt.executeQuery(s);
			
			while(rs.next())
			{
				System.out.println("Student id:"+rs.getInt(1));
				System.out.println("Student name:"+rs.getString(2));
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	    
		
	}

}
