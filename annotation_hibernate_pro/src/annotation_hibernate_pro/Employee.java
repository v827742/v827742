package annotation_hibernate_pro;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int Emp_Id;
	private String Emp_name;
	private String Emp_designation;
	public String getEmp_designation() {
		return Emp_designation;
	}
	public void setEmp_designation(String emp_designation) {
		Emp_designation = emp_designation;
	}
	private String Emp_Email;
	private String Emp_Address;
	private double Emp_Salary;
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
	public String getEmp_Email() {
		return Emp_Email;
	}
	public void setEmp_Email(String emp_Email) {
		Emp_Email = emp_Email;
	}
	public String getEmp_Address() {
		return Emp_Address;
	}
	public void setEmp_Address(String emp_Address) {
		Emp_Address = emp_Address;
	}
	public double getEmp_Salary() {
		return Emp_Salary;
	}
	public void setEmp_Salary(double emp_Salary) {
		Emp_Salary = emp_Salary;
	}
	
	
	

}
