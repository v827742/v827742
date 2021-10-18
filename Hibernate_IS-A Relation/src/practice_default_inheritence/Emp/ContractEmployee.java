package practice_default_inheritence.Emp;

import javax.persistence.Entity;


@Entity
public class ContractEmployee extends Employee{

	private float payperhour;
	public float getPayperhour() {
		return payperhour;
	}
	public void setPayperhour(float payperhour) {
		this.payperhour = payperhour;
	}
	public String getContractduration() {
		return contractduration;
	}
	public void setContractduration(String contractduration) {
		this.contractduration = contractduration;
	}
	private String contractduration;

}
