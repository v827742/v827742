package com.braindatawire.ServiceImpl;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

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
			
			System.out.println("ENTER EMPLOYEE LOCATION");
			String loc=sc.next();
			
			System.out.println("ENTER EMPLOYEE SALARY");
			double sal=sc.nextDouble();
			Employee emp=new Employee();
			
			emp.setEmp_Id(empid);
			emp.setEmp_name(name);
			emp.setLocation(loc);
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
			System.out.println("ENTER EMPLOYEE LOCATION");
			String loc=sc.next();
			System.out.println("ENTER EMPLOYEE SALARY");
			double sal=sc.nextDouble();
			Transaction tx=s.beginTransaction();
Query<Employee> query=s.createNativeQuery("update Employee set Emp_name=:nm ,"
		+ "Emp_Desg=:deg,location=:jloc,Emp_salary=:sal where Emp_Id=:eid");
			query.setParameter("eid", empid);
			query.setParameter("nm", name);
			query.setParameter("deg", design);
			query.setParameter("jloc", loc);
			query.setParameter("sal", sal);
			query.executeUpdate();
			tx.commit();
			
		}
		
		
	}

	@Override
	public void selectData() {
		Session s=HibernateUtil.getsessionFactory().openSession();

Query<Employee>query=s.createNativeQuery(" select * from  Employee ",Employee.class);
			
			List<Employee> list=query.getResultList();
			for(Employee emp:list)
			{
			System.out.println("Employee Id: "+emp.getEmp_Id());
			System.out.println("Employee Name:"+emp.getEmp_name());
			System.out.println("Employee Designation: "+emp.getEmp_Desg());
			System.out.println("EMPLOYEE JOB LOCATION: "+emp.getLocation());
			System.out.println("Employee Salary: "+emp.getEmp_salary());
			System.out.println("-----------------------");
			}}
		public void deleteData() {
		Session s=HibernateUtil.getsessionFactory().openSession();
		System.out.println("ENTER NO OF EMPLOYEE DELETE DETAILS INTO THE TABLE ");
		int no=sc.nextInt();
		for(int i=1;i<=no;i++)
		{
			System.out.println("ENTER EMPLOYEE ID FOR DELETE");
			int empid=sc.nextInt();
			Transaction tx=s.beginTransaction();
Query<Employee>query=s.createQuery("delete from Employee where Emp_Id=:eid");
			query.setParameter("eid", empid);
			
			query.executeUpdate();
			
			tx.commit();      }}}
