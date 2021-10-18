package hibernate.relation.unidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AccountPlus {
	@Id
	private int acpid;
	private double amount;
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
	
	

}
