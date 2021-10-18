package oneTomany_manytoOne_BFBF;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Batch {
	@Id
	private int batchid;
	private int batchno;
	private String bname;
	
	
	@OneToMany(cascade=CascadeType.ALL)
	private Set<Faculty> f=new HashSet<>();
	
	@OneToMany(cascade=CascadeType.ALL)
	private Set<BackupFaculty>bckup=new HashSet<>();

	public int getBatchid() {
		return batchid;
	}

	public void setBatchid(int batchid) {
		this.batchid = batchid;
	}

	public int getBatchno() {
		return batchno;
	}

	public void setBatchno(int batchno) {
		this.batchno = batchno;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public Set<Faculty> getF() {
		return f;
	}

	public void setF(Set<Faculty> f) {
		this.f = f;
	}

	public Set<BackupFaculty> getBckup() {
		return bckup;
	}

	public void setBckup(Set<BackupFaculty> bckup) {
		this.bckup = bckup;
	}
	
	

}
