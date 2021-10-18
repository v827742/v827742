package hibernate_criteriabuilder_1.java;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class VehicleInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="vehicle_Id")
	private int v_id;
	@Column(name="Vehicle_name")
	private String vname;
	
	@Column(name="reg_No")
	private String reg_no;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Transport tport;

	public int getV_id() {
		return v_id;
	}

	public void setV_id(int v_id) {
		this.v_id = v_id;
	}

	public String getReg_no() {
		return reg_no;
	}

	public void setReg_no(String reg_no) {
		this.reg_no = reg_no;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public Transport getTport() {
		return tport;
	}

	public void setTport(Transport tport) {
		this.tport = tport;
	}
	
	
	
	
	
	

}
