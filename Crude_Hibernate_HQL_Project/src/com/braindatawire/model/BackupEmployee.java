package com.braindatawire.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BackupEmployee {
	@Id
	private int eid;
	
	private String ename;
	private String eaddr;
	private long mono;
	private String email;
	
	

}
