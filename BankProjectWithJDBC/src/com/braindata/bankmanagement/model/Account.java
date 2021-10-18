package com.braindata.bankmanagement.model;

public class Account {
	private String AccNo;
	private String Name;
	private String mobNo;
	private String adharNo;
	private String gender;
	private int age;
	private double balance;
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


