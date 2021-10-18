package hibernate.relation.bidirectional.MTO_OTM;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	@Id
	@Column(name="emp_Id")
	private int empid;
	@Column(name="emp_name")
	private String name;
	private String designation;
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="D_id")
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


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public Department getDept() {
		return dept;
	}


	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	
	
	
	
	
	
	
	
	
}
