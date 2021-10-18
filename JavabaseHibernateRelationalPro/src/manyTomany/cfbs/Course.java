package manyTomany.cfbs;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
    @Id
	private int cid;
	
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	private String cname;
}
