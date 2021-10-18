package com.wcs.webapp.serviceI;

import java.util.List;

import com.wcs.webapp.model.Employee;

public interface ServiceI {

	Employee updateEmployee(Employee emp);
	Employee  editEmployee(String userid);
	
	void deleteEmployee(String eid);
	void saveEmloyee(Employee emp);
	List<Employee>loginEmployee(String uname, String password);
	List<Employee> getAllEmployee();
	
}
