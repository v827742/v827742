package com.wcs.webapp.DaoI;

import java.util.List;

import com.wcs.webapp.model.Employee;

public interface DaoI {
	
	Employee updateEmployee(Employee emp);
	Employee editEmployee(String userid);
	
	void deleteEmployee(String userid);
	void saveEmloyee(Employee emp);
	List<Employee>loginEmployee(String uname, String password);
	List<Employee> getAllEmployee();
	
}
