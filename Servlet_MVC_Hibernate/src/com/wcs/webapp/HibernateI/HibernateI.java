package com.wcs.webapp.HibernateI;

import java.util.List;

import com.wcs.webapp.model.Employee;

public interface HibernateI {
	void saveEmloyee(Employee emp);
	List<Employee>loginEmployee(String uname, String password);
	List<Employee> getAllEmployee();
	
	Employee updateEmployee(Employee emp);
	Employee editEmployee(String userid);
	void deleteEmployee(String userid);
	
	
}
