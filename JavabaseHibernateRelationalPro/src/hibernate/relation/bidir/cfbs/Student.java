package hibernate.relation.bidir.cfbs;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
    @Id
	private int sid;
	private String sname;
	
	@OneToOne(cascade=CascadeType.ALL)
     private Batch Batch; 
	
	public Batch getBatch() {
		return Batch;
	}
	public void setBatch(Batch batch) {
		Batch = batch;
	}
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
	

	
	
	
	
	
}
