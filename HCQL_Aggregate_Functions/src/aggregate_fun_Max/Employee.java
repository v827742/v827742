package aggregate_fun_Max;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee {

	public String getDegignation() {
		return degignation;
	}

	public void setDegignation(String degignation) {
		this.degignation = degignation;
	}

	@Id

	@Column(name="Employee_ID")
	private int empid;
	
	@Column(name="Employee_NAME")
	private String name;
	@Column(name="Employee_ADDRESS")
	private String addr;
	@Column(name="Employee_Desig")
	private String degignation;
	private double salary;
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@ManyToOne(cascade=CascadeType.ALL)
	private Department dept;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	
}
