package com.cjc;


import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Student {
	@Id
	private int rollno;
	
	private int age;
	

	private String name;
	
	private String addr;
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
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
	
	
	

}
