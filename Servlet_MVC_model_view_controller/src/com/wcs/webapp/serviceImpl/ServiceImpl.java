package com.wcs.webapp.serviceImpl;

import java.util.List;

import com.wcs.webapp.DaoI.DaoI;
import com.wcs.webapp.DaoImpl.DaoImpl;

import com.wcs.webapp.model.Employee;
import com.wcs.webapp.serviceI.ServiceI;

public class ServiceImpl implements ServiceI{
     DaoI dao=new DaoImpl();
	@Override
	
	public Employee updateEmployee(Employee emp) {
		
		Employee emp1=dao.updateEmployee(emp);
		
		return emp1;	
	}
	 @Override
		public Employee editEmployee(String user)
	    {
			Employee emp=dao.editEmployee(user);
			
		 return emp; 	
	    }
	@Override
	public void deleteEmployee(String userid) {
		
		dao.deleteEmployee(userid);
	}
	@Override
	public void saveEmloyee(Employee emp) {
	
		dao.saveEmloyee(emp);
	}
	@Override
	public List<Employee> loginEmployee(String uname, String password) {
		
		List<Employee> list=dao.loginEmployee(uname, password);
		
		return list;
	}

	@Override
	public List<Employee> getAllEmployee() {
	      List<Employee> list=dao.getAllEmployee();
		return list;
	}

}
