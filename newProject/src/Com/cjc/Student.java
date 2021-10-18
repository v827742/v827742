package Com.cjc;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Student {
	@Id
	private int id;
	private int age;
     private String name;
	 private String addr;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
 
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
