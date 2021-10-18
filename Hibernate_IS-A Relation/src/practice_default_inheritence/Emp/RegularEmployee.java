package practice_default_inheritence.Emp;

import javax.persistence.Entity;


@Entity
public class RegularEmployee extends Employee{
   
	private float salary;
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
private int bonus;

}
