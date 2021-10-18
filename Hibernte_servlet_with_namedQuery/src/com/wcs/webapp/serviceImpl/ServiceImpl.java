package com.wcs.webapp.serviceImpl;

import java.util.List;

import com.wcs.webapp.HibernateI.HibernateI;
import com.wcs.webapp.HibernateImpl.HibernateImpl;
import com.wcs.webapp.model.Employee;
import com.wcs.webapp.serviceI.ServiceI;

public class ServiceImpl implements ServiceI{
     HibernateI hi=new HibernateImpl();
	@Override
	public void saveEmloyee(Employee emp) {
	      hi.saveEmloyee(emp);
		
	}

	@Override
	public List<Employee> loginEmployee(String uname, String password) {
		List<Employee> list=hi.loginEmployee(uname, password);
		return list;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> list=hi.getAllEmployee();
		return list;
	}

	@Override
	public Employee updateEmployee(Employee emp) {

		Employee emp1=hi.updateEmployee(emp);
		
		return emp1;
	}

	@Override
	public Employee editEmployee(String userid) {
	
		Employee emp=hi.editEmployee(userid);
		
		return emp;
	}

	@Override
	public void deleteEmployee(String userid) {
		hi.deleteEmployee(userid);
		
	}
    
	
}
