package manyTomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import many_to_man_bidirectional.Course;

@Entity
public class Student {
@Id
private int rollno;
@Column(nullable=false)
private String sname;
@Column(nullable=false)
private String addr;


@ManyToMany(cascade=CascadeType.ALL)
@JoinTable(name="student_course",joinColumns={@JoinColumn(name="rollno")},
inverseJoinColumns={@JoinColumn(name="Cid")})
private Set<Course> scourse=new HashSet<>();


public void setScourse(Set<Course> scourse) {
	this.scourse = scourse;
}


public int getRollno() {
	return rollno;
}


public void setRollno(int rollno) {
	this.rollno = rollno;
}


public String getSname() {
	return sname;
}


public void setSname(String sname) {
	this.sname = sname;
}


public String getAddr() {
	return addr;
}


public void setAddr(String addr) {
	this.addr = addr;
}


public Set<Course> getScourse() {
	return scourse;
}





}
