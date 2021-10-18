package hibernate_criteria_builder;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Department_ID")
	private int did;
	@Column(name="Department_name")
	private String dname;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="dept")
	private Set<Employee> demp=new HashSet<>();

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Set<Employee> getDemp() {
		return demp;
	}

	public void setDemp(Set<Employee> demp) {
		this.demp = demp;
	}
	

}
