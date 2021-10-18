package oneTomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Doctor {
	@Id
	private int d_id;
	
	private String d_name;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Set<Patient> dp=new HashSet<>();

	public int getD_id() {
		return d_id;
	}

	public void setD_id(int d_id) {
		this.d_id = d_id;
	}

	public String getD_name() {
		return d_name;
	}

	public void setD_name(String d_name) {
		this.d_name = d_name;
	}

	public Set<Patient> getDp() {
		return dp;
	}

	public void setDp(Set<Patient> dp) {
		this.dp = dp;
	}
	

}
