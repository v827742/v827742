package practice.default_inheritence;

import javax.persistence.Entity;

@Entity
public class TwoWheeler extends Vehicle{

	
	public String getSteeringType() {
		return SteeringType;
	}

	public void setSteeringType(String steeringType) {
		SteeringType = steeringType;
	}

	private String SteeringType;
}
