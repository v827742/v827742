package com.braindatawire.ServiceImpl;

import java.util.Scanner;

import org.hibernate.Session;

import com.braindatawire.hibernateutil.HibernateUtil;
import com.braindatawire.model.Employee;
import com.braindatawire.serviceI.ServiceI;

public class ServiceImpl implements ServiceI{
	Scanner sc=new Scanner(System.in);
	@Override
	public void insertData() {
		Session s=HibernateUtil.getsessionFactory().openSession();
		System.out.println("ENTER NO OF EMPLOYEE FOR INSERT DETAILS INTO THE TABLE ");
		int no=sc.nextInt();
		for(int i=1;i<=no;i++)
		{
			System.out.println("ENTER EMPLOYEE ID");
			int empid=sc.nextInt();
			System.out.println("ENTER EMPLOYEE NAME");
			String name=sc.next();
			System.out.println("ENTER EMPLOYEE DESIGNATION");
			String design=sc.next();
			System.out.println("ENTER EMPLOYEE SALARY");
			double sal=sc.nextDouble();
			Employee emp=new Employee();
			
			emp.setEmp_Id(empid);
			emp.setEmp_name(name);
			emp.setEmp_Desg(design);
			emp.setEmp_salary(sal);
			
			s.save(emp);
			s.beginTransaction().commit();
		}
		
	}

	@Override
	public void updateData() 
	{
		Session s=HibernateUtil.getsessionFactory().openSession();
		System.out.println("ENTER NO OF EMPLOYEE FOR UPDATE DETAILS FROM TABLE ");
		int no=sc.nextInt();
		for(int i=1;i<=no;i++)
		{
			System.out.println("ENTER EMPLOYEE ID");
			int empid=sc.nextInt();
			System.out.println("ENTER EMPLOYEE NAME");
			String name=sc.next();
			System.out.println("ENTER EMPLOYEE DESIGNATION");
			String design=sc.next();
			System.out.println("ENTER EMPLOYEE SALARY");
			double sal=sc.nextDouble();
			Employee emp=s.get(Employee.class, empid);
			
			
			emp.setEmp_name(name);
			emp.setEmp_Desg(design);
			emp.setEmp_salary(sal);
			
			s.update(emp);
			s.beginTransaction();
			s.getTransaction().commit();
		}
		
		
	}

	@Override
	public void selectData() {
		
		Session s=HibernateUtil.getsessionFactory().openSession();
		System.out.println("ENTER NO OF EMPLOYEE  FOR FETCH DATA FROM TABLE ");
		int no=sc.nextInt();
		for(int i=1;i<=no;i++)
		{
			System.out.println("ENTER EMPLOYEE ID FOR FETCH DATA");
			int empid=sc.nextInt();
			Employee emp=s.get(Employee.class, empid);
			
			System.out.println("Employee Id: "+emp.getEmp_Id());
			System.out.println("Employee Name:"+emp.getEmp_name());
			System.out.println("Employee Designation: "+emp.getEmp_Desg());
			System.out.println("Employee Salary: "+emp.getEmp_salary());
			System.out.println("-----------------------");
			
			
		}
		
		
		
	}

	@Override
	public void deleteData() {
		Session s=HibernateUtil.getsessionFactory().openSession();
		System.out.println("ENTER NO OF EMPLOYEE DELETE DETAILS INTO THE TABLE ");
		int no=sc.nextInt();
		for(int i=1;i<=no;i++)
		{
			System.out.println("ENTER EMPLOYEE ID FOR DELETE");
			int empid=sc.nextInt();
			Employee emp=s.get(Employee.class, empid);
			
			s.beginTransaction();
			s.delete(emp);
			s.getTransaction().commit();
			
		}
		
		
	}
	

}
