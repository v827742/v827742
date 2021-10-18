package ComparebleComparetor;

import java.util.Comparator;

public class EmSalarySort implements Comparator<Employee>{

	
	public int compare(Employee emsalary1, Employee emsalary2) {
		
		return (int)(emsalary1.getEmsalary()-emsalary2.getEmsalary());
	}

}
