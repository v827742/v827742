package com.wcs.webapp.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import com.wcs.webapp.DaoI.DaoI;
import com.wcs.webapp.DaoUtil.DaoUtil;

import com.wcs.webapp.model.Employee;

public class DaoImpl implements DaoI{

	@Override
	public Employee updateEmployee(Employee emp) {
		
		Connection con = DaoUtil.getconnection();

		try {
			Statement smt = con.createStatement();
			String sql = "update employee set name='" + emp.getName() + "',address='" +
			emp.getAddr() + "',email='" + emp.getEmail()
			+ "' where userid='" + emp.getUserid() + "'  ";
	
			smt.execute(sql);
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return emp;
	}
	    @Override
		public Employee editEmployee(String userid)
	    {
	    	Employee emp=new Employee();
	    	Connection con=DaoUtil.getconnection();
	    	try {
	    		Statement smt=con.createStatement();
	    		
	    		String sql="select * from employee where userid='"+userid+"'";
	    		ResultSet rs=smt.executeQuery(sql);
	    		while(rs.next())
	    		{
	    		
	    			emp.setUserid(rs.getString(1));
	    			emp.setPass(rs.getString(2));
	    			emp.setName(rs.getString(3));
	    			emp.setAddr(rs.getString(4));
	    			emp.setEmail(rs.getString(5));
	    			
	    		}
	    			} catch (SQLException e) {
	    		// TODO Auto-generated catch block
	    		e.printStackTrace();
	    	}

	    	return emp;
	    }
		
	

	@Override
	public void deleteEmployee(String userid) {
		Connection con=DaoUtil.getconnection();
	    String sql="delete from employee where userid='"+userid+"'";
	    try {
			Statement smt=con.createStatement();
			
			smt.execute(sql);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void saveEmloyee(Employee emp) {
		
		Connection con=DaoUtil.getconnection();
		try {
			
			String sql="insert into employee values(?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, emp.getUserid());
			ps.setString(2, emp.getPass());
			ps.setString(3, emp.getName());
			ps.setString(4, emp.getAddr());
			ps.setString(5, emp.getEmail());
			
			ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public List<Employee> loginEmployee(String uname, String password) {
		
		List<Employee> list=new ArrayList<Employee>();
		
		if(uname.equals("admin") && password.equals("admin"))
		{
			Connection con=DaoUtil.getconnection();
			try {
				Statement ps=con.createStatement();
				
				String sql="select * from employee";
				ResultSet rs=ps.executeQuery(sql);
				while(rs.next())
				{
					Employee emp=new Employee();
					emp.setUserid(rs.getString(1));
					
					emp.setPass(rs.getString(2));
					
					emp.setName(rs.getString(3));
					
					emp.setAddr(rs.getString(4));
					
					emp.setEmail(rs.getString(5));
					
					list.add(emp);
					
					
				}
				
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else {
			Connection con=DaoUtil.getconnection();
			Employee emp=new Employee();
		try{
			Statement ps=con.createStatement();
			
			String query="select * from employee where userid='"+uname+"'&& "
					+ "password='"+password+"' ";
			
			ResultSet rs=ps.executeQuery(query);
			while(rs.next())
			{	
				emp.setUserid(rs.getString(1));	
				emp.setPass(rs.getString(2));
				
				emp.setName(rs.getString(3));
				
				emp.setAddr(rs.getString(4));
				
				emp.setEmail(rs.getString(5));
				
			}
			list.add(emp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		return list;
		
		
		
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		List<Employee> list=new ArrayList<Employee>();
		Connection con=DaoUtil.getconnection();
		try {
			Statement ps=con.createStatement();
			String sql="select * from employee";
			ResultSet rs=ps.executeQuery(sql);
			
			while(rs.next())
			{
				Employee emp=new Employee();
				emp.setUserid(rs.getString(1));
				
				emp.setPass(rs.getString(2));
				
				emp.setName(rs.getString(3));
				
				emp.setAddr(rs.getString(4));
				
				emp.setEmail(rs.getString(5));
				
				list.add(emp);
				}
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
