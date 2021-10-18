package com.braindatawire.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.braindatawire.DaoUtil.DaoUtil;
import com.braindatawire.serviceI.ServiceI;

public class ServiceImpl implements ServiceI{
	Scanner sc=new Scanner(System.in);

	@Override
	public void insertData() {
		
		Connection con=DaoUtil.getconnection();
		try {
		System.out.println("Enter NO OF COLLEGE YOU WANT TO INSERT DAETAILS");
		int no=sc.nextInt();
		for(int i=1;i<=no;i++)
		{
				System.out.println("Enter College ID:");
				int cno=sc.nextInt();
				System.out.println("Enter College Name:");
				String cname=sc.next();
				System.out.println("Enter College Address:");
				String addr=sc.next();
			
		
		String sql="insert into college values(?,?,?)";
		
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setInt(1,cno);
			ps.setString(2, cname);
			ps.setString(3, addr);
			
			ps.execute();
			System.out.println("Data insert succsessfuly:"+ps);
			ps.close();
			
		}
		con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public void updateData() {
		
		
		Connection con=DaoUtil.getconnection();
		try {
		System.out.println("ENTER NO OF COLLEGE YOU WANT TO UPDATE IN TABLE");
		int no=sc.nextInt();
		for(int i=1;i<=no;i++)
		{
				System.out.println("Enter college ID:");
				int cid=sc.nextInt();
				System.out.println("Enter college Name:");
				String cname=sc.next();
				System.out.println("Enter college Address:");
				String addr=sc.next();
			
		
		String sql="update college set college_name=?,Address=? where idcollege=? ";
		
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setString(1,cname);
			ps.setString(2, addr);
			ps.setInt(3, cid);
			
			ps.executeUpdate();
			System.out.println("Data update succsessfuly:"+ps);
			ps.close();
			
		}
		con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	@Override
	public void selectData() {
		
		Connection con=DaoUtil.getconnection();
		
         String sql="select * from college";
         
         try {
			PreparedStatement ps=con.prepareStatement(sql);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println("College ID: "+rs.getInt(1));
			
				System.out.println("College NAME: "+rs.getString(2));
				
				System.out.println("College ADDRESS: "+rs.getString(3));
				
				System.out.println("--------------------------");
			}
			rs.close();
			con.close();
			ps.close();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
         @Override
     	public void deleteData() 
         {
     		
     		Connection con=DaoUtil.getconnection();
     		System.out.println("ENTER COLLEGE ID YOU WANT TO DELETE FROM TABLE");
     		int no=sc.nextInt();
     		for(int i=1;i<=no;i++)
     		{
     		System.out.println("ENTER ID FOR DELETE");
     		int id=sc.nextInt();
     		
             String sql="delete from college where idcollege="+id+"";
             
             try {
     			PreparedStatement ps=con.prepareStatement(sql);
     			
     			//ps.setInt(1, id);
     			ps.execute();
     			System.out.println("Delete data Successfully:"+ps);
     			
     			ps.close();
     			} catch (SQLException e) {
     		
     			e.printStackTrace();
     		}
            
     		}
     		 
     	}
     }
     


		
	

	