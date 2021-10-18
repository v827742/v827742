package manyTomany.cfbs;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Faculty {
    @Id
	private int fid;
	private String fname;
	@ManyToMany(cascade=CascadeType.ALL)
	//@JoinTable(name="Faculty_Course",joinColumns={@JoinColumn(name="fid")},inverseJoinColumns={@JoinColumn(name="cid")})
	Set<Course> scrs=new HashSet<>();
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public Set<Course> getScrs() {
		return scrs;
	}
	public void setScrs(Set<Course> scrs) {
		this.scrs = scrs;
	}
	
}
