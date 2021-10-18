package is_A_Join_relation;

import javax.persistence.Entity;

@Entity
public class Karvenager extends Cjc{
	
	private String regularbatch;

	public String getRegularbatch() {
		return regularbatch;
	}

	public void setRegularbatch(String regularbatch) {
		this.regularbatch = regularbatch;
	}

}
