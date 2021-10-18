package many_to_one_to_many;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Employee {
	@Id
	private int emp_id;
	@Column(nullable=false)
	private String emp_name;
	@Column(nullable=false)
	private String emp_desig;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Department emp=new Department();

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_desig() {
		return emp_desig;
	}

	public void setEmp_desig(String emp_desig) {
		this.emp_desig = emp_desig;
	}

	public Department getEmp() {
		return emp;
	}

	public void setEmp(Department emp) {
		this.emp = emp;
	}
	
	

}
