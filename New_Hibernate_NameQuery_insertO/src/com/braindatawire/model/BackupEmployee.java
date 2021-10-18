package com.braindatawire.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@NamedQuery(name="insert",query="INSERT INTO BackupEmployee(Emp_Id, Emp_name, Emp_Desg,location,Emp_salary)"+" SELECT Emp_Id, Emp_name, Emp_Desg,location,Emp_salary FROM Employee") 

@Entity
public class BackupEmployee {
	
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
	@Id
	private int Emp_Id;
	private String Emp_name;
	private String Emp_Desg;
	private String location;
	private double Emp_salary;


}
