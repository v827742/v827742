package com.braindatawire.institutemanagementsystem.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Faculty {
	@Id
	@Column(name="Faculty_Id")
	private int fid;
	@Column(name="Faculty_Name")
	private String fname;
	
	@ManyToMany(cascade=CascadeType.ALL)
	 Set<Course> fcourse=new HashSet<>();
	
	public Set<Course> getFcourse() {
		return fcourse;
	}
	public void setFcourse(Set<Course> fcourse) {
		this.fcourse = fcourse;
	}
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

}
