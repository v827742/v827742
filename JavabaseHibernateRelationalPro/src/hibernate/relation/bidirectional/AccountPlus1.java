package hibernate.relation.bidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class AccountPlus1 {
	@Id
	private int acpid;
	private double amount;
	
	@OneToOne(cascade=CascadeType.ALL)
	private AccountB acb;
	
	
	public int getAcpid() {
		return acpid;
	}

	public void setAcpid(int acpid) {
		this.acpid = acpid;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public AccountB getAc() {
		return acb;
	}

	public void setAc(AccountB ac) {
		this.acb = ac;
	}

	

}
