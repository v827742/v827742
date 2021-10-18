package CollectionSet;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
	private int emid;
	private String emname;
	private double emsalary;
	public int getEmid() {
		return emid;
	}
	public void setEmid(int emid) {
		this.emid = emid;
	}
	public String getEmname() {
		return emname;
	}
	public void setEmname(String emname) {
		this.emname = emname;
	}
	public double getEmsalary() {
		return emsalary;
	}
	public void setEmsalary(double emsalary) {
		this.emsalary = emsalary;
	}
	@Override
	public int compareTo(Employee em) {
		// TODO Auto-generated method stub
		return this.emid-em.emid;
		//return this.emname.compareTo(em.emname);
		//return (int)(this.emsalary-em.emsalary);
		
	}
	
	
	
	

}
