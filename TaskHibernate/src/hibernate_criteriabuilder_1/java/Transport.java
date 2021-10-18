package hibernate_criteriabuilder_1.java;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Transport {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Transport_Id")
	private int t_id;
	@Column(name="Transport_Name")
	private String t_name;
	@Column(name="Establishmentb_year")
	private String est_year;
	
   @OneToMany(cascade=CascadeType.ALL,mappedBy="tport")
   private Set<VehicleInfo> tvinfo=new HashSet<>();

public int getT_id() {
	return t_id;
}

public void setT_id(int t_id) {
	this.t_id = t_id;
}

public String getT_name() {
	return t_name;
}

public void setT_name(String t_name) {
	this.t_name = t_name;
}

public String getEst_year() {
	return est_year;
}

public void setEst_year(String est_year) {
	this.est_year = est_year;
}

public Set<VehicleInfo> getTvinfo() {
	return tvinfo;
}

public void setTvinfo(Set<VehicleInfo> tvinfo) {
	this.tvinfo = tvinfo;
}
   
}
