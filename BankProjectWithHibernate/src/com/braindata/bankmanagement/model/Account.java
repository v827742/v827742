package com.braindata.bankmanagement.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Account {
	@Id
	private String AccNo;
	private String Name;
	private String mobNo;
	private String adharNo;
	private String gender;
	private int age;
	private double balance;
	@OneToOne(cascade=CascadeType.ALL)
	private Sbibank sb;
	public Sbibank getSb() {
		return sb;
	}
	public void setSb(Sbibank sb) {
		this.sb = sb;
	}
	public String getAccNo() {
		return AccNo;
	}
	public void setAccNo(String AccNo) {
		this.AccNo = AccNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public String getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(String s) {
		this.adharNo = s;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	}


