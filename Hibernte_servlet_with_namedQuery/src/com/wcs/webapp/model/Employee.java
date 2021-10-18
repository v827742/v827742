package com.wcs.webapp.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
@NamedQueries({
@NamedQuery(name="update",query="update Employee set pass=:ps,name=:nm,addr=:adr,email=:email where userid=:uid"),
@NamedQuery(name="view_all_data",query="from Employee"),
@NamedQuery(name="delete_data",query="delete Employee where userid=:userid")

})
@Entity
public class Employee {
	@Id
	private String userid;
	private String pass;
	private String name;
	private String addr;
    private String email;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}