package many_to_one_to_many;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.OneToMany;

@Entity
public class Department {
    @Id
	private int dep_id;
    
	private String name;
	
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="dmt")
	Set<Employee> employee=new HashSet<>();


	public int getDep_id() {
		return dep_id;
	}


	public void setDep_id(int dep_id) {
		this.dep_id = dep_id;
	}


	public String getname() {
		return name;
	}


	public void setDep_name(String name) {
		this.name = name;
	}


	public Set<Employee> getEmployee() {
		return employee;
	}


	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}
}
