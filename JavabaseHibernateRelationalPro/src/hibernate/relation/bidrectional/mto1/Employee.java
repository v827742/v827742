package hibernate.relation.bidrectional.mto1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@Column(name="Employee_ID")
	private int empId;
	
	@Column(name="Employee_Name")
	private String name;
	
	private String designation;
	
	
	
	
	
	
	

}
