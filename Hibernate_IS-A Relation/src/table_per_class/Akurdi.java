package table_per_class;

import javax.persistence.Entity;

@Entity
public class Akurdi extends Cjc{
	
	private String weekendbatch;

	public String getWeekendbatch() {
		return weekendbatch;
	}

	public void setWeekendbatch(String weekendbatch) {
		this.weekendbatch = weekendbatch;
	}

}
