package namedQueries;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
    @NamedQueries({
  @NamedQuery(name="all_Stu",query="from Student"),
	@NamedQuery(name="one_Stu",query="from Student where rollno=:rno"),
	@NamedQuery(name="update_stu",query="update Student set name=:nm where rollno=:id"),
	@NamedQuery(name="delete_stu",query="delete from Student where rollno=:idno")
	})
@Entity
public class Student {
	
	@Id
	private int rollno;
	private String name;
	private String addr;
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
