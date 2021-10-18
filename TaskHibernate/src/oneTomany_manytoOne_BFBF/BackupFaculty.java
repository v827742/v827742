package oneTomany_manytoOne_BFBF;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BackupFaculty {
	@Id
	private int backupfid;
	private String bname;
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Batch batch;


	public int getBackupfid() {
		return backupfid;
	}


	public void setBackupfid(int backupfid) {
		this.backupfid = backupfid;
	}


	public String getBname() {
		return bname;
	}


	public void setBname(String bname) {
		this.bname = bname;
	}


	public Batch getBatch() {
		return batch;
	}


	public void setBatch(Batch batch) {
		this.batch = batch;
	}


}
