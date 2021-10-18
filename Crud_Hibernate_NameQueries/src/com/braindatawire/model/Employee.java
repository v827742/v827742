package com.braindatawire.model;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
@NamedQueries({
@NamedQuery(name="update_emp_details",query="update Employee set Emp_name=:enm,"
		+ "Emp_Desg=:edeg,location=:adr,Emp_salary=:esalary "
		+ "where Emp_Id=:eid"),
  @NamedQuery(name="Fetch_data",query="from Employee"),
  @NamedQuery(name="delete_Emp_datails",query="delete from Employee where Emp_Id=:empid")
})

@Entity
public class Employee {
@Id
private int Emp_Id;
private String Emp_name;
private String Emp_Desg;
private String location;
private double Emp_salary;
public int getEmp_Id() {
	return Emp_Id;
}
public void setEmp_Id(int emp_Id) {
	Emp_Id = emp_Id;
}
public String getEmp_name() {
	return Emp_name;
}
public void setEmp_name(String emp_name) {
	Emp_name = emp_name;
}
public String getEmp_Desg() {
	return Emp_Desg;
}
public void setEmp_Desg(String emp_Desg) {
	Emp_Desg = emp_Desg;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public double getEmp_salary() {
	return Emp_salary;
}
public void setEmp_salary(double emp_salary) {
	Emp_salary = emp_salary;
}
}