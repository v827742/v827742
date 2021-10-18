package hibernate.relation.bidir.cfbs;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Batch {
	@Id
	private int bid;
	private String bname;
	
    @OneToOne(cascade=CascadeType.ALL)
	private Faculty faculty;

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFlt(Faculty flt) {
		this.faculty = flt;
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
