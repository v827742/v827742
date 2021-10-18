package com.braindatawire.institutemanagementsystem.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Student {
	@Id
	@Column(name="Student_Id")
	private int sid;
	@Column(name="Student_Name")
	private String sname;
	@ManyToMany(cascade=CascadeType.ALL)
	Set <Batch> sbatch=new HashSet<>();
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
	public Set<Batch> getSbatch() {
		return sbatch;
	}
	public void setBatch(Set<Batch> sbatch) {
		this.sbatch = sbatch;
	}

	

}
