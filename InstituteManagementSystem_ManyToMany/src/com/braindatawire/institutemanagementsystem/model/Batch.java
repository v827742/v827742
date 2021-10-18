package com.braindatawire.institutemanagementsystem.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Batch {
	@Id
	@Column(name="Batch_Id")
	private int bid;
	@Column(name="Batch_Name")
	private String bname;
	
	@ManyToMany(cascade=CascadeType.ALL)
	Set <Faculty> bfaculty=new HashSet<>();
	public Set<Faculty> getBfaculty() {
		return bfaculty;
	}
	public void setFaculty(Set<Faculty> bfaculty) {
		this.bfaculty = bfaculty;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	
}
