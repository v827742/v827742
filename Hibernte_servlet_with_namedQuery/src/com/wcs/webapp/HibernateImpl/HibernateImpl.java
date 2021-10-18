package com.wcs.webapp.HibernateImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.wcs.webapp.HibernateI.HibernateI;
import com.wcs.webapp.model.Employee;

import HibernateUtil.HibernateUtil;

public class HibernateImpl implements HibernateI{

	@Override
	public void saveEmloyee(Employee emp) {
		
	Session	s=HibernateUtil.getsessionFactory().openSession();
		s.save(emp);
		s.beginTransaction().commit();
	}

	@Override
	public List<Employee> loginEmployee(String uname, String password) {
	
		List<Employee>list=new ArrayList<>();
		Session s=HibernateUtil.getsessionFactory().openSession();
		if(uname.equals("admin")&& password.equals("admin"))
		{
			
	Query<Employee> query=s.createNamedQuery("view_all_data",Employee.class);
	List<Employee> list1=query.getResultList();
	for(Employee emp:list1)
	{
		list.add(emp);	
	}
	        
		}
		else{
			Employee emp1=s.get(Employee.class, uname);
		
			
				list.add(emp1);
			
			}
		
		
		return list;
	}

	@Override
	public List<Employee> getAllEmployee() {
	List<Employee> list=new ArrayList<>();
			
		Session s=HibernateUtil.getsessionFactory().openSession();
		Query<Employee> query=s.createNamedQuery("view_all_data");
		List<Employee> list1=query.getResultList();
		{
			for(Employee emp:list1)
			{
				list.add(emp);
			}
		}
	
		
		return list;
	}

	@Override
	public Employee updateEmployee(Employee emp) {
	Session s=HibernateUtil.getsessionFactory().openSession();
	Transaction tx=s.beginTransaction();
		Query<Employee> query=s.createNamedQuery("update");
		query.setParameter("uid", emp.getUserid());
		query.setParameter("ps", emp.getPass());
		query.setParameter("nm", emp.getName());
		query.setParameter("adr", emp.getAddr());
		query.setParameter("email", emp.getEmail());
		
		
		
		
		query.executeUpdate();
		tx.commit();
           		
		return emp;
	}

	@Override
	public Employee editEmployee(String userid) {
	   
		Session s=HibernateUtil.getsessionFactory().openSession();
		Employee emp=s.get(Employee.class, userid);
	
		return emp;
	}

	@Override
	public void deleteEmployee(String userid) {
		Session s=HibernateUtil.getsessionFactory().openSession();
		Transaction tx=s.beginTransaction();
	
		Query<Employee> query=s.createNamedQuery("delete_data");
		query.setParameter("userid", userid);
		query.executeUpdate();
		tx.commit();
	}

}
