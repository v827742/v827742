package hibernate.relation.bidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class AccountB {
	
	@Id
	private int acno;
	private String name;
	private String addr;
	@OneToOne(cascade=CascadeType.ALL,mappedBy="acb")
	private AccountPlus1 acp;
	
	
	public AccountPlus1 getAcp() {
		return acp;
	}
	public void setAcp(AccountPlus1 acp) {
		this.acp = acp;
	}
	public int getAcno() {
		return acno;
	}
	public void setAcno(int acno) {
		this.acno = acno;
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
