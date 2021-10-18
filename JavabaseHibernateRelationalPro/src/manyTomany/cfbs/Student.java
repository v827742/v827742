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
public class Student {
    @Id
	private int sid;
	private String sname;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="Student_Batch",joinColumns={@JoinColumn(name="sid")},inverseJoinColumns={@JoinColumn(name="bid")})
	Set<Batch> batch = new HashSet<>();

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Set<Batch> getBatch() {
		return batch;
	}

	public void setBatch(Set<Batch> batch) {
		this.batch = batch;
	}
	
	
}
