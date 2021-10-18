package practice_Table_Per_Class;

import javax.persistence.Entity;

@Entity
public class FourWheeler extends Vehicle{
	
	private String SteeringType;

	public String getSteeringType() {
		return SteeringType;
	}

	public void setSteering(String steering) {
		SteeringType = steering;
	}

}
