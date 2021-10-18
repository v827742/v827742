package practice_Emp_SingleTable;

import javax.persistence.Entity;

@Entity
public class RegularEmployee extends Company{

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	private float salary;
	
	private int bonus;
}
