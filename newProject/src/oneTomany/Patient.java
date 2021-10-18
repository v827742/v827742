package oneTomany;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Patient {
     @Id
	private int bed_id;
	
	private String p_name;
	
	private String p_addr;
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Doctor dr;


	public int getBed_id() {
		return bed_id;
	}


	public void setBed_id(int bed_id) {
		this.bed_id = bed_id;
	}


	public String getP_name() {
		return p_name;
	}


	public void setP_name(String p_name) {
		this.p_name = p_name;
	}


	public String getP_addr() {
		return p_addr;
	}


	public void setP_addr(String p_addr) {
		this.p_addr = p_addr;
	}


	public Doctor getDr() {
		return dr;
	}


	public void setDr(Doctor dr) {
		this.dr = dr;
	}
	
	
}
